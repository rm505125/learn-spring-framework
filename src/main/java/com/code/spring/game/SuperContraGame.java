package com.code.spring.game;

/*
public class SuperContraGame {

	public void up() {
		System.out.println("SuperContraGame Up");
	}

	public void down() {
		System.out.println("SuperContraGame Down");
	}

	public void left() {
		System.out.println("SuperContraGame Left");
	}

	public void right() {
		System.out.println("SuperContraGame Right");
	}


}
*/

public class SuperContraGame implements GamingConsole {

	public void up() {
		System.out.println("SuperContraGame Up");
	}

	public void down() {
		System.out.println("SuperContraGame Down");
	}

	public void left() {
		System.out.println("SuperContraGame Left");
	}

	public void right() {
		System.out.println("SuperContraGame Right");
	}

	@Override
	public void hello() {
		System.out.println("This id SuperContra Game!");
	}

}