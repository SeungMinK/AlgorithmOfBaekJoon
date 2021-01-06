package N_11399;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int N,size,i,sum=0,temp=0;;
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		
		int []array = new int[N];
		size=array.length;
		
		for(i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		
		Arrays.sort(array);
		
		for(i=0;i<size;i++) {
			
			sum+=array[i];
			temp+=sum;
		}
		System.out.println(temp);
		
	}
}
