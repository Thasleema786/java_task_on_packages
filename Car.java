package com.vehicles;
public class Car{
      private String brand;
      private String model;
      private double price;
       public void setBrand(String brand){
            this.brand=brand;
}
        public void setModel(String model){
            this.model=model;
}

       public void setPrice(double price){
            this.price=price;
}

     public String getBrand(){
            return brand;
}
        public String getModel(){
            return model;
}

       public double getPrice(){
            return price;
}
       public void showCarDetails(){
         System.out.println("Car Brand Is:"+brand);
          System.out.println("Car Model Is:"+model);
           System.out.println("Car Price Is:"+price);
}
}


