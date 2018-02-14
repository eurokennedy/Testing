package DemoTesting;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Before;
import org.junit.AfterClass;

public class JUnitExample {

    @BeforeClass
    public static void init() {
        System.out.println("Before class");
    }

    @Before
    public void setUp() {
        System.out.println("Before");
    }

    @Test
    public void printTest () {
        System.out.println("Test");
    }

    @After
    public void cleanUp() {
        System.out.println("After");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("After class");
    }

}
