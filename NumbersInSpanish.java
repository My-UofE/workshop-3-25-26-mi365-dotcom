public class NumbersInSpanish {
    public static void main(String[] args) {
       // read the first argument passed to the program
       int number = Integer.parseInt(args[0]); 

       switch(number) {
        case 1:
            System.out.println("uno");
        case 2:
            System.out.println("dos");
        case 3:
            System.out.println("tres");
        case 4:
            System.out.println("cuatro");
        case 5:
            System.out.println("cinco");
        default:
            System.out.println("Sorry I don't know that");
       }



       // delete the line below and replace with your code
       System.out.println(number);
    }
 }