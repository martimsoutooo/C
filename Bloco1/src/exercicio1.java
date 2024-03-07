import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) throws Exception {
        double op1 = 0;
        double op2 = 0;
        double resultado = 0;
        char operador = ' ';
        boolean inputValido = true;

        Scanner sc  = new Scanner(System.in);
        System.out.print("Digita uma operação (x + y): ");

        if (sc.hasNextDouble()) {
            op1 = sc.nextDouble();
        } else {
            System.err.println("Entrada inválida para o primeiro operando.");
            inputValido = false;
        }

        if (sc.hasNext() && inputValido) {
            operador = sc.next().charAt(0); 
        } else if (inputValido) {
            System.err.println("Entrada inválida para o operador.");
            inputValido = false;
        }

        if (sc.hasNextDouble() && inputValido) {
            op2 = sc.nextDouble();
        } else if (inputValido) {
            System.err.println("Entrada inválida para o segundo operando.");
            inputValido = false;
        }

        switch (operador) {
            case '+':
                resultado = op1 + op2;
                break;
            case '-':
                resultado = op1 - op2;
                break;
            case '*':
                resultado = op1 * op2;
                break;
            case '/':
                if (op2 == 0){
                    System.err.println("Não consegues dividir números por 0.");
                }
                resultado = op1 / op2;
                break;
            default:
                System.err.println("Operação não existente.");
                break;
                
        }

        System.out.printf("O resultado é :  %.2f\n", resultado);

        sc.close();
    }
}



