

import java.util.Scanner; //Scanner Class imported

public class CarManagement {
    public static void main(String[] args) throws Exception {
       
        //DECLARATIONS
        Scanner input = new Scanner(System.in);
        Car [] cars = new Car[2];  //Declaring an array of objects

        //For Loop to iterate and create 2 car objects
        for(var i = 0; i < cars.length; i++){

            cars[i] = new Car();

            //Ask for input
            System.out.println("Please enter name for car " + (i+1));
            cars[i].setName(input.nextLine());

            System.out.println("Please enter model for car " + (i+1));
            cars[i].setModel(input.nextLine());

            System.out.println("Pleae enter price for car " + (i+1));
            cars[i].setPrice(Double.parseDouble(input.nextLine()));
        }

        //Step #3 
        for(var x = 0; x < cars.length; x++){
            System.out.println("Name: " + cars[x].getName() + "Model: " + cars[x].getModel() + " Price: "  + cars[x].getPrice() + " Discount: $" + cars[x].discountPrice());
        }




      
    }
}
