import java.nio.file.FileSystemNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.Integer;

public class exercicio4 {
    public static void main(String[] args){
        Map<String, Integer> numbers = new HashMap<>();

        try{
            Scanner reader = new Scanner("numbers.txt");
            while(reader.hasNextLine()){
                String[] temp = reader.nextLine().split("-");
                numbers.put(temp[1],Integer.parseInt(temp[0]));
            }
            reader.close();
        }catch(FileSystemNotFoundException e){
            System.err.printf("Erro: %s\n", e);
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");

        int number = sc.nextInt();
        
        for(String word:args){
            int numero = numbers.get(word);
            //Falta "somar" a string para depois dar print
            if(word.contains("-")){
                String[] palavrasSeparadas = word.split("-");
                for(String outraWord:palavrasSeparadas){
                    int outroNumero = numbers.get(outraWord);
                    //Falta "somar" a string para depois dar print
                }
            }
        }

        
        sc.close();
        
    }
}
