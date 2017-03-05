package chloeGame;

/**
 * Created by Administrator on 2017/3/5.
 */
public class Troll extends Fighter {
    public Troll(){
        weapon = new KnifeBehavior();
    }
    public void fight(){
        System.out.println("I am a troll!");
    }
}
