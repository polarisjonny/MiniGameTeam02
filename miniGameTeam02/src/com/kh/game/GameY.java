package com.kh.game;

import java.util.Scanner;

public class GameY {
	
	public int num1 = (int)(Math.random()*3)+1;
	public int num2 = (int)(Math.random()*3)+1;
	
	Scanner sc = new Scanner(System.in);
	
	public int guguGameStart() {
		
		System.out.println("====구구단 게임(1~9단)====");
		System.out.println("정답이면 종료\n");
		
		int record = 0;
		
		while(true) {
			System.out.print(num1 + " X " + num2 + " = ");
			int userAnswer = sc.nextInt();
			
			int answer = num1*num2;
			
			if(userAnswer==answer) {
				System.out.println("정답\n");
				record += 50;
				return record;
			}else {
				System.out.println("땡\n");
			}
			
			
		}

	}

}
