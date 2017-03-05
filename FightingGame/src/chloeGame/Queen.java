package chloeGame;

/**
 * Created by Administrator on 2017/3/5.
 */
public class Queen extends Fighter {
    public Queen(){
        weapon = new SwordBehavior();
    }
    public void fight(){
        System.out.println("I am a queen and I am fighting");
    }
}
