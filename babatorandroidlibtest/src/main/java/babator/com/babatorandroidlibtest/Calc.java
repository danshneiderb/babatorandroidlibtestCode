package babator.com.babatorandroidlibtest;

/**
 * Created by Dan on 04/05/2016.
 */
public class Calc {
    /**
     * Addition of x+y
     * @param x
     * @param y
     * @return
     */
    public static int Add(int x, int y){
        return x + y;
    }

    /**
     * Substruct x-y
     * @param x
     * @param y
     * @return
     */
    public static int Subs(int x, int y){
        return x - y;
    }

    /**
     * Multiply x*y
     * @param x
     * @param y
     * @return
     */
    public static int Multi(int x, int y){
        return x * y;
    }

    /**
     * Div x/y
     * @param x
     * @param y
     * @return
     */
    public static int Div(int x, int y){
        if(y != 0){
            return x / y;
        }
        else{
            return 0;
        }

    }
}
