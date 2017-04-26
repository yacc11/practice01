package practice01;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		String str = scanner.nextLine(); // 입력 Bat Man
		int count=0; //문자 출력 순서
		//(str.length());
		//System.out.println(str.length()); //배트맨의 길이.
		//System.out.println(str); //입력된 문장 출력
		//System.out.println(str.charAt(2)); //문장의 자리수 출력
		for(int i=0;i<str.length();i++)
		{
			count++;//자리수 지정
			for(int j=0;j<count;j++)
			{
				System.out.print(str.charAt(j)); //자리수까지 출력.
			}
			System.out.println(); //다음 줄로 이동 
		}
		
		scanner.close();
	}
}