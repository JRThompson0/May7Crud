package cohort15;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PhoneBookTest {
    static PhoneBook phoneTime = new PhoneBook();
    @BeforeAll
    static void add()
    {
        phoneTime.add("Johnny Bungo","610-492-1992");
        phoneTime.add("Johnny Brungo","611-492-1992");
        phoneTime.add("Jonathan Brugo","720-492-1932");
        phoneTime.add("Sally Ride","111-111-1111");
        phoneTime.add("Jonathan Burgess","123-456-7890");
        phoneTime.add("Jonathan Burgess","123-123-1234");
        phoneTime.add("Johnny Bungo","330-492-1992");
        assertFalse(phoneTime.getPhoneRecord().isEmpty());
    }
    @BeforeAll
    static void addListEntry()
    {
        List<String> workList = new ArrayList<String>();
        phoneTime.add("Newguy Newsly","191-232-4411","191-232-4412","191-232-4413");
        assertEquals(true,phoneTime.hasEntry("Newguy Newsly"));
    }
    @Test
    void addTest()
    {
        assertFalse(phoneTime.getPhoneRecord().isEmpty());
        assertEquals(true,phoneTime.hasEntry("Newguy Newsly"));
    }

    @Test
    void lookup()
    {
        List<String> daList = phoneTime.getPhoneRecord().get("Newguy Newsly");
        assertEquals(daList.stream().toList(), phoneTime.lookup("Newguy Newsly"));
    }
    @Test
    void reverseLookUp()
    {
        assertEquals("Newguy Newsly",phoneTime.reverseLookUp("191-232-4413"));
    }
    @AfterAll
    static void remove()
    {
        phoneTime.remove("Newguy Newsly");
        assertFalse(phoneTime.hasEntry("Newguy Newsly"));
    }
}