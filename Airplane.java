/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tawanda Brandon
 */
public class Airplane {
private final String name;    
private final int capacity;
public Airplane(String name, int capacity){
    this.capacity=capacity;
    this.name=name;
}
@Override
public String toString(){
    return this.name+" ("+this.capacity+" ppl)";
}
}
