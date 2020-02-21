package rocks.zipcode;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @org.junit.Test
    public void TestStackPush() {
        Stack<String> stack = new Stack<>();
        stack.push("I tried so hard");
        stack.push("and got so far.");
        stack.push("In the end");
        stack.push("it doesn't even matter.");
        stack.push("One thing");
        String expected = "One thing";
        String actual = stack.peek();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void TestStackPop() {
        Stack<String> stack = new Stack<>();
        stack.push("I tried so hard");
        stack.push("and got so far.");
        stack.push("In the end");
        stack.push("it doesn't even matter.");
        stack.pop();
        String expected = "In the end";
        String actual = stack.peek();
        assertEquals(expected, actual);
    }

    // Make a bigger test exercising more Stack methods.....
}
