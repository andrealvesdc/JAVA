package basicos;

import java.util.*;

public class ArrayReverso {
	private static Scanner in;

	public static void main(String[]args) {
		in = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do array");
		int n = in.nextInt();
		
		int array[] = new int[n];
		
		System.out.println("Entre com os valores do array");
		
		for(int i = 0; i <n; i++) {
			array[i] = in.nextInt();
		}
		
		int temp;
		
		int inicio = 0;
		int fim = n-1;
		
		while (inicio < fim) {
			temp = array[inicio];
			array[inicio] = array[fim];
			array[fim] = temp;
			
			inicio++;
			fim--;
					
		}
		
		for (int j = 0; j < n; j++) {
			System.out.println(array[j]);
		}
	}

}
