import java.util.ArrayList;
import java.util.List;

public class Pattern1 {
	
	public static void printDiamond(int n) {
		int printValue=1;
		int[] printLocation;
		
		
		for(int i=1;i<=(n*2)-1;i++) {
			int temp = n;
			printLocation= new int[n*2];
			for(int pl = 0;pl<i;pl++) {
				if(i<=n) {
					if(temp-(i-1)<=n*2) {
						printLocation[temp-(i-1)]=i;  //1
					}else {
						printLocation[n*2-1]=i;
					}
					temp=temp+2;
				}else {
					
				}
				
			}
			for (int j = 0; j < printLocation.length; j++) {
				if(printLocation[j]==0) {
					System.out.print(" ");
				}else {
					System.out.print(printLocation[j]);
				}
				
			}
			System.out.println();
			
		}
	}
	
	public static void main(String[] args) {
		printDiamond(6);
	}

}
