package main.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="departamentos")
public class Departamento {
	
	@Id
	private Long codigo;
	
	@Column
	private String nombre;
	
	@Column
	private int presupuesto;
	
	@OneToMany
	@JoinColumn(name="codigo")
	private List<Empleado> empleados;
	
	public Departamento() {
		// TODO Auto-generated constructor stub
	}
	
	public Departamento(Long codigo, String nombre, int presupuesto, List<Empleado> empleados) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.empleados = empleados;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		return "Departamento [codigo=" + codigo + ", nombre=" + nombre + ", presupuesto=" + presupuesto + ", empleados="
				+ empleados + "]";
	}
	
}
