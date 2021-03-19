import java.util.Scanner;

public class ArrayTest {
	
	public static void main(String[] args){

		int[] a=new int[9];
		Scanner scn=new Scanner(System.in);
		System.out.print("k");
		int k=scn.nextInt();
		System.out.print("a");
		for(int c=0;c<9;c++){
			a[c]=scn.nextInt();
		}
		// int k=3;
		// int[] a ={1,2,3,4,5,6,7};
		int length=a.length;
		int[] b=new int[length];
		for (int i=0;i<a.length-k;i++){
			b[k+i]=a[i];
		}
		for(int j=0;j<k;j++){
			b[k-1-j]=a[a.length-j-1];
		}
		for(int x:b){
		System.out.print(x);
		}

	}
		
}