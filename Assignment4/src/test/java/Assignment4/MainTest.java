package Assignment4;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class MainTest extends TestCase {
    private Baby babyTest;
    private Toddler toddlerTest;
    private Kids kidsTest;
    private Runner runnerTest;

    public void setUp() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
        babyTest = (Baby) ctx.getBean("Baby");
        toddlerTest = (Toddler) ctx.getBean("Toddler");
        kidsTest = (Kids) ctx.getBean("Kids");
        runnerTest = (Runner) ctx.getBean("Runner");

    }
    @Test
    public void testBaby() {
        boolean result = babyTest.walk(2);
        assertTrue(result);
    }



    @Test
    public void testToddler(){
        boolean resultA = toddlerTest.walk(8);
        assertTrue(resultA);
    }

    @Test
    public void testKidsBaby() {
        boolean resultB = kidsTest.babyWalk(2);
        assertTrue(resultB);
    }
    @Test
    public void testKidsToddler() {
        boolean resultB = kidsTest.toddlerWalk(6);
        assertTrue(resultB);
    }

    @Test
    public void testRunner(){
        int result = toddlerTest.trackRunner(true);
        assertEquals(result, 1);
    }

    public void testTrackRunner(){
        int res = toddlerTest.trackRunner(true);
        assertEquals(res, 1);
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }
}