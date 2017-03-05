package chloeGame;

/**
 * Created by Administrator on 2017/3/5.
 */
public class Knight extends Fighter {
    public Knight(){
        weapon = new SwordBehavior();
    }
    public void fight(){
        System.out.println("I am a knight and I am fighting");
    }
}

