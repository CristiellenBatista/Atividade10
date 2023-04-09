import java.util.Scanner;

public class Atividade10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double celsius, fahrenheit;
        System.out.println("Digite a temperatura em graus Celsius: ");
        celsius = input.nextDouble();

        fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " graus Celsius equivalem a " + fahrenheit + " graus Fahrenheit.");
    }

}
