package pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] pizza= sc.nextLine().split("\\s+");
        Pizza pizza1=new Pizza(pizza[1],Integer.parseInt(pizza[2]));
        pizza=sc.nextLine().split("\\s+");
        Dough dough=new Dough(pizza[1],pizza[2],Integer.parseInt(pizza[3]));
        pizza1.setDough(dough);

        pizza=sc.nextLine().split("\\s+");
        while (!pizza[0].equals("END")){
            Topping top=new Topping(pizza[1],Integer.parseInt(pizza[2]));
            pizza1.setToppings(top);
            pizza=sc.nextLine().split("\\s+");
        }

        System.out.println(pizza1);

    }
}
