package pizza;

import java.util.Map;

public class Dough {
    private final static Map<String,Double> FLOUR_TYPE=
            Map.of("White",1.5,
                    "Wholegrain",1.0);
    final static Map<String,Double> BAKE_TYPE=
            Map.of("Crispy",0.9,
                    "Chewy",1.1,
                    "Homemade",1.0);


    private String flourType;
    private String bakingTechnique;
    private double weight;


    private void setFlourType(String flourType) {
        if (!FLOUR_TYPE.containsKey(flourType)){
            throw new IllegalArgumentException("Invalid type of dough.");
        }else {
            this.flourType = flourType;
        }
    }



    private void setBakingTechnique(String bakingTechnique) {
        if (!BAKE_TYPE.containsKey(bakingTechnique)){
            throw new IllegalArgumentException("Invalid type of dough.");
        }else {
            this.bakingTechnique = bakingTechnique;
        }
    }



    private void setWeight(double weight) {
        if (weight<=0||weight>200){

            throw new IllegalArgumentException("Invalid type of dough.");
        }else {
            this.weight = weight;
        }
    }

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }


    public double calculateCalories(){
        double calories=this.weight*2*FLOUR_TYPE.get(flourType)*BAKE_TYPE.get(bakingTechnique);
        return calories;
    }
}
