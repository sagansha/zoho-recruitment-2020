package com.nex.palindrom.service;

import java.util.Scanner;

public class ZohoRound1 {
	
	static int k =0;
	
	public static String b() {
		k++;
		return k+" ";
	}
	
	public static String c() {
		k--;
		return k+" ";
	}
	
	public static void snake(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (2 * n) - i; j++) {
				String str = (j <= n - i) ? " " : (i % 2 == 1) ? b() : c();
				System.out.print(str);
			}
			k += n;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = (new Scanner(System.in)).nextInt();
		snake(n);
	}

}
