public class Giraffe extends Animal {

    //private String name;
    //private String favoriteFood = "leaves";

    public Giraffe(String name) {

        super(name, "leaves");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food + ".");
        if (favoriteFood.equals(food)) {
            System.out.println("YUM!!! " + name + " wants more " + food + ".");
            this.sleep(name);
        } else {
            System.out.println("YUCK!!! " + name + " will not eat " + food + ".");
        }
    }
}
