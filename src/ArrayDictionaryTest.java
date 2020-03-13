import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayDictionaryTest {
    @Test
    public void demo() {
        int testSize = 5;
        ArrayDictionary dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(2, 82));
        assertTrue(dict.add(4, 84));
        assertTrue(dict.add(7, 87));
        System.out.println(dict);
    }

    @Test
    public void remove() {
        int testSize = 5;
        ArrayDictionary dict = new ArrayDictionary(testSize);
        if (!dict.remove(2)) {
            assertTrue(true);
        } else
            fail();
        assertTrue(dict.add(2, 82));
        assertTrue(dict.add(4, 84));
        if (dict.remove(2)) {
            assertTrue(true);
        } else
            fail();
        if (!dict.remove(3)) {
            assertTrue(true);
        } else
            fail();
        assertTrue(dict.add(7, 87));
        if (dict.remove(2)) {
            assertTrue(true);
        } else
            fail();
        if (dict.remove(4)) {
            assertTrue(true);
        } else
            fail();
        if (!dict.remove(1)) {
            assertTrue(true);
        } else
            fail();
    }

    @Test
    public void contains() {
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~set 1
        ArrayDictionary dict = new ArrayDictionary(0);
        if (!dict.contains(-1))
            assertTrue(true);
        else
            fail();
        if (!dict.contains(0))
            assertTrue(true);
        else
            fail();
        if (!dict.contains(1))
            assertTrue(true);
        else
            fail();

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~set 2
        dict = new ArrayDictionary(1);
        dict.add(0,103);
        if (!dict.contains(2))
            assertTrue(true);
        else
            fail();
        if (dict.contains(0))
            assertTrue(true);
        else
            fail();

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~set 3
        dict = new ArrayDictionary(2);
        dict.add(0,103);    dict.add(1,105);
        if (dict.contains(0))
            assertTrue(true);
        else
            fail();
        if (dict.contains(1))
            assertTrue(true);
        else
            fail();
        if (!dict.contains(2))
            assertTrue(true);
        else
            fail();
        if (!dict.contains(3))
            assertTrue(true);
        else
            fail();

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~set 4
        dict = new ArrayDictionary(3);
        dict.add(0,103);    dict.add(1,105);
        if (!dict.contains(3))
            assertTrue(true);
        else
            fail();
        dict.add(2,206);
        if (dict.contains(1))
            assertTrue(true);
        else
            fail();
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~set 5
        dict.add(4,407);
        if (dict.contains(1))
            assertTrue(true);
        else
            fail();
        if (dict.contains(4))
            assertTrue(true);
        else
            fail();
        if (!dict.contains(7))
            assertTrue(true);
        else
            fail();
        if (!dict.contains(8))
            assertTrue(true);
        else
            fail();



    }
}