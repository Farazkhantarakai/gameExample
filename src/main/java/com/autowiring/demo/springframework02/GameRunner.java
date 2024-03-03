package com.autowiring.demo.springframework02;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GamingConsole gamingConsole;

    GameRunner(@Qualifier("CantracGameQualifier") GamingConsole gC) {
        gamingConsole = gC;
    }

    public void run() {
        gamingConsole.left();
        gamingConsole.down();
        gamingConsole.up();
        gamingConsole.left();
    }

}
