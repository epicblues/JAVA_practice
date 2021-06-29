package ex17.test;

import java.util.Scanner; // 매번 java.util.Scanner라 입력하는 것을 피하기 위해 사

public class Program {
	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("반복 입력할 횟수를 지정하세요.\n");
			int x = scan.nextInt();
			
			for (int n = 1; n <= x; n++) 
				if (n%2 == 0) 
					if (!(n == x)) 
						System.out.printf(" ,");
					 else 
						System.out.printf("\n");
					
				else 
					if (!(n == x))  // 특별 경우
						if((x%2 == 0) && n == x-1) 
							System.out.printf("%c", 'A' + (n - 1) * 5); 
						else 
							System.out.printf("%c,", 'A' + (n - 1) * 5); // 수학시간에 배운 등차수열 스타일로 작성. 풀어쓰지 않는 이유 식의 이해를 돕기 위
					else 
						System.out.printf("%c\n", 'A' + (n - 1) * 5);
			}
			

		}
	}
