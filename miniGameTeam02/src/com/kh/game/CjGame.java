package com.kh.game;

import java.util.Scanner;

public class CjGame {
	public void Game() {
		
		System.out.println("===업 다운 게임===");
		
		Scanner sc = new Scanner(System.in);
		
		int com = (int)(Math.random()*100)+1;
		
		while (true) {
			
			System.out.println("1~100까지의 숫자를 입력하시오");
			int i = sc.nextInt();
			if(i<com) {
				System.out.println("upupupup!!");
			}else if (i>com) {
				System.out.println("downdown!!");
			}else {
				System.out.println("정답 입니다!!!"); break;
			}
		}
		
	}
}
