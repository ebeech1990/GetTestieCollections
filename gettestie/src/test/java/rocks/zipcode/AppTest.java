package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Address;
import org.junit.Test;

import java.util.HashSet;
import java.util.Stack;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    //HashSet
    @Test
    public void testApp() {
        assertTrue(true);
    }

    @org.junit.Test
    public void TestHashMapSize() {
        HashSet<Address> set=new HashSet();
        Address address1 = new Address("1st St", "Firstburg", "11111", "USA");
        Address address2 = new Address("2nd St", "Secondburg", "22222", "UK");
        Address address3 = new Address("3rd St", "Thirdburg", "33333", "Mexico");
        set.add(address1);
        set.add(address2);
        set.add(address3);

        Integer expected = 3;
        Integer actual = set.size();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void TestHashMapIsEmpty() {
        HashSet<Address> set=new HashSet();
        Address address1 = new Address("1st St", "Firstburg", "11111", "USA");
        Address address2 = new Address("2nd St", "Secondburg", "22222", "UK");
        Address address3 = new Address("3rd St", "Thirdburg", "33333", "Mexico");
        set.add(address1);
        set.add(address2);
        set.add(address3);

        boolean expected = false;
        boolean actual = set.isEmpty();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void TestHashMapContains() {
        HashSet<Address> set=new HashSet();
        Address address1 = new Address("1st St", "Firstburg", "11111", "USA");
        Address address2 = new Address("2nd St", "Secondburg", "22222", "UK");
        Address address3 = new Address("3rd St", "Thirdburg", "33333", "Mexico");
        set.add(address1);
        set.add(address2);
        set.add(address3);

        boolean expected = true;
        boolean actual = set.contains(address2);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void TestHashMapRemove() {
        HashSet<Address> set=new HashSet();
        Address address1 = new Address("1st St", "Firstburg", "11111", "USA");
        Address address2 = new Address("2nd St", "Secondburg", "22222", "UK");
        Address address3 = new Address("3rd St", "Thirdburg", "33333", "Mexico");
        set.add(address1);
        set.add(address2);
        set.add(address3);
        set.remove(address2);
        boolean expected = false;
        boolean actual = set.contains(address2);
        assertEquals(expected, actual);
    }

}
