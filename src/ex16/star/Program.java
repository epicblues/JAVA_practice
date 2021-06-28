 package ex16.star;

 

 public class Program {
 	public static void main(String[] args) {
 		for (int j = 0 ; j <10; j++) {
	 		for (int i = 0 ; i <j+1; i++) {
	 			System.out.print("☆");
	 		}
	 		System.out.print("\n");
 		}
 		System.out.print("Another Example!\n");
 		for (int j = 0 ; j <10; j++) {
	 		for (int i = 0 ; i <10-j; i++) {
	 			System.out.print("☆");
	 		}
	 		System.out.print("\n");
 		}
 	}
 }