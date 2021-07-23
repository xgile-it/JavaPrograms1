package OOPS;

abstract class Animal4 {
    abstract void makeSound();

}

class Dog3 extends Animal4 {

    // implementation of abstract method
    public void makeSound() {
        System.out.println("Bark bark.");

    }
}

class Main4 {
    public static void main(String[] args) {
        Dog3 d1 = new Dog3();
        d1.makeSound();

    }
}