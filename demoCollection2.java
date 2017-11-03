/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capek;
import java.util.*;
/**
 *
 * @author Praktikum
 */
public class demoCollection2 {
    public static void main(String[] args) {
        Set collect = new TreeSet();
        class person implements Comparable{
            String name;
           
            person(String name){
                this.name = name;
            }
            @Override
            public String toString(){
                return name;
            }

            @Override
            public int compareTo(Object o) {
                person p = (person) o;
                return name.compareTo(p.name);
            }
        }
        collect.add(new person("dono"));
        collect.add(new person("bona"));
        collect.add(new person("roni"));
        for(Object p:collect){
            System.out.println(p);
        }
    }
}
