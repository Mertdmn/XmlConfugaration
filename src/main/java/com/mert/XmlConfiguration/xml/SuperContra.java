package com.mert.XmlConfiguration.xml;

public class SuperContra implements IGameConsole {
    @Override
    public void up() {
        System.out.println("SC zipla");
    }

    @Override
    public void down() {
        System.out.println("SC egil");

    }

    @Override
    public void left() {
        System.out.println("SC Geri git");

    }

    @Override
    public void right() {
        System.out.println("SC Ileri git");

    }
}
