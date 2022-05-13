package pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;



    public void setToppings(int toppings) {
        if (toppings<0||toppings>10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppings = new ArrayList<>(toppings);
    }

    private void setName(String name) {
        if (name.trim().isEmpty()||name==null||name.length()>15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }



    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Pizza(String name,  int toppings) {
        this.setName(name);
        setToppings(toppings);
    }

    public void setToppings(Topping topping){
        this.toppings.add(topping);
    }
    public double getOverallCalories(){
        return this.dough.calculateCalories()+
                this.toppings.stream().mapToDouble(Topping::calculateCalories).sum();
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f",this.name,getOverallCalories());
    }
}
