package ex19.array_practice;

import java.util.Scanner; // 매번 java.util.Scanner라 입력하는 것을 피하기 위해 사

public class Program3 {
	public static void main(String[] args) {
		int[] nums = {5,2,7,4,6,1,3};
		int index = -1;
		for(int i=0;i<7;i++) {
			if (nums[i] == 1) {
				index = i;		
				break;
			}
		}
		System.out.printf("index is %d", index);
		
		}
	}
