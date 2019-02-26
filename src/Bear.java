public class Bear extends Animal {

    //private String name;
    private String favoriteFood = "fish";

    public Bear(String name){

        super(name, "fish");
    }

    public void sleep(String name){

        System.out.println(super.name + " hibernates for 4 months.");
    }

//    public void eat(String food) {
//        System.out.println(name + " eats " + food);
//        if (food == favoriteFood){
//            System.out.println("YUM!!! " + name + " wants more " + food + ".");
//        } else {
//            this.sleep(name);
//        }
//    }
}
