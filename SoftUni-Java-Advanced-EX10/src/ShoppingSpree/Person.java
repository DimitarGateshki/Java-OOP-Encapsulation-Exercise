import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    //Constructor
    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products=new ArrayList<>();
    }

    //Money setter
    private void setMoney(double money) {
        if (money<0){
            throw new  IllegalArgumentException("Money cannot be empty");
        }else {
            this.money = money;
        }
    }

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

    //Product add
    public void buyProduct(Product product){
        if (this.money>=product.getCost()) {
            this.setMoney(this.money-product.getCost());
            this.products.add(product);
            System.out.println(this.name+" bought "+product.getName());
        }else {
            String out=(this.name+" can't afford "+product.getName());
            throw  new IllegalArgumentException(out);

        }
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();

        if (this.products.isEmpty()){
            return String.format("%s - Nothing bought",this.name);
        }else {
            builder.append(this.name+" - ");
            for (int i = 0; i <this.products.size()-1 ; i++) {
                builder.append(this.products.get(i).getName()+", ");
            }
            builder.append(this.products.get(this.products.size()-1).getName());

        }
        return builder.toString();
    }
}
