package tema39;

import java.util.Arrays;

import tema42.Jefatura;

public class Uso_Trabajador {

	public static void main(String[] args) {
		
		Jefatura jefe_RRHH=new Jefatura("Alejandro", 154000, 1997, 4, 11);
		
		jefe_RRHH.estableceIncentivo(2570);

		Trabajador[] misTrabajadores=new Trabajador[6];
		
		jefe_RRHH.estableceIncentivo(2570);
		
		misTrabajadores[0]=new Trabajador("Paco Gomez", 85000, 1990, 12, 17);
		misTrabajadores[1]=new Trabajador("Estefania Lopez", 95000, 1995, 6, 2);
		misTrabajadores[2]=new Trabajador("Maria Martin", 105000, 2002, 3, 15);
		misTrabajadores[3]=new Trabajador("Carlos Gonzalez");
		misTrabajadores[4]=jefe_RRHH; //polimorfismo. Principio de sustitucion
		misTrabajadores[5]=new Jefatura("Maria", 95000, 1999, 5, 26);
		
		//Refundiciones o Casting de Objetos
		
		Jefatura jefa_Finanzas=(Jefatura) misTrabajadores[5];
		
		jefa_Finanzas.estableceIncentivo(100000);
		
		
		for(Trabajador e:misTrabajadores){
			
			e.subesueldo(5);
			 
		}
		
		//Tema49 uso de Interfaces, vamos a ordendar el Array de datos de modos ascendente mediante el interface
		// SORT, como es un abstracto la forma de llamarlo es mediante el metodo y despues el interface: Arrays.sort
		//Ademas para que haga un casteo de esta interfaz devemos implementar el interfaz COMPARABLE el metodo en la clase Trabajador,
		
		
		Arrays.sort(misTrabajadores);
		
		for(Trabajador e:misTrabajadores) {
			
			System.out.println("Nombre: "+e.damenombre()+" Sueldo: "+e.damesueldo()+" Fecha de alta: "+e.damecontrato());
		}
	}

}
