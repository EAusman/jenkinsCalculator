import java.io.Console;

public class Main {
    public static void main(String args[]){
        Calculator calc = new Calculator();
        String input = "";
        System.out.println("Welcome to the console");
        System.out.println("Enter a command:");
        Console console = System.console();
        while(input!="quit"){
            input = console.readLine();
            String[] words = input.split(" ");
            if(words[0]=="add"){
                System.out.println(calc.add(Integer.valueOf(words[1]),Integer.valueOf(words[2])));
            }
            else if(words[0]=="subtract"){
                System.out.println(calc.subtract(Integer.valueOf(words[1]),Integer.valueOf(words[2])));
            }
            else if(words[0]=="multiply"){
                System.out.println(calc.multiply(Integer.valueOf(words[1]),Integer.valueOf(words[2])));
            }
            else if(words[0]=="divide"){
                System.out.println(calc.divide(Integer.valueOf(words[1]),Integer.valueOf(words[2])));
            }
            else if(words[0]=="fibonacciNumberFinder"){
                System.out.println(calc.fibonacciNumberFinder(Integer.valueOf(words[1])));
            }
            else if(words[0]=="binary"){
                System.out.println(calc.intToBinaryNumber(Integer.valueOf(words[1])));
            }
        }

    }
}
