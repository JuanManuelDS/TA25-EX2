package main.services;

import java.util.List;

import main.dto.Empleado;

public interface IEmpleadoServices {
	
	public List<Empleado> listarEmpleados();
	
	public Empleado buscarEmpleado(String dni);
	
	public Empleado guardarEmpleado(Empleado empleado);
	
	public Empleado actualizarEmpleado(Empleado empleado);
	
	public void eliminarEmpleado(String dni);
}
