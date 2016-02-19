/**
 * Created by heifrank on 16/2/19.
 */

import static junit.framework.Assert.*;

import junit.framework.TestCase;
import org.junit.*;



public class TestHello extends TestCase {
    public static void main(String[] args){

    }

    @Test
    public void testHello(){
        Hello h = new Hello();
        assertEquals(h.sayHello("songyang"), "Hello songyang!");
    }

    public void test22(){
        System.out.println("YES");
        assertEquals(1, 1);
    }
}
