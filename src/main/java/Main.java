public class Main {
    public static void main(String args[]){
        Calculator calc = new Calculator();
        if(args[0]=="add"){
            System.out.println(calc.add(Integer.valueOf(args[1]),Integer.valueOf(args[2])));
        }
        else if(args[0]=="subtract"){
            System.out.println(calc.subtract(Integer.valueOf(args[1]),Integer.valueOf(args[2])));
        }
        else if(args[0]=="multiply"){
            System.out.println(calc.multiply(Integer.valueOf(args[1]),Integer.valueOf(args[2])));
        }
        else if(args[0]=="divide"){
            System.out.println(calc.divide(Integer.valueOf(args[1]),Integer.valueOf(args[2])));
        }
        else if(args[0]=="fibonacciNumberFinder"){
            System.out.println(calc.fibonacciNumberFinder(Integer.valueOf(args[1])));
        }
        else if(args[0]=="binary"){
            System.out.println(calc.intToBinaryNumber(Integer.valueOf(args[1])));
        }
    }
}
