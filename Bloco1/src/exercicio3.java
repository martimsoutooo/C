import java.util.Scanner;
import java.util.Stack;
import java.lang.Double;




public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Double> operandos = new Stack<>();
        int counter = 0;


        System.out.println("Insira uma expressão na notação pos-fixa: ");
        String[] expressao = sc.nextLine().split(" ");

        for(String elemento:expressao){
            try{
                operandos.push(Double.parseDouble(elemento));

            }catch(NumberFormatException e){

                Double resultado = calculator(elemento, operandos);
                operandos.push(resultado);
                if (operandos.size() == 1){
                    System.out.printf("Resultado: %s\n",resultado);
                }
                

            }
        }




    }

    public static Double calculator(String operador, Stack<Double> operandos){
        switch(operador){
            case "+":
                return operandos.pop() + operandos.pop();
            case "*":
                return operandos.pop() * operandos.pop();
            case "/":
                return operandos.pop() / operandos.pop();
            case "-":
                return operandos.pop() - operandos.pop();
            default:
                return null;
        }
    }



}


