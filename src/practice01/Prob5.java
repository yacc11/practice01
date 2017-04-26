package practice01;

import java.util.Scanner;

public class Prob5 {
	public static void main(String[] args) {
		//문자로 본다 . "31"
		//integer = 문자열로 바꾸는 방법 
		
		//Scanner scanner = new Scanner( System.in );
		
		//int num = scanner.nextInt();
		int count=0; //박수 횟수
		int num; //게임의 숫자.
		//스트링으로 바꿔줌
		//System.out.println(s.length()); //
		//System.out.println(s.charAt(2));
		for(int j=1;j<999;j++) //숫자 999
		{
			num=j;//num으로 숫자 입력
			String s = String.valueOf(num); //숫자를 스트링으로 넘겨줌 한자리
			for(int i=0;i<s.length();i++){
				System.out.print(s.charAt(i));
					if(s.charAt(i)=='3'){ 
						count++; //박수 1번
					}
					else if(s.charAt(i)=='6'){
						count++; //박수 1번
					}
					else if(s.charAt(i)=='9'){
						count++; //박수 1번 
					}	
				}
				System.out.print(" ");
				for(int i=0;i<count;i++){ //박수 횟수까지 짝 진행
					System.out.print("짝");
				}
				System.out.println();
				count=0; //박수 횟수 초기화
		}
	}
}