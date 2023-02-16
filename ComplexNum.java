import java.util.Scanner;

public class ComplexNum {

    double real; //real part
    double img; //image part


    public ComplexNum(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public ComplexNum CreateComplexNum(double real, double img){
        return new ComplexNum(real, img);
    }

    //representation of a number like a+bi


    @Override
    public String toString() {
        if (img == 0) return real + "";
        if (real == 0) return img + "i";
        if (img > 0) return real + "+" + img + "i";
        return real + "" + img + "i";
    }

    //addition of two numbers
    public ComplexNum sum(ComplexNum num2){
        return new ComplexNum(this.real + num2.real, this.img + num2.img);
    }

    //multiplication of two numbers
    public ComplexNum mult(ComplexNum num2){
        return new ComplexNum((this.real*num2.real - this.img*num2.img),
                (this.real*num2.img + num2.real*this.img));
    }

    //trigonometric form
    public String trig(){
        double module = Math.sqrt(Math.pow(real, 2) + Math.pow(img, 2));
        double angle = Math.atan(img / real);
        return module + "(cos " + angle + " + " + "isin " + angle + ")";
    }

    public static void main(String[] args){

    }
}