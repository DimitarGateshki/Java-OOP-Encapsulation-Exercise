public class Product {
    private String name;
    private double cost;

    //Name getter
    public String getName() {
        return name;
    }

    //Name setter
    private void setName(String name) {
        if (name.equals("")||name.trim().isEmpty()){
            throw new  IllegalArgumentException("Name cannot be empty");

        }else {

            this.name = name;
        }
    }

    //Money getter
    public double getCost() {
        return cost;
    }

    //Money setter
    private void setCost(double cost) {
        if (cost<0){
            throw new  IllegalArgumentException("Money cannot be empty");
        }else {
            this.cost = cost;
        }
    }

    //Constructor
    public Product(String name, double cost) {
        this.setName(name);
        this.setCost(cost);
    }

}
