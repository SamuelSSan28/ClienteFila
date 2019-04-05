
package fila;


public class ClienteFila {
     public static void main(String[] args) {
         Fila<String> fila = new Fila<String>();
         String str;
         System.out.println("Insira os elemntos na fila");
         do{
	         str = StdIn.readString();
	         if (!str.equals("-")) {
	           fila.inserir(str);
	           // System.out.println("Tamanho: "+fila.size());
	         }
	         else 
                     if (!fila.isEmpty()) 
	                 System.out.println(fila.remover()+ " ");
                     else
                         System.out.println("\nFila Vazia!!!\n");
                         
        
         }while (!str.equals("0"));
         
         
         
     }
    
}
