package rocks.zipcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class ArrayDequeTest {
    private static final Logger LOGGER = Logger.getLogger(ArrayDequeTest.class.getName());

    @org.junit.Test
    public void TestArrayDequeDescIt() {
        Deque<Integer> dq = new ArrayDeque<>();
       dq.add(1);
        dq.add(8);
        dq.add(12);
        dq.add(3);
        for(Iterator di = dq.descendingIterator(); di.hasNext();) {
            LOGGER.info(di.next().toString());
        }


    }
}
