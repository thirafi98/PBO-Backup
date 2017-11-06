package exass2;


import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab IF
 */
public class SampleGenerics {
    public static void main(String[] args) {
        class Person{
            String name;
            Person(String name){
                this.name = name;
            }
        }
        List<Person> list = new LinkedList<>();
        list.add(new Person("Budi"));
        list.add(new Person("Jacky"));

        list.add(new Person("Santi"));
        for (Person p: list) {
            System.out.println(p.name);
        }
    }
}
