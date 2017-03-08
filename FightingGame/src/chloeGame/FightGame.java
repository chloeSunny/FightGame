package chloeGame;

/**
 * Created by Administrator on 2017/3/5.
 */
public class FightGame {
    public static void main(String[] args){
        Fighter king = new King();
        king.fight();
        king.fighting();
        king.setWeapon(new KnifeBehavior());
        king.fighting();
        Boss.getUniqueInstance();
    }
}
