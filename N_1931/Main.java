package N_1931;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int i,k,N,count;//N = ȸ�� ����
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();//ȸ�� ���� �Է� �ޱ�
		int [][] array = new int[N][2];//N*2���� 2���� �迭 �����
		int size = array.length;//�迭�� ����
		
		for(i=0;i<size;i++) {
			array[i][0]=sc.nextInt();//ȸ�� ���۽ð� �Է�
			array[i][1]=sc.nextInt();//ȸ�� ����ð� �Է�
		}
		
		Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] arg0, int[] arg1) {
                    if(arg0[1]==arg1[1]) return arg0[0]-arg1[0];
                     else{
      
                    return arg0[1] - arg1[1];//����ð� �������� ����
                    }
                  }
            
        });   
		
		   	int end = 0;
	         count = 0;
	        
	       
	        for( i=0; i<N; i++) {
	            if(array[i][0] >= end ) {
	                end = array[i][1];//������������ �����س��� ȸ�ǳ����� �ٷ� �����ϱ�
	                count++;
	            }
	        }
	        
	        System.out.println(count);

		
		
		
		
		
	}
}
