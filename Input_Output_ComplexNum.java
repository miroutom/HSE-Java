import java.util.Scanner;

public class Input_Output_ComplexNum {
    public void buttonChoice(int button){
        Scanner scanner = new Scanner(System.in);
        if (button == 1) {
            System.out.println("Enter a real part and an imaginary part of your complex number.");
            double real = scanner.nextDouble();
            double img = scanner.nextDouble();
            ComplexNum newComplexNum = new ComplexNum(real, img);
            newComplexNum.CreateComplexNum(real, img);
            System.out.println(newComplexNum.toString());
        }
        else if (button == 2){
            System.out.println("Enter a real part and an imaginary part of your complex number.");
            double real = scanner.nextDouble();
            double img = scanner.nextDouble();
            ComplexNum newComplexNum = new ComplexNum(real, img);
            newComplexNum.CreateComplexNum(real, img);
            System.out.println(newComplexNum.trig());
        }
        else if (button == 3){
            System.out.println("Enter a real part and an imaginary part of your first complex number.");
            double real = scanner.nextDouble();
            double img = scanner.nextDouble();
            ComplexNum first = new ComplexNum(real, img);
            first.CreateComplexNum(real, img);
            System.out.println("Enter a real part and an imaginary part of your second complex number.");
            real = scanner.nextDouble();
            img = scanner.nextDouble();
            ComplexNum second = new ComplexNum(real, img);
            second.CreateComplexNum(real, img);
            System.out.println("It's the addition of your two numbers.");
            System.out.println(first.sum(second));
        }
        else if (button == 4){
            System.out.println("Enter a real part and an imaginary part of your first complex number.");
            double real = scanner.nextDouble();
            double img = scanner.nextDouble();
            ComplexNum first = new ComplexNum(real, img);
            first.CreateComplexNum(real, img);
            System.out.println("Enter a real part and an imaginary part of your second complex number.");
            real = scanner.nextDouble();
            img = scanner.nextDouble();
            ComplexNum second = new ComplexNum(real, img);
            second.CreateComplexNum(real, img);
            System.out.println("It's the multiplication of your two numbers.");
            System.out.println(first.mult(second));
        }
    }
}
