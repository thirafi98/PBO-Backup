package exass2;


import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab IF
 */
public class DemoCollection2 {
    public static void main(String[] args) {
        Set collect = new TreeSet();
        class Person implements Comparable{
            String name;
            int nim;

            public Person(String name,int nim) {
                this.name = name;
                this.nim = nim;
            }

            @Override
            public String toString() {
                return name;
            }
            
            @Override
            public int compareTo(Object o) {
                Person p = (Person) o;
                return name.compareTo(p.name);
            }
        }
        collect.add(new Person("Dono",123));
        collect.add(new Person("Dono",123));
        collect.add(new Person("Bona",123));
        collect.add(new Person("Roni",123));
        for(Object p : collect){
            System.out.println(p);
        }
    }
}
