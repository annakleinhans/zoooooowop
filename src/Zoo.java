public class Zoo {

    public static void main(String[] args){
        Zoo z = new Zoo();
       // z.sleep("Tigger");
//        z.eat("Tigger", "bacon");
//        z.eat("Tigger", "meat");
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        //tigger.eat("kibble");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");

    }
//    public static void sleep(String name){
//
//        System.out.println(name + " sleeps for 8 hours.");
//    }
//
//    private String favoriteFood = "bacon";
//
//    public void eat(String name, String food){
//        System.out.println(name + " eats " + food);
//        if ( favoriteFood == food){
//            System.out.println("YUM!!! " + name + " wants more " + food + ".");
//        } else {
//           this.sleep(name);
//        }
//    }
}
