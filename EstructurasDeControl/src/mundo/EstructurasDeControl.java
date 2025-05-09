package mundo;

import java.util.Scanner;

public class EstructurasDeControl {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//	int numero = -5;
//	if (numero > 0) {
//		System.out.println("El numero es positivo");
//	}
//	//Como 5 es mayor que 0, se ejecuta el codigo. Si fuera -5 el codigo no se ejecutaria
//	else {
//		System.out.println("El numero es negativo");
//	}
	//else se ejecuta si el numero es -5, de lo contrario se ejectuta el if
	
		
//	int nota = 75;
//	if (nota >= 90) 
//	{
//		System.out.println("Excelente");
//	} 
//	else if (nota >= 70) 
//	{
//		System.out.println("Bueno");
//	} 
//	else if (nota >= 50) 
//	{
//		System.out.println("Regular");
//	} 
//	else 
//	{
//		System.out.println("Insuficiente");
//	}
		
		
//		String usuario = "admin";
//		String contrasena = "1234";
//		if (usuario.equals("admin")) 
//		{
//		    if (contrasena.equals("1234")) 
//		    {
//		        System.out.println("Acceso concedido.");
//		    } 
//		    else 
//		    {
//		        System.out.println("Contraseña incorrecta.");
//		    }
//		} 
//		else 
//		{
//		    System.out.println("Usuario no reconocido.");
//		}
	
	
	//CICLOS
		
		for (int i = 0; i <= 20; i = i+2) 
		{
		    System.out.println("Número: " + i);
		}
		
		
		int[] numeros = {2, 4, 6, 8, 10};
		for (int num : numeros) 
		{
			System.out.println("Número: " + num);
		}
		
		
		int contador = 5;
		while (contador > 0) 
		{
			System.out.println("Contador: " + contador);
			contador--;
		}
		
		
		int numero;
		do 
		{
			System.out.print("Ingrese un número positivo: ");
			numero = scanner.nextInt();
		} 
		while (numero <= 0);
		System.out.println("Número ingresado: " + numero);
		scanner.close();
		
	}
}
