package com.mert.XmlConfiguration.firstexample;

/*
1- MarioGame sinifimizda 4 tane metodumuz olsun:
    -up() ->zipla
    -down() -> egil
    -left() -> geri git
    -right() -> ilerle-ileri git
    GameRunner sinifimizda bir run() metodu yazalim. Bu metot mario sinifimizdaki 4 metodu calistirsin.
 */
public class Main {
    public static void main(String[] args) {


        GameRunner gameRunner = new GameRunner(new SuperContra());
        gameRunner.run();
    }
}

