package rocks.zipcode;

import java.util.HashMap;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @org.junit.Test
    public void TestLinkedListVariousAddAndRemove() {
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("blue");
        colors.add("pink");
        colors.add("pink");
        colors.add("aqua");
        colors.add("red");
        colors.addFirst("purple");
        colors.removeLast();
        colors.removeLastOccurrence("pink");
        String expected = "[purple, blue, pink, aqua]";
        String actual = colors.toString();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void TestLinkedListGetAndSet() {
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("blue");
        colors.add("pink");
        colors.add("pink");
        colors.add("aqua");
        colors.add("red");
        colors.addFirst("purple");
        colors.removeLast();
        colors.removeLastOccurrence("pink");
        colors.get(0);
        colors.set(0, "white");
        String expected = "white";
        String actual = colors.get(0);
        assertEquals(expected, actual);
    }
}
