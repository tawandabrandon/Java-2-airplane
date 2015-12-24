/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tawanda Brandon
 */
import java.util.ArrayList;
public class Flights {
    private final ArrayList<Flight> flights;
    public Flights(){
        this.flights=new ArrayList<Flight>();
    }
    public void print(){
        for(Flight i : this.flights){
            System.out.println(i.toString());
        }
    }
    public void add(Flight f){
        this.flights.add(f);
    }
}
