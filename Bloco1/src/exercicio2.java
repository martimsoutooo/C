import java.util.Scanner;
import java.util.HashMap;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Float> variaveis = new HashMap<>();

        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) break;

            String[] partes = input.split(" ");

            if (input.contains("=")) {
                float valor = 0;
                if (partes.length == 3) {
                    valor = obterValor(partes[2], variaveis);
                } else {
                    float x = obterValor(partes[2], variaveis);
                    float y = obterValor(partes[4], variaveis);
                    valor = calculator(x, y, partes[3], 1);
                }
                variaveis.put(partes[0], valor);
            } else if (partes.length == 1) {
                String varName = partes[0];
                if (variaveis.containsKey(varName)) {
                    System.out.printf("%.2f\n", variaveis.get(varName));
                } else {
                    System.err.println("Variável não definida: " + varName);
                }
            } else {
                float x = obterValor(partes[0], variaveis);
                float y = obterValor(partes[2], variaveis);
                calculator(x, y, partes[1], 0);
            }
        }

        sc.close();
    }

    static float calculator(float x, float y, String operador, int flag) {
        float resultado = 0;
        switch (operador) {
            case "+":
                resultado = x + y;
                break;
            case "-":
                resultado = x - y;
                break;
            case "*":
                resultado = x * y;
                break;
            case "/":
                if (y == 0) {
                    System.err.println("Não é possível dividir por 0.");
                    return 0;
                }
                resultado = x / y;
                break;
            default:
                System.err.println("Operação não existente.");
                return 0;
        }
        if (flag == 0) {
            System.out.printf("O resultado é: %.2f\n", resultado);
        }
        return resultado;
    }

    static float obterValor(String entrada, HashMap<String, Float> variaveis) {
        if (variaveis.containsKey(entrada)) {
            return variaveis.get(entrada);
        } else {
            try {
                return Float.parseFloat(entrada);
            } catch (NumberFormatException e) {
                System.err.println("Entrada inválida: " + entrada);
                return 0; 
            }
        }
    } 
} 
