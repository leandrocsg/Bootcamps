package collections;

import java.util.ArrayList;
import java.util.List;

//Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], fa�a:

public class Lists {
	public static void main(String[] args) {
		
		System.out.println("Crie uma lista e adicione as sete notas: ");
		
		List<Double> notas = new ArrayList<Double>();
		notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        
        System.out.println(notas.toString());
        
        System.out.println("Exiba a posi��o da nota 5.0: " + notas.indexOf(5d));
        
        System.out.println("Adicione na lista a nota 8.0 na posi��o 4: ");
        notas.add(4 ,8d);
        System.out.println(notas);
        
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);
        
        System.out.println("Confira se a nota 5.0 est� na lista: " + notas.contains(5d));
        
        /*System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);*/
        
        
	}

}
