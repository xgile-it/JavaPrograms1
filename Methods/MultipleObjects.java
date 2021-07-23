package Methods;

public class MultipleObjects {
        int x = 25;

        public static void main(String[] args) {
            MultipleObjects myObj1 = new MultipleObjects();
            MultipleObjects myObj2 = new MultipleObjects();
            myObj2.x = 75;
            System.out.println(myObj1.x);
            System.out.println(myObj2.x);
        }
    }