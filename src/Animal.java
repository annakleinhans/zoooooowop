public class Animal {
    public String name;
    public String favoriteFood;

    static int population = 0;

    public Animal(String name, String food){
        this.name = name;
        this.favoriteFood = food;
        population++;
    }

    public void sleep(String name) {

        System.out.println(name + " sleeps for 8 hours.");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if (favoriteFood.equals(food)){
            System.out.println("YUM!!! " + name + " wants more " + food + ".");
        } else {
            this.sleep(name);
        }
    }
}
