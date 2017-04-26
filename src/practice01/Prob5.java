package practice01;

import java.util.Scanner;

public class Prob5 {
	public static void main(String[] args) {
		//문자로 본다 . "31"
		//integer = 문자열로 바꾸는 방법 
		
		//Scanner scanner = new Scanner( System.in );
		
		//int num = scanner.nextInt();
		int count=0;
		int num;
		//스트링으로 바꿔줌
		//System.out.println(s.length()); //
		//System.out.println(s.charAt(2));
		for(int j=1;j<999;j++)
		{
			num=j;
			String s = String.valueOf(num);
			for(int i=0;i<s.length();i++){
				System.out.print(s.charAt(i));
					if(s.charAt(i)=='3'){
						count++;
					}
					else if(s.charAt(i)=='6'){
						count++;
					}
					else if(s.charAt(i)=='9'){
						count++;
					}	
				}
				System.out.print(" ");
				for(int i=0;i<count;i++){
					System.out.print("짝");
				}
				System.out.println();
				count=0;
		}
	}
}