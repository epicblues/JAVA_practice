 package ex11.control6.continue_break;

 import java.util.Scanner; // 매번 java.util.Scanner라 입력하는 것을 피하기 위해 사

 public class Program {
 	public static void main(String[] args) {
 		int n = 0;
 		int listNumber = 0;
 		
 		Scanner scan = new Scanner(System.in);
 		System.out.println( "값을 space로 구분해서 5개 이상 입력하세요.");
 		while (scan.hasNext()) {
 			n = scan.nextInt();
 			if(n <10) {
 				continue; // 아랫 문장을 피하고 반복.
 			}
 			if(n>200) {
 				break;
 			}
 			System.out.println(n);
 			listNumber++;
 		}
 		if (listNumber <=5) {
 			
 		}
 	}
 }