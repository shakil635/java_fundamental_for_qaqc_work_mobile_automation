public class InterfaceLearn  implements  Interface2 ,Interface3{
    /*
    InterfaceLearn class  Interface2 k implement kore.
    Interface2 er modde  bananno sob blueprint (abastrac) method gula InterfaceLearn Ai class e (requried) babohar kora hocce. method body Ai class e bosano hoice.
    single and multiple interface k implement kora jay multiple hole , deya ak ba akadhik

     */

    public static void main(String[] args) {

        InterfaceLearn interfaceLearn =new InterfaceLearn();
        interfaceLearn.checkingBalance();
        interfaceLearn.payCreditCard();
        interfaceLearn.transferBalance();
        interfaceLearn.loging();
        /*
         InterfaceLearn interfaceLear n =new InterfaceLearn();, new InterfaceLearn() er return type InterfaceLearn r instance name interfaceLearn.

         */

        Interface2 interface2 = new InterfaceLearn();
        /*
         Interface2 interface 2 = new InterfaceLearn();, new InterfaceLearn() er return type Interface2.
         tai InterfaceLearn er kono method Er acces kora jabe na interface2 Ai instance deya. sudhu Interface2 Ar method gula asses kora jabe
         aita k bola hoy Run time Polymorphisim.


         */

         Interface3 interface3 =new InterfaceLearn();
         interface3.invesment();



    }

    @Override
    public void payCreditCard() {

        System.out.println("payCreditCard");

    }

    @Override
    public void transferBalance() {
        System.out.println("transferBalance");

    }

    @Override
    public void checkingBalance() {
        System.out.println("checkingBalance");
    }

    public  void loging(){
        System.out.println("loging..");
    }

    @Override
    public void invesment() {

    }
}





/*

** implement and inherited both;

interface AnimalBehavior {
    void makeSound();
}

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal implements AnimalBehavior {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();        // Inherited from Animal
        dog.makeSound();  // Implemented from AnimalBehavior
    }
}

 */



