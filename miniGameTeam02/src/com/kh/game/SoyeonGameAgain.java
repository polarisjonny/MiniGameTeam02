package com.kh.game;

import java.util.Scanner;

public class SoyeonGameAgain {
	
	public void againGame() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println();
		System.out.print("1~100 숫자 중 아무거나 입력하세요! > ");
		
		int answer = (int)(Math.random()*100+1);
		
		while(true) {
			int num = scanner.nextInt();
			
			if(num == answer) {
				System.out.println("      축하합니다~~~~정답입니다!"); break;
			} else if(num < answer) {
				System.out.println("     ㄴ UP!");
				System.out.print("     ㄴ 다시 입력 _ ");
			} else if(num > answer) {
				System.out.println("     ㄴ DOWN!");
				System.out.print("     ㄴ 다시 입력 _ ");
			}
		}
		System.out.println();
		System.out.println("다시 하시겠습니까?");
		System.out.println("1.다시하기 2.종료하기");
		
		int num = scanner.nextInt();
		
		switch(num) {
		case 1 : againGame(); break;
		case 2 : System.out.println("이용해주셔서 감사합니다."); break;
		}
	}

}
