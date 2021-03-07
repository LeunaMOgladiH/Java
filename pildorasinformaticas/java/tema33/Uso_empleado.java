package tema33;

import tema42.Jefatura;

public class Uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Empleado empleado1=new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		Empleado empleado2=new Empleado("Estefania Lopez", 95000, 1995, 6, 2);
		Empleado empleado3=new Empleado("Maria Martin", 105000, 2002, 3, 15);
		
		
		empleado1.subesueldo(5);
		empleado2.subesueldo(5);
		empleado3.subesueldo(5);
		
		System.out.println("Nombre: "+empleado1.damenombre()+" Sueldo: "+empleado1.damesueldo()+" Fecha de alta: "+empleado1.damecontrato());
		System.out.println("Nombre: "+empleado2.damenombre()+" Sueldo: "+empleado2.damesueldo()+" Fecha de alta: "+empleado2.damecontrato());
		System.out.println("Nombre: "+empleado3.damenombre()+" Sueldo: "+empleado3.damesueldo()+" Fecha de alta: "+empleado3.damecontrato());*/
		
		Jefatura jefe_RRHH=new Jefatura("Manuel Hidalgo", 55000, 1985, 3, 25);
		
		Empleado[] misEmpleados=new Empleado[3];
		
		misEmpleados[0]=new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		misEmpleados[1]=new Empleado("Estefania Lopez", 95000, 1995, 6, 2);
		misEmpleados[2]=new Empleado("Maria Martin", 105000, 2002, 3, 15);
		
		for(Empleado e:misEmpleados){
			
			e.subesueldo(5);
			
		}
		
		for(Empleado e:misEmpleados) {
			
			System.out.println("Nombre: "+e.damenombre()+" Sueldo: "+e.damesueldo()+" Fecha de alta: "+e.damecontrato());
		}
	}

}
