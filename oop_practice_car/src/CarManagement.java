

import java.util.Scanner; //Scanner Class imported

public class CarManagement {
    public static void main(String[] args) throws Exception {
       

        //DECLARATIONS
        String name, model;
        double price;
        Scanner input = new Scanner(System.in);
        Car [] cars = new ElectricCar[2];  //Declaring an array of objects

        //For Loop to iterate and create 2 car objects
        for(var i = 0; i < cars.length; i++){

           

            //Ask for input
            System.out.println("Please enter name for car " + (i+1));
            name = input.nextLine();

            System.out.println("Please enter model for car " + (i+1));
            model = input.nextLine();

            System.out.println("Pleae enter price for car " + (i+1));
            price = Double.parseDouble(input.nextLine());

            cars[i] = new ElectricCar(name, model, price); //Creating the object instance


        }

        //Step #3 
        for(var x = 0; x < cars.length; x++){
            
            System.out.println(cars[x]);
        }




      
    }
}
