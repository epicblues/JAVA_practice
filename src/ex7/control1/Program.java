package ex7.control1;

import java.util.Scanner; // 매번 java.util.Scanner라 입력하는 것을 피하기 위해 사

public class Program {
	public static void main(String[] args) {

		int kor1, kor2, kor3;
		int total;
		float avg;

		Scanner scan =  new Scanner(System.in);  
		
		kor1 = 0; // 기본값 설정
		kor2 = 0;
		kor3 = 0;
		
	 //------------------ 성적 입력 구분 ---------------------
		while (true) {
			System.out.println("⎧⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎫");	
			System.out.println("⎪    \"성적 입력\"    ⎪");  
			System.out.println("⎪                 ⎪");
			System.out.println("⎩⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎭");
			
			
			do {
				System.out.print("국어1 : ");
				kor1 = scan.nextInt(); 
				
				if (kor1 < 0 || 100 < kor1) {
					System.out.println("성적 범위(0~100)를 벗어났습니다.");
				}
			} while (kor1 < 0 || 100 < kor1 ); // 괄호 안이 true 면 다시 do로 넘어감.
			
			do {
				System.out.print("국어2 : ");
				kor2 = scan.nextInt(); 
				
				if (kor2 < 0 || 100 < kor2) {
					System.out.println("성적 범위(0~100)를 벗어났습니다.");
				}
			} while (kor2 < 0 || 100 < kor2 );
			
			do {
				System.out.print("국어3 : ");
				kor3 = scan.nextInt(); 
				
				if (kor3 < 0 || 100 < kor3) {
					System.out.println("성적 범위(0~100)를 벗어났습니다.");
				}
			} while (kor3 < 0 || 100 < kor3 );
			
	
	//------------------ 성적 출력 구분 ---------------------
			
			total = kor1+kor2+kor3;
			avg =(float)(total / 3.0); 
			
			System.out.println("⎧⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎫");	
			System.out.println("⎪    \"성적 출력\"    ⎪");  
			System.out.println("⎪                 ⎪");
			System.out.println("⎩⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎭");
			
			System.out.printf("국어1 : %3d\n",kor1);
			System.out.printf("국어2 : %3d\n", kor2);
			System.out.printf("국어3 : %3d\n", kor3);
			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽");
		}

	}
}