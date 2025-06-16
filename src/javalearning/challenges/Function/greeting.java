package challenges.Function;

public class greeting {
    public static void main(String[] args) {
        // greetuser();
        pattern();
    }

    public static void pattern(){
        int rows = 0;
        while(rows<62){
            System.out.print("*");
            int cols = 0;
            while(cols<rows){
                System.out.print(" *");
                cols++;
            }
            System.out.println();
            rows++;
        }
    }
    public static void greetuser()
    {
        System.out.println("Hello ");
    }

    
}
