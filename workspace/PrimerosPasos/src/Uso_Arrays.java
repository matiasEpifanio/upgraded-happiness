
public class Uso_Arrays {

	public static void main(String[] args) {
		
		int [] mi_matriz = {5, 38, -15, 92, 71};
		
		for (int i = 0; i < mi_matriz.length; i++) {
			System.out.println(mi_matriz[i]);
		}
	
		String [] paises = {"España","Mexico","Colombia","Peru"};
	
	
		for (String elemento:paises) {
		
			System.out.println("Pais: " + elemento);
		}
	
	}

}
