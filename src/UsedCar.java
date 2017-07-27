/**
 * Created by D.Cisero on 7/21/17.
 */

public class UsedCar extends Car {

    private double Mileage;
    private String type = "used";

    //create argument constructor

    public UsedCar (String make, String model, int year, double price, String type, double mileage) {
        super(make, model, year, price);
        this.type = type;
        this.Mileage = Mileage;
    }
        //create getters
        public String gettype() {

        return type;
        }

        public void settype(String type) {

        this.type = type;
    }
        public double getMileage() {

        return Mileage;
        }

        public void setMileage(double Mileage) {

        this.Mileage = Mileage;
    }
    @Override
    public String toString() {

        return super.toString() + " ("+ type + ")" + " " + Mileage;
    }
}

