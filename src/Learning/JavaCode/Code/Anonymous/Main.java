package Learning.JavaCode.Code.Anonymous;

public class Main {
    public static void main(String[] args){
        /*
        Anonymous = A class that doesn't have a name. Cannot be reused.
                    Add custom behavior without having to create new class.
                    Ofter used for one time uses (TimerTask, Runnable, callback)
         */
        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("Scooby Doo says *Ruh Roh*");
            }
        };

        dog1.speak();
        dog2.speak();
    }
}
