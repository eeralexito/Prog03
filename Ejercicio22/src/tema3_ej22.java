/*Este programa pide por teclado el nombre y la edad de 10 alumnos y muestra en pantalla el
n�mero de alumnos que son mayores de edad y el nombre y la edad del mayor.*/
import java.util.Scanner;
public class tema3_ej22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int mayores=0,edadMayor=0,edad=0,i=1;
		String nombre,nombreMayor="";
		do{
			System.out.println("Introduce el nombre: ");
			nombre=teclado.next();
			System.out.println("Introduce la edad: ");
			edad=teclado.nextInt();
			if(edad>=18)
				mayores++;
			if(i==1){//el primer alumno ser� el que mayor edad tenga
				edadMayor=edad;
				nombreMayor=nombre;
			}
			if(edad>edadMayor){
				edadMayor=edad;
				nombreMayor=nombre;
			}
			i++;
		}while(i<=10);
		System.out.println("El n�mero de alumnos mayores de edad es: " +mayores +".");
		System.out.println("El alumno " +nombreMayor +" con " +edadMayor +" a�os, es el alumno m�s mayor.");
		
	}

}
