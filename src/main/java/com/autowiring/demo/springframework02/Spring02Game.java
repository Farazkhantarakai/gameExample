package com.autowiring.demo.springframework02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.autowiring.demo.springframework02")
public class Spring02Game {


//  here we are creating beans / instance manuallly to allow  spring to create beans for you 
// just use component over the class and also add component scan at the starting of your class 
    // @Bean
    // public GamingConsole game() {
    //     var game = new PacmanGame();
    //     return game;
    // }

    //  @Bean
    // public GameRunner gameRunner(GamingConsole game) {
    //     // System.out.println("parameter  afdsl;af    ADAS  dsa       " + game);
    //     var gameRunner = new GameRunner(game);
    //     return gameRunner;
    // }
 
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(Spring02Game.class)) {

            // context.getBean(PacmanGame.class).up();

            context.getBean(GameRunner.class).run();

        }

    }

}
