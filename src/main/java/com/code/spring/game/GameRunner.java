package com.code.spring.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	/*
	 * tightly coupled private MarioGame game;
	 * 
	 * public GameRunner(MarioGame game) { this.game = game;
	 * 
	 * }
	 * 
	 * public void run() { game.up(); game.down(); game.left(); game.right(); }
	 * 
	 * 
	 * 
	 * private SuperContraGame contraGame;
	 * 
	 * public GameRunner(SuperContraGame contraGame) { this.contraGame = contraGame;
	 * }
	 * 
	 * public void run() { contraGame.up(); contraGame.down(); contraGame.left();
	 * contraGame.right(); }
	 */

	// loosely coupled

	@Autowired
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		game.hello();
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
