/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kol;
import java.util.*;
/**
 *
 * @author Thirafi Wian
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
        list.add("supp");
        list.add(new person("Wian"));
        list.add(23);
        list.add(true);
        list.add(33.33);
        for(Object o:list){
            System.out.println(o);
        }
        System.out.println("");
        list.remove(0);
        list.remove(3);
        for(Object o:list){
            System.out.println(o);
        }
    }
}
