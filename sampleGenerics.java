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
public class sampleGenerics {
    public static void main(String[] args) {
        class person{
            String name;
            person(String name){
                this.name = name;
            }
        }
        List <person> list = new LinkedList<>();
        list.add(new person("Budi"));
        list.add(new person("Jacky"));
        list.add(new person("Doni"));
        list.add(new person("Santi"));
        for(person p : list){
            System.out.println(p.name);
        }
    }
}
