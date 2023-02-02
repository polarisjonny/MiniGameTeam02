package com.kh.game;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Game {
	
	private String fileName = "Score.txt";
	
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
			int score = 0;
			
			if(num == 0) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
			switch(num) {
			case 1 : CjGame cjGame = new CjGame();
					 score = cjGame.Game();
					 break;
					 
			case 2 : GameRSP gameRSP = new GameRSP();
					 score = gameRSP.playGame();
					 break;
					 
			case 3 : GugudanGame gugudanGame = new GugudanGame();
					 score = gugudanGame.startGugudanGame();
					 break;
					 
			case 4 : GameY gameY = new GameY();
					 score = gameY.guguGameStart();
					 break;
					 
			case 5 : SoyeonGame soyeonGame = new SoyeonGame();
					 score = soyeonGame.game();
					 break;
			
			}
			
			recordScore(num, score);
		}
	}
	
	public void recordScore(int gameNum, int score) {
		File f = new File(fileName);
		String record = "[Game" + gameNum + "]  Score : " + score + "\n";
		
		System.out.println(record);
		try(FileWriter fw = new FileWriter(f, true);
			BufferedWriter fbw = new BufferedWriter(fw);) {
			fbw.write(record);
			fbw.flush();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
}
