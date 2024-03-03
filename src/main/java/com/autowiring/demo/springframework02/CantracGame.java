package com.autowiring.demo.springframework02;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CantracGameQualifier")
public class CantracGame  implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Contra is going up");
    }

    @Override
    public void down() {

        System.out.println("Contra is going down");
    }

    @Override
    public void left() {

        System.out.println("Contra is going left");
    }

    @Override
    public void right() {

        System.out.println("Contra is going right");
    }
}
