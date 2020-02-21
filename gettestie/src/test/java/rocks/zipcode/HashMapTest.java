package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HashMapTest {

    @org.junit.Test
    public void TestHashMapContainsKey() {
        HashMap<String, String> pokemon = new HashMap<>();
        pokemon.put("kantoGrassStarter", "Bulbasaur");
        pokemon.put("kantoWaterStarter", "Squirtle");
        pokemon.put("kantoFireStarter", "Charmander");
        boolean expected = false;
        boolean actual = pokemon.containsKey("johtoFireStarter");
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void TestHashMapReplace() {
        HashMap<String, String> pokemon = new HashMap<>();
        pokemon.put("kantoGrassStarter", "Bulbasaur");
        pokemon.put("kantoWaterStarter", "Squirtle");
        pokemon.put("kantoFireStarter", "Charmander");
        pokemon.replace("kantoWaterStarter", "Wartortle");
        String expected = "Wartortle";
        String actual = pokemon.get("kantoWaterStarter");
        assertEquals(expected, actual);
    }
}
