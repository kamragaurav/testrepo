
public class Shrey {
	
	public static void main(String[] args) {
		int n=7;
		
		for(int i=1;i<=n;i++) {
			int val = i;
			if(i!=1) {
			for(int j=1;j<=((i*2)-1);j++) {
				
				if(j>=i) {
					System.out.print(val--);
				}else {
					System.out.print(j);
				}
			}
			}
			if(i==1) {
				System.out.println(i);
			}else
			System.out.println();
			
		}
		
		
	}

}
