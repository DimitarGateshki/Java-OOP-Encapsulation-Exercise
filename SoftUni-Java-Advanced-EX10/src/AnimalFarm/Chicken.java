package farm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.trim().isEmpty()||name==null){
            throw new IllegalArgumentException("Name cannot be empty.");
        }else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age<=0||age>15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }else {
            this.age = age;
        }
    }

    public double productPerDay(){
        return calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        if (this.age>=0&&this.age<6){
            return 2;

        }else if(this.age>=6&&this.age<12){
            return 1;

        }else {
            return 0.75;

        }
    }


    @Override
    public String toString(){
        String output=String.format("Chicken %s (age %d) can produce %.2f eggs per day.",this.name,this.age,productPerDay());
        return output ;
    }

}
