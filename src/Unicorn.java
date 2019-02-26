public class Unicorn extends Animal {


    private String favoriteFood = "marshmallows";

    public Unicorn(String name){
        super(name, "marshmallows");
    }

    public void sleep(String name){
        System.out.println(name + " sleeps in a cloud.");
    }

    public void eat(String food){
        System.out.println(super.name + " eats " + food + ".");
        System.out.println("YUM!!! " + super.name + " wants more " + food + ".");
        this.sleep(super.name);
    }
}
