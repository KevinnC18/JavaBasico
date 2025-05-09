import java.util.Scanner;

public class HolaMundoPersonalizado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite su nombre: ");
			
		String nombre = entrada.nextLine();
		
		System.out.println("Hola "+nombre+ "! Bienvenido al curso de Java");
		entrada.close();
		
	}

}
