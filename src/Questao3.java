import java.util.Scanner;

public class Questao3 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    String s, noSpace, saida="";
    int T, posicao = 0, linhas, colunas;
    
  
    System.out.print("Digite um texto: ");
    s = scan.nextLine();
    noSpace = s.replaceAll("\\s+",""); //Remove os espaços em branco no texto
    T = noSpace.length(); //Armazena o comprimento do texto sem os espaços em branco
    
    linhas = (int)Math.round(Math.sqrt(T)); //Faz o cálculo para criptografia
    colunas = linhas;
    char[][] cripto = new char[linhas][colunas]; //Cria um vetor bidimensional para a criptografia
    
    if(linhas*colunas >= T){ //Verifica se linhhas*colunas é maior que o comprimento do texto sem espaços
      for(int i = 0; i < linhas; i++) { //Laços de repetição para fazer a criptografia
        for(int j = 0; j < colunas; j++) {
          if(posicao < T){
            cripto[i][j] = noSpace.charAt(posicao);
            posicao++;
          }else
            break;
        }
      }
      for(int i = 0; i < linhas ; i++) { //Laços de repetição para remover o lixo do vetor bidimensional
        for(int j = 0; j < colunas; j++) {
          if(!Character.isAlphabetic(cripto[i][j])){
            cripto[i][j] = ' ';
          }
        }
      }
    }
    
    for(int i = 0; i < linhas; i++) { //Laços de repetição para inserir o texto criptografado
      for(int j = 0; j < colunas; j++) {
        saida = saida.concat(String.valueOf(cripto[j][i]));
      }
      saida = saida.concat(" ");
    }
    
    System.out.println(saida); //Imprime o texto criptografado
  }
}
