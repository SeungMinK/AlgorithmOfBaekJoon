package N_2798;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int N,M,sum,i,j,k,temp=0,minus=30000;//N�� ī���� ���� M�� ����� �ϴ� ����
		int [] card;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();//ī�� ���� �Է�
		M = sc.nextInt();//������ϴ� ���� �Է�
		
		if((3<=N&&N<=100)&&(10<=M&&M<=300000)) {
		
			card = new int[N];//N�� ������ŭ ī�� ����
			for( i =0; i <card.length;i++) {
				card[i]= sc.nextInt();//ī���� ������ŭ ���� �Է�
				
			}
			for(i=0;i<card.length-2;i++) {
				for(j=i+1;j<card.length-1;j++) {
					for(k=j+1;k<card.length;k++) {
						sum=card[i]+card[j]+card[k];
					
						if(M==sum) {
							temp=sum;
							break;
						}
						if(temp<sum && sum<M) {
							temp = sum;
						}
						
						
					}
				}
			}
			sum=temp;
			System.out.println(sum);
		
		
		
		
		}
		
	
		

		
	}
	
}
