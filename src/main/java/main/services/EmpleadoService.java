package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IEmpleadoDAO;
import main.dto.Empleado;

@Service
public class EmpleadoService implements IEmpleadoServices {

	@Autowired
	IEmpleadoDAO iEmpleadoDAO;
	
	@Override
	public List<Empleado> listarEmpleados() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado buscarEmpleado(String dni) {
		
		return iEmpleadoDAO.findById(dni).get();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {

		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(String dni) {
		
		iEmpleadoDAO.deleteById(dni);
	}

}
