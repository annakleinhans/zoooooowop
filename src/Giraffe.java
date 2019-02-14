public class Giraffe extends Animal {

    private String name;
    private String favoriteFood = "leaves";

    public Giraffe(String name) {
        super(name, "leaves");
    }

    public void eat(String name, String food) {
        System.out.println(name = " eats " + food + ".");
        if (favoriteFood == food) {
            System.out.println("YUM!!! " + name + " wants more " + food + ".");
            this.sleep(name);
        } else {
            System.out.print("YUCK!!! " + name + " will not eat " + food + ".");
        }
    }
}
