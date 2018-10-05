import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Threads(1)
@Fork(1)
@Warmup(iterations=5, time=10)
@Measurement(iterations=10, time=15)
@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class MyBenchmark {

  @State(Scope.Thread)
  public static class ThreadState {

    @Param({"100", "1000", "10000", "50000"})
    int length;

    public ArrayList<Integer> arrayList;
    public LinkedList<Integer> linkedList;

    public int counter;

    @Setup
    public void init() {
      List<Integer> collect = IntStream.range(0, length).boxed().collect(Collectors.toList());
      arrayList = new ArrayList<>(collect);
      linkedList = new LinkedList<>(collect);
      counter = 0;
    }
  }

  @Benchmark
  public void arrayList(ThreadState state) {
    List<Integer> list = state.arrayList;
    int size = list.size();

    state.counter = (state.counter + 1) % size;
    int addIndex = state.counter;
    list.add(addIndex, 123);

    int removeIndex = size - addIndex;
    list.remove(removeIndex);
  }

  @Benchmark
  public void linkedList(ThreadState state) {
    List<Integer> list = state.linkedList;
    int size = list.size();

    state.counter = (state.counter + 1) % size;
    int addIndex = state.counter;
    list.add(addIndex, 123);

    int removeIndex = size - addIndex;
    list.remove(removeIndex);
  }
}
