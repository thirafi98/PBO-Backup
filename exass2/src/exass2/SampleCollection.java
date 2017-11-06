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
public class SampleCollection {
    public static void main(String[] args) {
        class Person{
            String name;
            int nim;
            Person(String name,int nim){
                this.name = name;
                this.nim = nim;
            }

            @Override
            public String toString() {
                return name ;
            }
        }
        List list = new ArrayList();
        list.add("Hello World");
        list.add(new Person("Dono",123));
        list.add(23);
        list.add(true);
        list.add(33.21);
        for (Object x : list) {
            System.out.println(x);
        }
        list.remove(3);
        list.remove(1);
        for (Object x : list) {
            System.out.println(x);
        }
    }
}
