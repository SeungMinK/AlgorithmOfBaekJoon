package N_11047;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		int N,K,i,coin=0;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();//���� ���� �Է�
		K = sc.nextInt();//��ǥ �ݾ�
		
		int []array = new int [N];//���� ���� ���� �迭 ������
		int size = array.length;
		for(i=0;i<size;i++) {
			//���� ��ġ ���� �������� �Է�
			array[i]=sc.nextInt();
		}
		
		for(i=size-1;i>=0;i--) {
			if(array[i]<=K) {//���� ������ ������
				coin += div(K,array[i]);//���� ���� � ��� ������
				K= remainder(K,array[i]);//���� �󸶳� ���Ҵ���
			}
		}
		System.out.println(coin);
		
	}

	private static int div(int k, int i) {
		// TODO Auto-generated method stub
		
		return k/i;
	}
	
	private static int remainder(int k, int i) {
		// TODO Auto-generated method stub
		
		return k%i;
	}
}
