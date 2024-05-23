import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prosty kalkulator do przeprowadzenia operacji na dwóch liczbach rzeczywistych - możliwe operacje: +, -, *, /");
        System.out.print("Podaj pierwszą liczbę: ");

        double num1;
        while (!scanner.hasNextDouble()) {
            System.out.println("Błąd: To nie jest liczba!");
            System.out.print("Podaj pierwszą liczbę: ");
            scanner.next();
        }
        num1 = scanner.nextDouble();

        System.out.print("Podaj symbol operacji arytmetycznej (+, -, *, /): ");
        char operator;
        while (true) {
            String input = scanner.next();
            if (input.length() == 1 && "+-*/".indexOf(input.charAt(0)) != -1) {
                operator = input.charAt(0);
                break;
            } else {
                System.out.println("Błąd: Nieprawidłowy symbol operacji!");
                System.out.print("Podaj symbol operacji arytmetycznej (+, -, *, /): ");
            }
        }

        System.out.print("Podaj drugą liczbę: ");

        double num2;
        while (!scanner.hasNextDouble()) {
            System.out.println("Błąd: To nie jest liczba!");
            System.out.print("Podaj drugą liczbę: ");
            scanner.next();
        }
        num2 = scanner.nextDouble();

        double result = 0;
        boolean validInput = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Błąd: Nie można dzielić przez zero!");
                    validInput = false;
                }
                break;
            default:
                System.out.println("Błąd: Nieznany symbol operacji!");
                validInput = false;
        }

        if (validInput) {
            System.out.println("Wynik: " + result);
        }

        System.out.println("Naciśnij Enter, aby zakończyć program.");
        
        scanner.nextLine();
        scanner.nextLine();
        
        scanner.close();
    }
}
