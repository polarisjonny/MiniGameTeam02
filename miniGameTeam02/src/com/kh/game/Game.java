package com.kh.game;
import java.util.Scanner;
public class Game {
	public void startGame() {
		printGameMenu();
		selectGame();
	}
	
	public void printGameMenu() {
		System.out.println("2조의 미니게임에 오신 것을 환영합니다~~");
	}
	
	public void selectGame() {
		while(true) {
			System.out.println("1. 업다운 게임 2. 가위바위보 게임 3. 구구단게임 4. 구구단게임2 5. 랜덤게임 0. 종료");
			System.out.print("게임을 선택해 주세요 : ");
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			
			if(num == 0) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
			switch(num) {
			case 1 : CjGame cjGame = new CjGame();
					 cjGame.Game();
					 break;
					 
			case 2 : GameRSP gameRSP = new GameRSP();
					 gameRSP.playGame();
					 break;
					 
			case 3 : GugudanGame gugudanGame = new GugudanGame();
					 gugudanGame.startGugudanGame();
					 break;
					 
			case 4 : GameY gameY = new GameY();
					 gameY.guguGameStart();
					 break;
					 
			case 5 : SoyeonGame soyeonGame = new SoyeonGame();
					 soyeonGame.game();
					 break;
			
			}
		}
	}
}
