package com.kh.game;
import java.util.Random;
import java.util.Scanner;

public class GugudanGame {
	int randomNumber = 0;
	int y = 0;
	int userNumber = 0;
	
	int answer = 0;
	
	int record = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	Random random = new Random();
	
	GugudanGame() {
		System.out.println("--------------------------");
		System.out.println("|    구구단 게임을 시작합니다   |");
		System.out.println("--------------------------");
		
		startGugudanGame();
		
	}
	
	public int startGugudanGame() {
		randomNumber = random.nextInt(9)+1;
		y = random.nextInt(9) + 1;
		answer = randomNumber * y;
		System.out.println(randomNumber+"X"+y+"= ?");
		userNumber = scanner.nextInt();
		
		if(userNumber == answer) {
			System.out.println("정답입니다!");
			record += 50;
		} else {
			System.out.println("오답입니다 ㅠㅠ");
		}
		return record;
	}
}
