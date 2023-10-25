package com.mert.XmlConfiguration.firstexample;

import lombok.ToString;

@ToString
public class MarioGame implements IGameConsole{
    public void up() {
        System.out.println("Mario zıplıyor.");
    }

    public void down() {
        System.out.println("Mario eğiliyor.");
    }

    public void left() {
        System.out.println("Mario geri gidiyor.");
    }

    public void right() {
        System.out.println("Mario ilerliyor.");
    }
}
