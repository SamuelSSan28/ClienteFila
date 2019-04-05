
package fila;

import java.util.ArrayList;


public class Fila<Item> {
    
    private Item[] a;
    private int tam;
    
    
     public Fila() {
      a = (Item[]) new Object[2];
      tam = 0;
   }
    
    
    boolean isEmpty(){
        return tam == 0;
    }
    
    public int size() {
	   return tam;
   }
    
    public void inserir(Item i){
        if(tam == a.length)
            resize(tam);
        a[tam++] = i;
    }
    
    public Item remover(){
        Item item = a[0];
        for(int i = 0; i< tam; i++){
            if(a[i+1] != null)
                a[i] = a[i+1];
        }
        tam--;
      if (tam > 0 && tam == a.length/4)
         resize(a.length/2);
      return item;
    }
    
    private void resize(int max) {
      Item[] temp;
      temp = (Item[]) new Object[max*tam];
      for (int i = 0; i < tam; i++)
         temp[i] = a[i];
       a = temp;
   }
    
    
}
