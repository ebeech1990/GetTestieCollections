package rocks.zipcode;
import gettestie.src.main.java.rocks.zipcode.Address;
import gettestie.src.main.java.rocks.zipcode.Person;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.*;
public class ArrayListTest {
    @org.junit.Test
    public void TestArrayListIsEmpty() {
        ArrayList<Person> list = new ArrayList<>();
        Person bill = new Person("bill", 1987);
        Person sally = new Person("sally", 1965);
        Person jim = new Person("jim", 1999);
        list.add(bill);
        list.add(sally);
        list.add(jim);
        boolean expected = false;
        boolean actual = list.isEmpty();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void TestArrayListIndexOf() {
        ArrayList<Person> list = new ArrayList<>();
        Person bill = new Person("bill", 1987);
        Person sally = new Person("sally", 1965);
        Person jim = new Person("jim", 1999);
        list.add(bill);
        list.add(sally);
        list.add(jim);
        int expected = 2;
        int actual = list.indexOf(jim);
        assertEquals(expected, actual);
    }
}
