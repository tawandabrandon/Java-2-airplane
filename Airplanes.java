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
public class Airplanes {
    private final ArrayList<Airplane> airplanes;
public Airplanes(){
    this.airplanes=new ArrayList<Airplane>();
}
public void print(){
    for(Airplane i : airplanes){
        System.out.println(i.toString());
    }
}
public void add(Airplane airplane){
    this.airplanes.add(airplane);
}
public Airplane getAirplane(String planeID){
    for(Airplane i : this.airplanes){
        if(i.toString().contains(planeID)){
            return i;
        }
    }
return null;}
}
