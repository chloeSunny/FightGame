package chloeGame;

/**
 * Created by Administrator on 2017/3/5.
 */
public abstract class Fighter {
    WeaponBehavior weapon;

    public void Character(){
        }

    public abstract void fight();

    public void fighting(){
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior w){
        this.weapon = w;
        }
}
