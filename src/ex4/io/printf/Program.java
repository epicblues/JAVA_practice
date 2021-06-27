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
		avg =(float)(total / 3.0);  // 정수인 total을 double인 3.0으로 나누어서 실수로 만든 다음에 그것을 
//									avg라는 float(4바이트)에 저장하기 위해서 다시 float 형식으로 변환?

//		------------------ 성적 출력 구분 ---------------------
		
		System.out.println("⎧⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎫");	// 자동으로 문자열 마지막애 \n 명령어를 삽입해준다.
		System.out.println("⎪    \"성적 출력\"    ⎪");  // Quotation Mark를 사용하고 싶을 때 활용하는 escape button
		System.out.println("⎪                 ⎪");
		System.out.println("⎩⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎭");

		System.out.printf("%1$d, %1$d, %1$d \n", 123); // 원래는 각 지정자에 할당되는 실제 값이 있어야 하나 index를 지정하면 여러 지정자를 하나의 값으로 출력 가능
		
		
		System.out.printf("국어1 : %3d\n",kor1);
		System.out.printf("국어2 : %3d\n", kor2);
		System.out.printf("국어3 : %3d\n", kor3);
		System.out.printf("총점 : %3d\n", total);
		System.out.printf("평균 : %6.2f\n", avg);
		System.out.println("⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽");
		
		System.out.print(80); //숫자 그대로 나온다. 숫자 80을 문자 80으로 바꿔서 출력.
		System.out.write(80); //코드값으로 인식.
		System.out.flush(); 
 

	}
}