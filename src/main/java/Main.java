import java.io.Console;

public class Main {
    public static void main(String args[]){
        Calculator calc = new Calculator();
        String input = "";
        System.out.println("Welcome to the console");
        Console console = System.console();
        while(input!="quit"){
            input = console.readLine("Enter a command:");
            String[] words = input.split(" ");
            if(words[0].equals("add")){
                System.out.println(calc.add(Integer.valueOf(words[1]),Integer.valueOf(words[2])));
            }
            else if(words[0].equals("subtract")){
                System.out.println(calc.subtract(Integer.valueOf(words[1]),Integer.valueOf(words[2])));
            }
            else if(words[0].equals("multiply")){
                System.out.println(calc.multiply(Integer.valueOf(words[1]),Integer.valueOf(words[2])));
            }
            else if(words[0].equals("divide")){
                System.out.println(calc.divide(Integer.valueOf(words[1]),Integer.valueOf(words[2])));
            }
            else if(words[0].equals("fibonacciNumberFinder")){
                System.out.println(calc.fibonacciNumberFinder(Integer.valueOf(words[1])));
            }
            else if(words[0].equals("binary")){
                System.out.println(calc.intToBinaryNumber(Integer.valueOf(words[1])));
            }
        }

    }
}
