package main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.dto.Departamento;
import main.dto.Empleado;
import main.services.DepartamentoServices;
import main.services.EmpleadoService;

@RestController
@RequestMapping("/api")
public class EmpleadoControllers {

	
	@Autowired
	EmpleadoService empleadoService;
	DepartamentoServices departamentoServices;
	
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados(){
		
		return empleadoService.listarEmpleados();
	}
	
	@GetMapping("/empleados/{dni}")
	public Empleado buscarEmpleado(@PathVariable(name="dni") String dni) {
		
		return empleadoService.buscarEmpleado(dni);
	}
	
	@PostMapping("/empleados")
	public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
		
		return empleadoService.guardarEmpleado(empleado);
	}
	
	@PutMapping("/empleados/{dni}")
	public Empleado actualizarEmpleado(@PathVariable(name="dni") String dni, @RequestBody Empleado empleado) {
		
		Empleado empleadoSeleccionado = empleadoService.buscarEmpleado(dni);
		empleadoSeleccionado.setNombre(empleado.getNombre());
		empleadoSeleccionado.setApellidos(empleado.getApellidos());
		empleadoSeleccionado.setDepartamento(empleado.getDepartamento());
		
		return empleadoService.actualizarEmpleado(empleadoSeleccionado);
	}
	
	@DeleteMapping("/empleados/{dni}")
	public void eliminarEmpleado(@PathVariable(name="dni") String dni) {
		empleadoService.eliminarEmpleado(dni);
	}
	
}
