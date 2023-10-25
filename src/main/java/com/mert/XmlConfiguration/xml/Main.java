package com.mert.XmlConfiguration.xml;

import com.mert.XmlConfiguration.firstexample.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        //GameRunner gameRunner = new GameRunner(context.getBean("mygame",IGameConsole.class));
        GameRunner gameRunner = context.getBean("gamerunner",GameRunner.class);
        gameRunner.run();
    }
}

