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
import main.services.DepartamentoServices;

@RestController
@RequestMapping("/api")
public class DepartamentoControllers {

	@Autowired
	DepartamentoServices departamentoServices;
	
	@GetMapping("/departamentos")
	public List<Departamento> listarDepartamentos(){
		return departamentoServices.listarDepartamentos();
	}
	
	@GetMapping("/departamentos/{codigo}")
	public Departamento buscarDepartamento(@PathVariable(name="codigo") int codigo) {
		return departamentoServices.buscarDepartamento(codigo);
	}
	
	//Falta método para traer todos los empleados de cada departamento
	
	@PostMapping("/departamentos")
	public Departamento agregarDepartamento(@RequestBody Departamento departamento) {
		
		return departamentoServices.guardarDepartamento(departamento);
	}
	
	@PutMapping("/departamentos/{codigo}")
	public Departamento actualizarDepartamento(@PathVariable(name="codigo") int codigo, @RequestBody Departamento departamento) {
		Departamento departamentoSeleccionado = departamentoServices.buscarDepartamento(codigo);
		
		departamentoSeleccionado.setNombre(departamento.getNombre());
		departamentoSeleccionado.setPresupuesto(departamento.getPresupuesto());
		
		return departamentoServices.actualizarDepartamento(departamentoSeleccionado);
	}
	
	@DeleteMapping("/departamentos/{codigo}")
	public void eliminarDepartamento(@PathVariable(name="codigo")int codigo) {
		departamentoServices.eliminarDepartamento(codigo);
	}
}
