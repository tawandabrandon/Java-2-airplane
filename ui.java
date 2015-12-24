/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tawanda Brandon
 */
import java.util.Scanner;
public class ui {
private final Scanner reader;
private Airplane createdAirplane;
private Flight createdFlight;
private final Airplanes airplanes;
private final Flights flights;
public ui(Scanner reader){
    this.reader=new Scanner(System.in);
    this.createdAirplane = new Airplane("",0);
    this.createdFlight = new Flight(createdAirplane,"","");
    this.airplanes = new Airplanes();
    this.flights = new Flights();
}
public void start(){
    String command = "";


 while(!(command.equals("x"))){
         System.out.println("Airport panel\n" +
"--------------------\n" +
"\n" +
"Choose operation:\n" +
"[1] Add airplane\n" +
"[2] Add flight\n" +
"[x] Exit\n" +
">");
     command = reader.nextLine();
     if(command.equals("1")){
         System.out.println("Give plane ID: ");
         String planeID = reader.nextLine();
         System.out.println("Give plane capacity:");
         int capacity = Integer.parseInt(reader.nextLine());
         this.createdAirplane = new Airplane(planeID,capacity);
         this.airplanes.add(createdAirplane);
     }else if(command.equals("x")){
         break;
     }if(command.equals("2")){
         System.out.println("Give plane ID:");
         String planeID = reader.nextLine();
         System.out.println("Give departure airport code:");
         String departure = reader.nextLine();
         System.out.println("Give destination airport code:");
         String destination = reader.nextLine();
         this.createdFlight = new Flight(this.airplanes.getAirplane(planeID),departure,destination);
         this.flights.add(createdFlight);
    }else if(command.equals("3")){
        System.out.println("Give plane ID: ");
        String whatPlane = reader.nextLine();
        System.out.println(this.airplanes.getAirplane(whatPlane).toString());
     else{}
 }
 command = "";
while(!(command.equals("x"))){
        System.out.println("Flight service\n" +
"------------\n" +
"\n" +
"Choose operation:\n" +
"[1] Print planes\n" +
"[2] Print flights\n" +
"[3] Print plane info\n" +
"[x] Quit\n" +
">");
        command = reader.nextLine();
     if(command.equals("1")){
         this.airplanes.print();
        }else if(command.equals("2")){
         this.flights.print();
     }if(command.equals("x")){
         break;
     }
 }
}
}
