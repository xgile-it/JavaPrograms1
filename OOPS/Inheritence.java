package OOPS;

class Animal2 {
    protected String name;

    protected void display() {
        System.out.println("I am an animal.");
    }
}

class Dog1 extends Animal2 {

    public void getInfo() {
        System.out.println("My name is " + name);
    }
}

class Main2 {
    public static void main(String[] args) {

        // create an object of the subclass
        Dog1 labrador = new Dog1();

        // access protected field and method
        // using the object of subclass
        labrador.name = "Rocky";
        labrador.display();

        labrador.getInfo();
    }
}