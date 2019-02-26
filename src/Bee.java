public class Bee extends Animal{

    private String name;
    private String favoriteFood = "pollen";

    public Bee(String name) {
        super (name, "pollen");
    }

    public void sleep(String name){
        System.out.println(name + " never sleeps.");
    }

    public void eat(String food){
       //System.out.println(super.name + " eats " + food + ".");
        if (favoriteFood.equals(food)){
            System.out.println(super.name + " eats " + food + ".");
            System.out.println("YUM!!! " + super.name + " wants more pollen.");
            this.sleep(super.name);
        } else {
            System.out.println("YUCK!!! " + super.name + " will not eat " + food + ".");
        }
    }
}
