package com.info.service;

import com.info.model.Person;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@WebService(endpointInterface = "com.info.service.PersonService")
public class PersonServiceImpl implements PersonService {
    private static Map<Integer, Person> persons = new HashMap<Integer,Person>();

    @Override
    public boolean addPerson(Person p) {
        if (p == null) {
            System.out.println("Person object is null");
            return false;
        }
        if (persons.get(p.getId()) != null) return false;
        persons.put(p.getId(), p);
        return true;
    }


    @Override
    public boolean deletePerson(int id) {
        if(persons.get(id) == null) return false;
        persons.remove(id);
        return true;
    }

    @Override
    public Person getPerson(int id){
        return persons.get(id);
    }

    @Override
    public Person getPersonByName(String name){
        for (int i=1; i<=persons.size();i++){
            if(persons.get(i).getName().equals(name))
                System.out.println(persons.get(i).toString());
            return persons.get(i);
        }
        System.out.println("person doesn't exist");
        return null;
    }

    @Override
    public Person[] getAllPersons(){
        Set<Integer> ids = persons.keySet();
        Person [] p = new Person[ids.size()];
        int i=0;
        for(Integer id:ids){
            p[i] = persons.get(id);
            i++;
        }
        return p;
    }

}



