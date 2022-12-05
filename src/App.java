import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
/* Instanciação de um objeto do tipo file que recebe o encapsulamento 
  de acesso ao arquivo e cmainho do arquivo
  Leitura básica de arquivo  */
        
      File file = new File("C:\\Users\\Usuario\\Desktop\\DOC\\testes.txt");
      Scanner sc = null;
      try {
        //Instanciação do Scanner
        sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
      }
      catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
      }
      finally {
        if (sc != null) {
           sc.close();
        }
      }
    }
}
