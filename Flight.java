/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tawanda Brandon
 */
public class Flight {
private final Airplane planeID;
private final String Destination;
private final String Departure;

public Flight(Airplane planeID,String dest,String dep){
    this.Departure=dep;
    this.Destination=dest;
    this.planeID=planeID;
}
@Override
public String toString(){
    return this.planeID.toString() + " ("+this.Departure+"-"+this.Destination+")";
}
}


