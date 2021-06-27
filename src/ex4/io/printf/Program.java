package ex4.io.printf;

public class Program {
	public static void main(String[] args) {

		int kor1, kor2, kor3;
		int total;
		float avg;

		kor1 = 50;
		 kor2 = 60;
		kor3 = 80;

		total = kor1 + kor2 + kor3;
		avg = total / 3;

//		------------------ 성적 출력 구분 ---------------------
		
		System.out.println("⎧⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎫");	// 자동으로 문자열 마지막애 \n 명령어를 삽입해준다.
		System.out.println("⎪    \"성적 출력\"    ⎪");  // Quotation Mark를 사용하고 싶을 때 활용하는 escape button
		System.out.println("⎪                 ⎪");
		System.out.println("⎩⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎭");

		
		System.out.printf("\t국어1 : %d\n",kor1);
		System.out.printf("\t국어2 : %d\n", kor2);
		System.out.printf("\t국어3 : %d\n", kor3);
		System.out.printf("\t총점 : %d\n", total);
		System.out.printf("\t평균 : %f\n", avg);
		System.out.println("⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽");
		
		System.out.print(80); //숫자 그대로 나온다. 숫자 80을 문자 80으로 바꿔서 출력.
		System.out.write(80); //코드값으로 인식.
		System.out.flush(); 
 

	}
}