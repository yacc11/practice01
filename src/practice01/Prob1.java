package practice01;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );
		
		System.out.print("수를 입력하시오 : ");
		int number = scanner.nextInt();
		//3의 배수 판별 ex)129  = 3의 배수 입니다. 
		
		int i=3;//3의 배수 확인자 
		
		if(number%i==0){ //3의 배수에 나누어 떨어지면 3의 배수 확인.
			System.out.println("3의 배수 입니다. ");
		}
		else
		{
			System.out.println("3의 배수가 아닙니다.");
		}
		//System.out.println(number);
		scanner.close();
	}
}
