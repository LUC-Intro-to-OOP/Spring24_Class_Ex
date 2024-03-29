
//Car class serves as a blueprint for creating car instances
abstract class Car{
    protected String name;
    protected String model;
    protected double price;
   
    protected final double DISCOUNT_OFFER = .20;

    abstract protected String CompanyName();


    //Constructor
    /*public Car(){
        name = "N/A";
        model = "N/A";
        price = 0;
    }

    public Car(String name, String model, double price){
        this.name = name;
        this.model = model;
        this.price = price;
        discountPrice();
    }

    public Car(String model, double price){
        name = "Mazda";
    }


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
    }*/

    @Override
    public String toString(){

        return String.format("Name: " + name + " Model: " + model + " Price: "  + price + " Discount: $" + discountPrice());

    }
  

}