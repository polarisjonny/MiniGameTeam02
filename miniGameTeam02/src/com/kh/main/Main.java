package com.kh.main;
import java.util.Scanner;

import com.kh.game.Game;

public class Main {
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Game game = new Game();
		game.startGame();
	}
}
