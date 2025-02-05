package studio3;

import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("how many numbers you do you want to scan for primes? ");
		int n = in.nextInt();
		
		int[] numbers = new int[n];
		
		for(int i = 0; i < n; i++) {
			numbers[i] = i + 1;
		}
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		
		
		
		int i = 2;
		while(i < n/2) {
			for(int j = 2*i; j <= n; j += i) {
				numbers[j - 1] = 0;
			}
			i ++;
		}
		
		for(int k = 0; k < numbers.length; k++) {
			if(numbers[k] != 0) {
				System.out.println(numbers[k]);
			}
		}
		
	}
	

}
