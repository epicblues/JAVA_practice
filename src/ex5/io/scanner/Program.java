package ex5.io.scanner;

import java.util.Scanner; // 매번 java.util.Scanner라 입력하는 것을 피하기 위해 사

public class Program {
	public static void main(String[] args) {

		int kor1, kor2, kor3;
		int total;
		float avg;

		Scanner scan =  new Scanner(System.in);  // 직접 입력이 아닌 ctrl + shift + O 입력을 통한 java.util import
		
		kor1 = 0; // 기본값 설정
		kor2 = 0;
		kor3 = 0;
		
//		------------------ 성적 입력 구분 ---------------------

		System.out.println("⎧⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎫");	
		System.out.println("⎪    \"성적 입력\"    ⎪");  
		System.out.println("⎪                 ⎪");
		System.out.println("⎩⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎭");
		System.out.print("국어1 : ");
		kor1 = scan.nextInt(); //scan.nextInt() 는 호출된 후에 입력된 값을 결과로 '남긴다'
		System.out.print("국어2 : ");
		kor2 = scan.nextInt();
		System.out.print("국어3 : ");
		kor3 = scan.nextInt();
		

//		------------------ 성적 출력 구분 ---------------------
		
		total = kor1 + kor2 + kor3;
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