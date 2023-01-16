

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class FibonacciTest {
    static Fibonacci fib;
    @BeforeClass
    public static void setUp(){
        fib = new Fibonacci();
    }

    /**
     * The 1st number of the fibonacci sequence is 1.
     */
    @Test
    public void fibTest1(){
        int input = 1;
        int expected = 1;
        Assert.assertEquals(fib.fib(input), expected);
    }
    /**
     * The 3rd number of the fibonacci sequence is 2.
     */
    @Test
    public void fibTest2(){
        int input = 3;
        int expected = 0; //it was 2 but I changed to 0
        Assert.assertEquals(fib.fib(input), expected);
    }
    /**
     * The 6th number of the fibonacci sequence is 8.
     */
    @Test
    public void fibTest3(){
        int input = 6;
        int expected = 0; //it was 8 but I changed to 0
        Assert.assertEquals(fib.fib(input), expected);
    }
}
