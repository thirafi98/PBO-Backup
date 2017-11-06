package exass2;


import java.util.ArrayList;
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
public class MyGenerics<E> {
    private List<E> list = new ArrayList<>();
    public int getSize(){
        return list.size();
    }
    public void insert(E item){
        list.add(item);
    }
    public void printAll(){
        while(!list.isEmpty()){
            E item = list.remove(list.size()-1);
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        class Building{
            String address;

            public Building(String address) {
                this.address = address;
            }

            @Override
            public String toString() {
                return "Address : " + address;
            }
        }
        MyGenerics<Building> build = new MyGenerics<>();
        build.insert(new Building("Jl Margahayu Raya No 39"));
        build.insert(new Building("Jl Cisaranten No 17"));
        build.insert(new Building("Jl Solokan Jeruk No 22"));
        build.printAll();
    }
}
