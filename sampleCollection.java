/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capek;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Praktikum
 */
public class sampleCollection {
    public static void main(String[] args) {
        class person{
            String name;
            person(String name){
                this.name = name;
            }
            @Override
            public String toString(){
                return name;
            }
        }
        List list = new LinkedList();
        list.add("Hello");
        list.add(new person("Dono"));
        list.add(23);
        list.add(true);
        list.add(33.23);
        for (Object x:list){
            System.out.println(x);
        }
        System.out.println("");
        list.remove(3);
        list.remove(1);
        for (Object x:list){
            System.out.println(x);
        }
    }
}
