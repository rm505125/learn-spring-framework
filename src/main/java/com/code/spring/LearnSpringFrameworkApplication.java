package com.code.spring;

import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.code.spring.enterprise.example.web.MyWebController;
import com.code.spring.game.GameRunner;
import com.code.spring.game.GamingConsole;
import com.code.spring.game.MarioGame;
import com.code.spring.game.PacManGame;
import com.code.spring.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication  {

	public static void main(String[] args) {
		// SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		/*
		 * MarioGame game = new MarioGame(); GameRunner runner = new GameRunner(game);
		 * runner.run();
		 */
		
		//SuperContraGame contraGame = new SuperContraGame();
		
		//PacManGame pacManGame = new PacManGame();
		//GameRunner runner = new GameRunner(pacManGame);
		
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.businessServiceMethod());
		
	}

	

}
