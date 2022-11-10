package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IDepartamentoDAO;
import main.dto.Departamento;

@Service
public class DepartamentoServices implements IDepartamentoServices{

	@Autowired
	IDepartamentoDAO iDepartamentoDAO;
	
	@Override
	public List<Departamento> listarDepartamentos() {
		
		return iDepartamentoDAO.findAll();
	}

	@Override
	public Departamento buscarDepartamento(int codigo) {
		
		return iDepartamentoDAO.findById(codigo).get();
	}

	@Override
	public Departamento guardarDepartamento(Departamento departamento) {
		
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public Departamento actualizarDepartamento(Departamento departamento) {
		
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public void eliminarDepartamento(int codigo) {
		
		iDepartamentoDAO.deleteById(codigo);
	}

}
