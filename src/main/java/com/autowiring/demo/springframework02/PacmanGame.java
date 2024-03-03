package com.autowiring.demo.springframework02;

import org.springframework.stereotype.Component;

@Component
// this class will treated as a component and spring will create an instance of this class automatically
// also in gaming configuration we gonna have to remove the pacman object to check spring is creating it for us
// or not
public class PacmanGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("Pacman is going up");
    }

    @Override
    public void down() {

        System.out.println("Pacman is going down");
    }

    @Override
    public void left() {

        System.out.println("Pacman is going left");
    }

    @Override
    public void right() {

        System.out.println("Pacman is going right");
    }

}
