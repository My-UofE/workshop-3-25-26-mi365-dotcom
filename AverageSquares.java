import java.util.Scanner;

public class AverageSquares {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the start value: ");
        int startNum = in.nextInt();
        

        System.out.println("Please enter the end value: ");
        int endNum = in.nextInt();
        

        System.out.println("You entered: " + startNum + " and " + endNum);

        double sum = 0;
        int count = 0;

        do {
            sum += startNum * startNum;
            count++;
            startNum++;
        }while(startNum <= endNum);


        double average = sum / count;

        System.out.println("Average of squares from " + startNum + " to " + endNum + ":");
        System.out.println(average);

        System.out.println();


    }
    
}
