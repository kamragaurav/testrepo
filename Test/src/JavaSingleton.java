import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ReflectPermission;
import java.security.*;


public class JavaSingleton {

  private static JavaSingleton INSTANCE = null;
  private static int count = 0;

  private JavaSingleton() {
    ReflectPermission perm = new ReflectPermission("suppressAccessChecks", "");
    AccessController.checkPermission(perm); 
    ++count;
    System.out.println("Singleton Constructor Running. Instance #" + count);
  }


  synchronized public static final JavaSingleton getInstance() {
    if (INSTANCE == null) {
      AccessController.doPrivileged(new PrivilegedAction<Object>() {
        public Object run() {
          INSTANCE= new JavaSingleton();
          return null;
        }
      });
    }
    return INSTANCE;
  }
  
  public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		Class<JavaSingleton> clazz = (Class<JavaSingleton>) Class.forName("JavaSingleton");
		Constructor<JavaSingleton>sin = clazz.getDeclaredConstructor();
		sin.setAccessible(true);
		System.out.println(sin.newInstance().hashCode());
		JavaSingleton too = JavaSingleton.getInstance();
      System.out.println(too.hashCode());
	}

}