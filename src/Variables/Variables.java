package Variables;

public class Variables {
    public static void main(String[] args) {
        int myNumber = 999;
        int yourNumber;
        yourNumber = 1000;
        System.out.println("Your Number = "+yourNumber);
        yourNumber = 2000;
        System.out.println("Your Number = "+yourNumber+",  My Number = "+myNumber);

        boolean isVegetable=true;
        System.out.println("Is Vegetable = "+isVegetable);
        
        float myFloat = 10.0f;
        System.out.println("My Float = "+myFloat);

        char myChar = 'A';
        System.out.println("My Char = "+myChar);

        double myDouble = 10.0;
        System.out.println("My Double = "+myDouble);

        String myName = "Rohith";
        System.out.println("My Name = "+myName);

        String myFirstName = "Rohith";
        String myLastName = "B";
        String myFullName = myFirstName+" "+myLastName;
        System.out.println("My Full Name ="+myFullName);
    }
}
 