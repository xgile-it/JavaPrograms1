package Loops;

public class Ifelse {
    public static void main(String[]args)
    {
        int x=10;
        if(++x<10&&(x/0>10))
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Hi");
        }
    }
}
