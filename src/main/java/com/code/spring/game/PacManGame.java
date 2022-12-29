package com.code.spring.game;

import org.springframework.stereotype.Component;

/*
public class MarioGame {

	public void up() {
		System.out.println("Up");
	}

	public void down() {
		System.out.println("Down");
	}

	public void left() {
		System.out.println("Left");
	}

	public void right() {
		System.out.println("Right");
	}

}
*/


public class PacManGame implements GamingConsole {

	public void up() {
		System.out.println("PacMan Up");
	}

	public void down() {
		System.out.println("PacMan Down");
	}

	public void left() {
		System.out.println("PacMan Left");
	}

	public void right() {
		System.out.println("PacMan Right");
	}

	@Override
	public void hello() {
		System.out.println("This is PacMan  game!");
	}

}
