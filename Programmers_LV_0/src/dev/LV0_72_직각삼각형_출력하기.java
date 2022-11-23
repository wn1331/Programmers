package dev;

import java.util.Scanner;

public class LV0_72_직각삼각형_출력하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++) {
        	for(int j = 1;j<=i;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
		
	}

}
