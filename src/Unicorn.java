public class Unicorn extends Animal {

    private String name;
    private String favoriteFood = "marshmallows";

    public Unicorn(String name){
        super(name, "marshmallows");
    }

    public void sleep(String name){
        System.out.println(name + " sleeps in a cloud.");
    }

}
