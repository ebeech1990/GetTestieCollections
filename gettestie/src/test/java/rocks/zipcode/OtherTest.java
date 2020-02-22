package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;

import java.util.*;
import java.util.logging.Logger;

public class OtherTest {

    private static final Logger LOGGER = Logger.getLogger(ArrayDequeTest.class.getName());

    @org.junit.Test
    public void TestVector() {
        Vector<String> v = new Vector<>();
        v.add("apple");
        v.add("pear");
        v.add("grape");
        v.add("mango");
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            LOGGER.info(e.nextElement().toString());
        }
    }

    @org.junit.Test
    public void TestTreeMap() {
      TreeMap<String,String> tm = new TreeMap<>();
        tm.put("captain","Luffy");
        tm.put("doctor","Chopper");
        tm.put("chef","Sanji");
        tm.put("shipwright","Frankie");
        tm.remove("doctor");
        for(Map.Entry m : tm.entrySet()){
            LOGGER.info(m.getKey() + " " + m.getValue());
        }
    }

    @org.junit.Test
    public void TestTreeSet() {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        NavigableSet<String> rev = ts.descendingSet();
        Iterator<String> i = rev.iterator();
        while (i.hasNext()) {
            LOGGER.info(i.next());
        }
    }

    @org.junit.Test
    public void TestPriorityQ() {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("A");
        pq.add("B");
        pq.add("C");
        pq.add("D");
       LOGGER.info(pq.peek());
       System.out.println(pq.contains("A"));
    }

    @org.junit.Test
    public void TestComparable() {
        ArrayList<Person> list = new ArrayList<>();
        Person bill = new Person("bill", 1987);
        Person sally = new Person("sally", 1965);
        Person jim = new Person("jim", 1999);
        list.add(bill);
        list.add(sally);
        list.add(jim);
        Collections.sort(list);
        for(Person p : list) {
            LOGGER.info(p.getName() + " " + p.getYearOfBirth());
        }
    }

}
