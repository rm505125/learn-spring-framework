package com.code.spring.game;

@FunctionalInterface
public interface GamingConsole {

	public void hello();

	default void up() {
	}

	default void down() {
	}

	default void left() {
	}

	default void right() {
	}
}
