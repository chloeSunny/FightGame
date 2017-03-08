package chloeGame;

/**
 * Created by Administrator on 2017/3/9.
 */
public class Boss {
    private static Boss uniqueInstance;
    public static Boss getUniqueInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new Boss();
        System.out.println("Boss will fight!");
        return uniqueInstance;
    }
}
