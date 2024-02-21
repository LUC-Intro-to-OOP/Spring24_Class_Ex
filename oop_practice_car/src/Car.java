
//Car class serves as a blueprint for creating car instances
public class Car{
    private String name;
    private String model;
    private double price;
   
    final double DISCOUNT_OFFER = .20;

    //Getter and Setter methods


    //Setter methods
    public void setName(String aName){
        //set name property
        name = aName;
    }

    public void setModel(String model){
        //set name property
        this.model = model;
    }

    public void setPrice(double price){
        this.price = price;
    }

    //Getters
    public String getName(){
        return name;
    }

    public String getModel(){
        return model;

    }

    public double getPrice(){
        return price;
    }

    //Method that calculates discounted price
    public double discountPrice(){
        return price * (1 - DISCOUNT_OFFER);
    }

  

}