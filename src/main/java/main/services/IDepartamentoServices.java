package main.services;

import java.util.List;

import main.dto.Departamento;

public interface IDepartamentoServices {
	
	public List<Departamento> listarDepartamentos();
	
	public Departamento buscarDepartamento(Long codigo);
	
	public Departamento guardarDepartamento(Departamento departamento);
	
	public Departamento actualizarDepartamento(Departamento departamento);
	
	public void eliminarDepartamento(Long codigo);
}
