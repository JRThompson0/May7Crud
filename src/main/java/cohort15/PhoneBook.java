package cohort15;

import java.util.*;
//name : phoneNumber1, phoneNumber1
//name: phoneNumber

// String , ArrayList of Strings, Map of some king
//Map to hold name and phoneNumbers
//Key is String and values is arrayList of String

public class PhoneBook {
    private Map<String, List<String>> phoneRecord;

    public PhoneBook(){
        this(new HashMap<>());
    }

    public PhoneBook(Map<String, List<String>> phoneRecord) {
        this.phoneRecord = phoneRecord;
    }

    //Create a method to add a number to the phonebook

    public void add(String name, String phoneNumber)
    {
        if (!phoneRecord.containsKey(name)) {
            List<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            phoneRecord.put(name, numbers);  //put the record in the map
        }
        else
        {
            List<String> workingList = phoneRecord.get(name);
            workingList.add(phoneNumber);
            phoneRecord.replace(name,workingList);
        }
    }

    //Create a method to addAll Numbers to a phoneRecord
    public void add(String name, String... phoneNumbers)
    {
        //put the record in the map by key and values
        if (!phoneRecord.containsKey(name)) {
            List<String> numbers = new ArrayList<>(List.of(phoneNumbers));
            phoneRecord.put(name, numbers);  //put the record in the map
        }
        else
        {
            List<String> workingList = phoneRecord.get(name);
            workingList.addAll(List.of(phoneNumbers));
            phoneRecord.replace(name,workingList);
        }
    }

    //Method to remove a person
    public void remove(String name)
    {
        //remove from the map
        if (phoneRecord.containsKey(name))
            phoneRecord.remove(name);
        else
            System.out.println("That person is not in the phonebook.");
    }

    //HasEntry - to check if entry exist
    public Boolean hasEntry(String name)
    {
        //check if name exist in record and return true
        return phoneRecord.containsKey(name);
    }

    //lookUp (name) - return phone number(s)
    public List<String> lookup(String name)
    {
        //return a list of phone numbers that belong to the name
        return phoneRecord.get(name);
    }

    //reverse lookUp (phoneNumber) - return phone name
    public String reverseLookUp(String phoneNumber)
    {
        //Takes a phone number and returns the name attached to the number
        Iterator<Map.Entry<String, List<String>>> iteratito = phoneRecord.entrySet().iterator();
        //iterate through the phonebook to go through all the numbers in each entry.
        while(iteratito.hasNext())
        {
           List<String> currentList = iteratito.next().getValue();
           Iterator<String> iteratita = currentList.iterator();
           //iterate through each entry's list
           while(iteratita.hasNext())
           {
               String currentStringNumber = iteratita.next();
               if (currentStringNumber.equals(phoneNumber))
               {
                   return currentStringNumber;
               }
           }
        }
        System.out.println("No one found with that number. Null Returned");
        return null;
    }

    //Get allContactNames in the phoneBook

    public List<String> getAllContactNames()
    {
        //need a list or container to store the names
        //need to iterate through the map
        //add each name to the list r container
        //return the container
        return phoneRecord.keySet().stream().toList();
    }


    //A way to represent the String Object


    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneRecord=" + phoneRecord +
                '}';
    }

}