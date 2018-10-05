package dd;

public class Pattern1 {
public static void main(String[] args) {
drawDiamond(9);
}
private static void drawDiamond(int n) {
for (int i = 1; i <= n*2; i++) {
int subs=1;
int count=0;
for(int j=1; j <= n*2; j++) {
if(i<=n) {
if((j==(n-(i-subs))  && count<i)) {
System.out.print(i);
subs = subs+2;
++count;
}else {
System.out.print(" ");
}
}else if((j==(i-(n-subs))  && count<n-(i-n))){
System.out.print(n-(i-n));
subs = subs+2;
++count;
}else {
System.out.print(" ");
}
}
System.out.println();
}

}
}
