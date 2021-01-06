package N_1931;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int i,k,N,count;//N = 회의 개수
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();//회의 개수 입력 받기
		int [][] array = new int[N][2];//N*2개의 2차원 배열 만들기
		int size = array.length;//배열의 길이
		
		for(i=0;i<size;i++) {
			array[i][0]=sc.nextInt();//회의 시작시간 입력
			array[i][1]=sc.nextInt();//회의 종료시간 입력
		}
		
		Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] arg0, int[] arg1) {
                    if(arg0[1]==arg1[1]) return arg0[0]-arg1[0];
                     else{
      
                    return arg0[1] - arg1[1];//종료시간 기준으로 정렬
                    }
                  }
            
        });   
		
		   	int end = 0;
	         count = 0;
	        
	       
	        for( i=0; i<N; i++) {
	            if(array[i][0] >= end ) {
	                end = array[i][1];//오름차순으로 정렬해놔서 회의끝나면 바로 시작하기
	                count++;
	            }
	        }
	        
	        System.out.println(count);

		
		
		
		
		
	}
}
