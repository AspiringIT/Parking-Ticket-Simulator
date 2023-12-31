// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*Parking Ticket Simulator
For this assignment you will design a set of classes that work together to simulate a police
officer issuing a parking ticket. You should design the following classes:
•	 The ParkedCar Class: This class should simulate a parked car. The class’s responsibilities are as follows:
– To know the car’s make, model, color, license number, and the number of minutes
that the car has been parked.
•	 The ParkingMeter Class: This class should simulate a parking meter. The class’s only
responsibility is as follows:
– To know the number of minutes of parking time that has been purchased.
Programming Challenges
•	 The ParkingTicket Class: This class should simulate a parking ticket. The class’s
responsibilities are as follows:
– To report the make, model, color, and license number of the illegally parked car
– To report the amount of the fine, which is $25 for the first hour or part of an
hour that the car is illegally parked, plus $10 for every additional hour or part of
an hour that the car is illegally parked
– To report the name and badge number of the police officer issuing the ticket
•	 The PoliceOfficer Class: This class should simulate a police officer inspecting parked
cars. The class’s responsibilities are as follows:
– To know the police officer’s name and badge number
– To examine a ParkedCar object and a ParkingMeter object, and determine whether
the car’s time has expired
– To issue a parking ticket (generate a ParkingTicket object) if the car’s time
has expired
Write a program that demonstrates how these classes collaborate.
*/


public class Main {


    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        ParkedCar Vehicle = new ParkedCar("Tesla", "Model X ", "Black","LOLGAS",525600); //Parked for 1 year this results in a large fine and the car will soon be impounded
        ParkingMeter meter = new ParkingMeter(60);
        PoliceOfficer po = new PoliceOfficer("Officer Donut Lord", "09967"); //Remember Variable names can't be the same as the class name. It will throw hands in the air and give up :)
        ParkingTicket ticket =  po.inspectCar(Vehicle, meter);

        if(ticket != null) {
            System.out.println("Parking ticket issued: ");
            System.out.println("Officer: " + po.getName() + "Badge #: " + po.getBadgeNumber());
            System.out.println("Car: " + Vehicle.getColor() + " " + Vehicle.getmake() +" " +  Vehicle.getmodel() + "License " + ticket.getParkedCar().getlicenseNumber());
            System.out.println("Fine: $" + ticket.getFine());
        }
        else {
            System.out.println("No parking violation found.");
        }
        }
    }
