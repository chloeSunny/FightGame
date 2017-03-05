package chloeGame;

/**
 * Created by Administrator on 2017/3/5.
 */
public class King extends Fighter {
    public King(){
        weapon = new AxeBehavior();
    }
    public void fight(){
        System.out.println("I am a king and I am fighting");
    }
}
