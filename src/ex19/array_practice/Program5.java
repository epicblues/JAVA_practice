package ex19.array_practice;


import java.util.Random;

public class Program5 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random rand = new Random();	// Random 클래스의 객체화.
		
		for(int i=0;i<6;i++) 
			lotto[i] = rand.nextInt(45)+1;//0부터 44까지 뽑아준다.(그 후 1 연산을 통해 유효 범위 챙기기)
		
		
		for(int i=0;i<6;i++) 
			System.out.printf("%d ",lotto[i]);
		
		
	}
	}
