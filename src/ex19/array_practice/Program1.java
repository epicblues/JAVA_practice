package ex19.array_practice;

import java.util.Scanner; // 매번 java.util.Scanner라 입력하는 것을 피하기 위해 사

public class Program1 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		for (int i=0; i<7;i++) {
			System.out.printf("%d ",nums[i]);
		}
		System.out.println();
		int [] temp = new int[10]; // 넉넉한 공간 마련
		for (int i=0; i<7;i++) {
			temp[i] = nums[i];
		}
		temp[7] = 8;
		nums = temp; // 기존의 nums는 참조되지 않으므로 garbage화 된다.
		for (int i=0; i<8;i++) {
			System.out.printf("%d ",nums[i]);
		}
		
		
		}
	}
