package cohort15;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

class PhoneBookTest {
    @BeforeAll
    static void add()
    {
        PhoneBook phoneTime = new PhoneBook();
        phoneTime.add("Johnny Bungo","610-492-1992");
        phoneTime.add("Johnny Brungo","611-492-1992");
        phoneTime.add("Jonathan Brugo","720-492-1932");
        phoneTime.add("Sally Ride","111-111-1111");
        phoneTime.add("Jonathan Burgess","123-456-7890");
        phoneTime.add("Jonathan Burgess","123-123-1234");
        phoneTime.add("Johnny Bungo","330-492-1992");
        assertFalse(phoneTime.getPhoneRecord().isEmpty());
    }
    @Test
    void addListEntry()
    {
        List<String> workList = new ArrayList<String>();
        workList.add("191-232-4411");
        workList.add("191-232-4412");
        workList.add("191-232-4413");

    }

    @Test
    void remove() {
    }

    @Test
    void hasEntry() {
    }

    @Test
    void lookup() {
    }

    @Test
    void reverseLookUp() {
    }
}