import java.util.Arrays;

class MetodosOrdenamiento{
	
	static class Burbuja {
		
		public static void ordenacionBurbuja1(int [] numeros) {
			int comparaciones=0;
			int intercambios=0;
			
			long ini = System.nanoTime();
			for (int i = 1; i < numeros.length; i++) {
				for (int j = 0; j <= numeros.length-i-1; j++) {
					comparaciones+=1;
					if(numeros[j]>numeros[j+1]) {
						intercambios+=1;
						int aux = numeros[j];
						numeros[j]=numeros[j+1];
						numeros[j+1]=aux;
					}
				}
			}
			long fin = System.nanoTime();
			
			System.out.println("tiempo de ejecucion en nanosegundos:"+(fin-ini));
			System.out.println("cantidad de comparaciones:"+comparaciones);
			System.out.println("cantidad de intercambios:"+intercambios);
			
			
		}
		public static void ordenacionBurbuja2(int [] numeros) {
			int comparaciones=0;
			int intercambios=0;
			
			int i =1;
			boolean ordenado=false;
			long ini = System.nanoTime();
			while (i<numeros.length) {
				i+=1;
				ordenado=true;
				for (int j = 0; j < numeros.length-i-1; j++) {
					comparaciones+=1;
					if(numeros[j]>numeros[j+1]) {
						intercambios+=1;
						ordenado=false;
						int aux = numeros[j];
						numeros[j]=numeros[j+1];
						numeros[j+1]=aux;
					}
				}
			}
			long fin = System.nanoTime();
			System.out.println("tiempo de ejecucion en nanosegundos:"+(fin-ini));
			
		}
		public static void ordenacionBurbuja3(int [] numeros) {
			
			for (int i = 1; i < numeros.length; i++) {
				for (int j = 0; j <= numeros.length-i-1; j++) {
					if(numeros[j]>numeros[j+1]) {
						int aux = numeros[j];
						numeros[j]=numeros[j+1];
						numeros[j+1]=aux;
					}
				}
			}
			
		}
		public static void mostrarVector(int [] numeros) {
			System.out.println(Arrays.toString(numeros));
		}
		
	}
	
}

public class PruebaMetodosOrdenamiento{
	
	public static void main(String[] args) {
	
		int numeros[]= {1,963,21,98,76,11};
		
		MetodosOrdenamiento.Burbuja.mostrarVector(numeros);
		MetodosOrdenamiento.Burbuja.ordenacionBurbuja1(numeros);
		MetodosOrdenamiento.Burbuja.mostrarVector(numeros);
		MetodosOrdenamiento.Burbuja.ordenacionBurbuja2(numeros);
		MetodosOrdenamiento.Burbuja.mostrarVector(numeros);
		
		
	}
	
	
}