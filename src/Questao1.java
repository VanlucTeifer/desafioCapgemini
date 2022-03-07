import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Questao1 {
  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);   //Instância de Scanner para pegar entrada do usuário
    List<Integer> lista = new ArrayList<>(); //Cria a lista de numeros
    boolean impar = false;                   //Cria variavel de controle
    int numero, total = 0, mediana;          //Criar as variaveis numero e total
    
    //Laço de repetição que aceita lista com total impar de elementos
    while(!impar) {
      System.out.println("Quantos números inteiros deseja adicionar na lista? (apenas quantidade impar)");
      total = scan.nextInt();
      scan.nextLine();
      if(total %2 == 0){
        System.out.println("Apenas quantidade impar!");
      }else
        impar = true;
    }
    
    //Laço de repetição para inserção dos elementos na lista
    for(int i = 1; i <= total; i++){
      System.out.printf("Número %d: ",i);
      numero = scan.nextInt();
      scan.nextLine();
      lista.add(numero);
    }
    //Organiza a lista em ordem crescente
    Collections.sort(lista);
    //Calcula a mediana da lista
    mediana = ((lista.size() + 1)/2) - 1;
    //Imprime a mediana da lista
    System.out.printf("%d", lista.get(mediana));
  }
}
