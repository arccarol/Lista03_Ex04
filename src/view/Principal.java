package view;

import model.ILista;
import model.Lista;

public class Principal {
	public static void main(String[] args) {
	
	ILista lista = new Lista();
	 int maior = 0;
	 int segundoMaior = 0;
	 
	 try {
		 lista.addFirst(3);
		 lista.add(5, 1);
		 lista.add(8, 2);
		 lista.add(12, 3);
		 lista.add(9, 4);
		 lista.add(7, 5);
		 lista.add(6, 6);
		 lista.add(2, 7);
		 lista.add(3, 8);
		 lista.add(7, 9);
		 lista.addLast(16);
		 System.out.print(" Lista = ");
	
		 for(int i=0; i<11; i++) {
		 System.out.print(lista.get(i) + " ");
		 if (i==0) {
			 maior = lista.get(i);
		
		 }if(lista.get(i)> maior) {
			 segundoMaior= maior;
			 maior = lista.get(i);
		 }if ((lista.get(i) > segundoMaior) && (lista.get(i)<maior)){
			 
			 segundoMaior= lista.get(i);
		 }
		 } 
		 System.out.println();
		 System.out.println(" Maior valor = "+maior);
		 System.out.println(" Segundo Maior valor = "+segundoMaior);
} catch(Exception e) {
	 e.printStackTrace();
}
}
}




