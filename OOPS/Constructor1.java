package OOPS;

class Constructor1 {
    private String name;
    Constructor1() {
        System.out.println("Constructor Called:");
        name = "Programme";
    }

    public static void main(String[] args) {

        Constructor1 obj = new Constructor1();
        System.out.println("The name is " + obj.name);
    }
}