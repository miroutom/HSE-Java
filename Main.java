import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws Matrix.MatrixExpection {
        System.out.println("Hello! Enter a command, please.\n1 - create a complex number, " +
                "2 - show a trigonometric form of a complex number,\n3 - add two complex numbers," +
                "4 - multiply two complex numbers,\n5 - create a matrix, 6 - add two matrices,\n" +
                "7 - multiply two matrices, 8 - transpose a matrix, 0 - exit.");
        while (true){
            Scanner scanner = new Scanner(System.in);
            int button = scanner.nextInt();
            if (button >= 1 && button <= 4) {
                Input_Output_ComplexNum button1 = new Input_Output_ComplexNum();
                button1.buttonChoice(button);
            }
            else if (button >= 5 && button <= 8){
                Input_Output_ComplexMatrix button1 = new Input_Output_ComplexMatrix();
                button1.buttonChoice(button);
            }
            else if (button == 0) {
                System.out.println("See you next time.");
                break;
            }
        }
    }
}
