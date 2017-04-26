package practice01;

public class Prob2 {
	public static void main(String[] args) {
		//이중for문
		int row,column,sum;
		
		for(column=0;column<10;column++){ //세로줄
			for(row=1;row<11;row++){ //가로줄
				sum=row+column; // 숫자 연산
				System.out.print(" "+sum);
			}
			System.out.println();
		}
	}
}