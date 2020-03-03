package lambda;

/**
 * @Author: hanieh Moafi
 * @Date: 3/1/2020
 **/
public class TestLambda2 {

    public static void main(String[] args) {

    }
    public static void repeat(int n,Runnable action){
        
        for (int i=0;i>n;i++)
            action.run();
    }
}
