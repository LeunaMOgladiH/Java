package tema39;

import tema39.Trabajador.Jefatura;

public class Uso_Trabajador {

	public static void main(String[] args) {
		
		Jefatura jefe_RRHH=new Jefatura("Alejandro", 154000, 1997, 4, 11);
		
		jefe_RRHH.estableceIncentivo(2570);

		Trabajador[] misTrabajadores=new Trabajador[5];
		
		misTrabajadores[0]=new Trabajador("Paco Gomez", 85000, 1990, 12, 17);
		misTrabajadores[1]=new Trabajador("Estefania Lopez", 95000, 1995, 6, 2);
		misTrabajadores[2]=new Trabajador("Maria Martin", 105000, 2002, 3, 15);
		misTrabajadores[3]=new Trabajador("Carlos Gonzalez");
		
		misTrabajadores[4]=jefe_RRHH; //polimorfismo. Principio de sustitucion
		
		for(Trabajador e:misTrabajadores){
			
			e.subesueldo(5);
			 
		}
		
		for(Trabajador e:misTrabajadores) {
			
			System.out.println("Nombre: "+e.damenombre()+" Sueldo: "+e.damesueldo()+" Fecha de alta: "+e.damecontrato());
		}
	}

}
