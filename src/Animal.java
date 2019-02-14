public class Animal {
    private String name;
    private String favoriteFood;

    public Animal(String name, String food){
        this.name = name;
        this.favoriteFood = food;
    }

    public void sleep(String name) {
        System.out.println(name + " sleeps for 8 hours.");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if (food == favoriteFood){
            System.out.println("YUM!!! " + name + " wants more " + food + ".");
        } else {
            this.sleep(name);
        }
    }
}
