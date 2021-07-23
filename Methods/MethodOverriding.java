package Methods;

class Language {
    public void displayInfo() {
        System.out.println("Common English Methods.Language");
    }
}

class Java extends Language {
    @Override
    public void displayInfo() {
        System.out.println("Methods.Java Programming Methods.Language");
    }
}

class Main5 {
    public static void main(String[] args) {

        // create an object of Methods.Java class
        Java j1 = new Java();
        j1.displayInfo();

        // create an object of Methods.Language class
        Language l1 = new Language();
        l1.displayInfo();
    }
}
