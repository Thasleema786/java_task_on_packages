package com.vehicles.app;
import com.vehicles.Car;
import com.vehicles.parts.Engine;
public class CarApp{
         public static void main(String[] args){
           Car car=new Car();
            car.setBrand("BMW");
            car.setModel("Sedans");
            car.setPrice(7000000);
          Engine eng=new Engine();
              eng.setEngineType("Inline Engines");
              eng.setHorsePower(255);
          car.showCarDetails();
            System.out.println();
             eng.showEngineDetails();
}
}
          