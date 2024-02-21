import java.util.Scanner;
public class GroceryList {
    public static void main(String[] args) throws Exception {

        //DECLARE
        Scanner input = new Scanner(System.in);
        //Step 1
        String [] foodItems = {"Nuts","Fish","Lentils","Whole Grains","Beans","Olive Oil",
		    "Eggs","Yogurt"};


        //Call selectItem method for user input
        selectItem(foodItems, input);
        System.out.println( "End of program");
    }

    //Defining the method to ouput the food items list
    public static void outputList(String [] fItems){

        //Looping structure to iterate through the array
        for(var i = 0; i < fItems.length; i++){
            System.out.println("Enter " + i + " for " + fItems[i]);
        }
    }

    //Define method that accepts user input and allows end-user to enter item
    public static void selectItem(String [] foodItems, Scanner input){
        //Define local variables
        int userInput;

        //Call method to ouput food items
        outputList(foodItems);

        //Ask user to input item
        System.out.print("Please enter the number of the item:  ");
        userInput = Integer.parseInt(input.nextLine());

        //Ouput the item the end-user selected
        System.out.println("You selected item " + foodItems[userInput]);

        
    }
}
