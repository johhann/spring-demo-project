package java.com.example.demo;

import java.util.UUid;

public class Person {
    private UUid id;
    private String name;
    
    public Person(String name, UUid id) {
        this.name = name;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public UUid getId() {
        return id;
    }
}