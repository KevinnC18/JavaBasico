package mundo;

import java.util.Scanner;

public class Person {

	private String name;
	private int age;


	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
//		System.out.print("Por favor ingrese un nombre: ");
//		String nombre1 = entrada.nextLine();
//		System.out.print("Por favor ingrese la edad: ");
//		int edad1 = Integer.parseInt(entrada.nextLine());
//		Person person1 = new Person(nombre1, edad1);
//		System.out.println("Name: "+person1.getName()+ ", Age: "+person1.getAge());
//		
//		System.out.print("Por favor ingrese un nombre: ");
//		String nombre2 = entrada.nextLine();
//		System.out.print("Por favor ingrese la edad: ");
//		int edad2 = Integer.parseInt(entrada.nextLine());
//		Person person2 = new Person(nombre2, edad2);
//		System.out.println("Name: "+person2.getName()+ ", Age: "+person2.getAge());
//		
//		if(person1.getAge() > person2.getAge()) {
//			System.out.println("La persona "+person1.getName()+ " es mayor");
//		}
//		else if (person2.getAge() > person1.getAge()){
//			System.out.println("La persona "+person2.getName()+ " es mayor");
//		}
//		else {
//			System.out.println("Las dos personas tienen la misma edad");
//		}
		
		System.out.print("Por favor ingrese una edad: ");
		int edad = entrada.nextInt();
		
		if((edad %2) == 0) {
			System.out.println("La edad de la persona es par.");
		}
		else {
			System.out.println("La edad de la persona es impar.");
		}
		
		entrada.close();
	}


}
