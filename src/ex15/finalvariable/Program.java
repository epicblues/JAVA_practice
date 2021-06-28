 package ex15.finalvariable;

 import java.util.Scanner; // 매번 java.util.Scanner라 입력하는 것을 피하기 위해 사

 public class Program {
 	public static void main(String[] args) {

 		int[] kors = new int[3*3]; // 배열 객체 생성. 객체 생성은 무조건 new?
 		for (int j=0; j<3; j++) {
	 		for (int i = 0; i < 3; i++) {
	 			kors[3*j+i] = 0; // 2차 배열을 도입하기 이전의 표현 방식.
	 		}
 		}
 		
 		int total = 0;
 		final int MENU_INPUT = 1; // 일반 변수와 차이를 두기 위해 대문자 사용.
 		final int MENU_OUTPUT = 2;
 		final int MENU_EXIT = 3;
 		float avg;

 		Scanner scan =  new Scanner(System.in);  
 		
 		종료:
 		while (true) {
 			System.out.println("⎧⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎫");	
 			System.out.println("⎪    \"메인 메뉴\"    ⎪");  
 			System.out.println("⎪                 ⎪");
 			System.out.println("⎩⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎭");
 			System.out.println(" 1. 성적 입력");
 			System.out.println(" 2. 성적 출력");
 			System.out.println(" 3. 종료");
 			System.out.print(" 선택 > ");
 			int menu = scan.nextInt();
 			
 			switch(menu) {
 			
 			case MENU_INPUT: 
	 			//------------------ 성적 입력 구분 ---------------------
	 			System.out.println("⎧⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎫");	
	 			System.out.println("⎪    \"성적 입력\"    ⎪");  
	 			System.out.println("⎪                 ⎪");
	 			System.out.println("⎩⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎭");
		 		for(int j=0; j<3; j++) {
		 			for (int i=0; i < 3; i++) {
			 			do {
			 				System.out.printf("%d학년 국어%d : ",j+1,i+1);
			 				kors[3*j + i] = scan.nextInt(); 
			 				
			 				if (kors[3*j + i] < 0 || 100 < kors[3*j + i]) {
			 					System.out.println("성적 범위(0~100)를 벗어났습니다.");
			 				}
			 			} while (kors[3*j + i] < 0 || 100 < kors[3*j + i] ); // 괄호 안이 true 면 다시 do로 넘어감.
		 			}
		 		}
	 			break;
	 			
 			case MENU_OUTPUT: 
	 	
	 				//------------------ 성적 출력 구분 ---------------------
 				for(int j=0; j<3; j++) {
 					System.out.println("⎧⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎫");	
 		 			System.out.printf("⎪  \"%d학년 성적 출력\"  ⎪\n", j+1);  
 		 			System.out.println("⎪                 ⎪");
 		 			System.out.println("⎩⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎭");
 		 			
	 				for (int i = 0; i < 3; i++) {
	 			 		System.out.printf("%d학년 국어%d : %3d\n",j+1,i+1,kors[3*j+i]);
	 			 		total += kors[3*j+i];
	 		 		}
	 				
	 				avg =(float)(total / 3.0); 

	 				System.out.printf("총점 : %3d\n", total);
 		 			System.out.printf("평균 : %6.2f\n", avg);
 		 			System.out.println("⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽");
 		 			total = 0;
 				}
	 			
	 			break; //switch만 탈출 즉 while루프는 계속. 메인메뉴로 돌아간다.
 			
 			case MENU_EXIT:
 				System.out.println("프로그램을 종료합니다.");
 				
 				break 종료; //switch뿐만 아니라 while 루프까지 탈출
 			
 			default:
 				System.out.println("잘못된 입력입니다. 1~3만 입력 가능.");
 			}
 		}
 	}
 }