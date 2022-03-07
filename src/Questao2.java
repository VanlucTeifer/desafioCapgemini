import java.util.Scanner;

public class Questao2 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);//Instância de Scanner para pegar entrada do usuário
    int total,x, pares = 0; //Declaração das variáveis total, x, pares do tipo int
    
    System.out.println("Digite o total de números do vetor: ");
    total = scan.nextInt(); //Armazena o total de elementos do vetor na variável total
    scan.nextLine(); //Limpa o buffer do teclado
  
    System.out.println("Digite um inteiro para determinar a diferença entre os pares: ");
    x = scan.nextInt(); //Armazena a diferença entre os pares na variável x
    scan.nextLine();
    
    int[] n = new int[total]; //Declaração do vetor n com comprimento igual à variável total
    
    //laço de repetição para inserir os elementos na variável
    for(int i = 0;i < total; i++){
      System.out.printf("Número %d: ",i+1);
      n[i] = scan.nextInt();
      scan.nextLine();
    }
    
    //laços de repetição para a verificação e contagem dos pares
    for(int i = 0; i < n.length - 1; i++) {
      for(int j = i + 1; j < n.length; j++) {
        if(n[i] < n[j]){
          if((n[j] - n[i]) == x) {
            pares++;
          }
        }else if(n[i] > n[j]){
          if((n[i] - n[j]) == x){
            pares++;
          }
        }
      }
    }
    
    //Imprime o resultado total de pares
    System.out.println(pares);
  }
}
