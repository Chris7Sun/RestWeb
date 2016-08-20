package com.sun.service;

import com.sun.model.Person;
import com.sun.rest.RestService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Chris on 2016/8/20.
 */
@Component
public class RestServiceImpl implements RestService{
    private static List<Person> list = new ArrayList<Person>();

    static {
        Person p1 = new Person(1,"jack",18,"male");
        Person p2 = new Person(2,"rose",17,"female");
        Person p3 = new Person(3,"tom",21,"male");
        Person p4 = new Person(4,"lee",22,"male");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
    }
    public List<Person> getAll() {
        return list;
    }

    public Person getPersonById(int id) {
        return list.get(id - 1);
    }

    public List<Person> getPersonsByGender(String gender) {
        return null;
    }

    public Person create(Person person) {
        list.add(person);
        return person;
    }

    public Person update(int id, Map<String, Object> fieldMap) {
        return null;
    }

    public Person delete(int id) {
        return list.remove(id - 1);
    }
}
