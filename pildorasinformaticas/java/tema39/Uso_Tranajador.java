package tema39;

import tema33.Empleado;

public class Uso_Tranajador {

	public static void main(String[] args) {

		Trabajador[] misTrabajadores=new Trabajador[4];
		
		misTrabajadores[0]=new Trabajador("Paco Gomez", 85000, 1990, 12, 17);
		misTrabajadores[1]=new Trabajador("Estefania Lopez", 95000, 1995, 6, 2);
		misTrabajadores[2]=new Trabajador("Maria Martin", 105000, 2002, 3, 15);
		misTrabajadores[3]=new Trabajador("Carlos Gonzalez");
		
		for(Trabajador e:misTrabajadores){
			
			e.subesueldo(5);
			
		}
		
		for(Trabajador e:misTrabajadores) {
			
			System.out.println("Nombre: "+e.damenombre()+" Sueldo: "+e.damesueldo()+" Fecha de alta: "+e.damecontrato());
		}
	}

}
