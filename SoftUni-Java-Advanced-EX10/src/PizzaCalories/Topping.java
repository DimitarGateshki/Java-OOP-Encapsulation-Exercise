package pizza;

import java.util.HashMap;
import java.util.Map;

public class Topping {
    private final static Map<String,Double> types=
            Map.of("Meat",1.2,
                    "Veggies",0.8,
                    "Cheese",1.1,
                    "Sauce",0.9);

    private String type;
    private double weight;



    private void setType(String type) {
        if (!type.contains(type)){
            throw new IllegalArgumentException("Cannot place "+type+" on top of your pizza.");
        }
        this.type = type;
    }



    private void setWeight(double grams) {
        if (grams<1||grams>50){
            throw new IllegalArgumentException(type + " weight should be in the range [1..50].");
        }
        this.weight = grams;
    }

    public Topping(String type, double grams) {
        this.setType(type);
        this.setWeight(grams);
    }

    public double calculateCalories(){
        double calories=this.weight*2*this.types.get(type);
        return calories;
    }
}
