package Collection;

    import java.util.HashMap;
    public class HashMap2
    {
        public static void main(String[] args)
        {

            HashMap<Integer, String> languages = new HashMap<>();
            languages.put(1, "Java");
            languages.put(2, "Python");
            languages.put(3, "JavaScript");
            System.out.println("Original HashMap: " + languages);

            // change element with key 2
            languages.replace(2, "C++");
            System.out.println("HashMap using replace(): " + languages);
        }
    }

