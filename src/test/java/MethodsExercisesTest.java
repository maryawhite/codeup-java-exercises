import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class MethodsExercisesTest {

    @Test
    public void addTest() {
        assertEquals(133, MethodsExercises.add(88, 45));
    }

    @Test
    public void subtractTest() {
        assertEquals(114, MethodsExercises.subtract(137, 23));
    }

    @Test
    public void multiplyTest() {
        assertEquals(330, MethodsExercises.multiply(55, 6));
    }

    @Test
    public void multiplyLoopTest(){
        assertEquals(330, MethodsExercises.multiplyLoop(55, 6));
    }

    @Test
    public void divideTest(){
        assertEquals(6, MethodsExercises.divide(330, 55));
    }

    @Test
    public void remainderTest(){
        assertEquals(2, MethodsExercises.remainder(6, 4));
    }
}