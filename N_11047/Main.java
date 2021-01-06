package N_11047;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		int N,K,i,coin=0;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();//동전 갯수 입력
		K = sc.nextInt();//목표 금액
		
		int []array = new int [N];//동전 갯수 만금 배열 새엇ㅇ
		int size = array.length;
		for(i=0;i<size;i++) {
			//동전 가치 오름 차순으로 입력
			array[i]=sc.nextInt();
		}
		
		for(i=size-1;i>=0;i--) {
			if(array[i]<=K) {//지폐가 돈보다 작으면
				coin += div(K,array[i]);//돈에 지폐 몇개 들어 가는지
				K= remainder(K,array[i]);//돈이 얼마나 남았는지
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
