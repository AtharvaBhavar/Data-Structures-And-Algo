import java.util.Scanner;

public class Demo{

    public static void main(String[] args) {

        try (// Creates a reader instance which takes
                // input from standard input - keyboard
        Scanner reader = new Scanner(System.in)) {
            
            // nextInt() reads the next integer from the keyboard
            int number = reader.nextInt();

            // println() prints the following line to the output screen
            System.out.println("You entered: " + number);
        }
    }
}