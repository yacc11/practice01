package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );
		
		int number = scanner.nextInt(); //숫자를 입력 받음.
		
		int i=0,j=0,count=0,sum=0; //i는 배수 , j는 배수를 늘려주는 수  , sum은 합계
		
		if(number%2==0)//짝수 판별
		{
			i=2; //짝홀 
			count=number/2-1; // 돌아가는 횟수
		}
		else if(number%2==1)//홀수 판별
		{
			i=1; //시작수
			count=number/2; //돌아가는 횟수
		}
		
		System.out.println("돌아갈 횟수는 :"+count);
		
		while(true){
			j++; //늘어나는 횟수
	
			sum=sum+i; //합
			
			i=i+2; //증가값
			if(j>count) //짝수.
			{
				System.out.print(sum);
				break;
			}
			
		}
	}
}