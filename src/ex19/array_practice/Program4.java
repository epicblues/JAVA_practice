package ex19.array_practice;

import java.util.Scanner; // 매번 java.util.Scanner라 입력하는 것을 피하기 위해 사

public class Program4 {
	public static void main(String[] args) {
		int[] nums = {3,2,6,4,1,5};
		for(int i=0;i<nums.length;i++) {
			System.out.printf("%d ",nums[i]);
		}
		System.out.println("");
		int temp;
		temp = nums[0];
		nums[0] = nums[2];
		nums[2] = temp;
		
		for(int i=0;i<nums.length;i++) {
			System.out.printf("%d ",nums[i]);
		}
				
		
	}
	}
