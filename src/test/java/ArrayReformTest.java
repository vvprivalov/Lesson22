import org.junit.*;

import static org.junit.Assert.*;

public class ArrayReformTest {
    ArrayReform arrayReform;


    @Before
    public void setUp() throws Exception {
        arrayReform = new ArrayReform();
    }

    @After
    public void tearDown() throws Exception {
        arrayReform = null;
    }

    @Test
    public void arrayInOfOut1() {
        int[] array1 = arrayReform.arrayInOfOut(new int[] {1,2,4,4,2,3,4,1,7});
        int[] array2 = {1,7};

        assertArrayEquals(array1, array2);
    }

    @Test
    public void arrayInOfOut2() {
        int[] array1 = arrayReform.arrayInOfOut(new int[] {1,2,4,4,2,3,0,1,7});
        int[] array2 = {2,3,0,1,7};

        assertArrayEquals(array1, array2);
    }

    @Test( expected = RuntimeException.class )
    public void arrayInOfOut3() {
        int[] array1 = arrayReform.arrayInOfOut(new int[] {1,2,0,2,3,0,1,7});
        int[] array2 = {2,3,0,1,7};

        assertArrayEquals(array1, array2);
    }


    @Test
    public void arrayOneFour1() {
        int[] array = {1,1,1,4,4,1,4,4};
        assertTrue(arrayReform.arrayOneFour(array));
    }

    @Test
    public void arrayOneFour2() {
        int[] array = {1,1,1,1,1,1};
        assertFalse(arrayReform.arrayOneFour(array));
    }

    @Test
    public void arrayOneFour3() {
        int[] array = {4,4,4,4};
        assertFalse(arrayReform.arrayOneFour(array));
    }

    @Test
    public void arrayOneFour4() {
        int[] array = {1,4,4,1,1,4,3};
        assertFalse(arrayReform.arrayOneFour(array));
    }
}