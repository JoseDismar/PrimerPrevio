package co.ufps.primerprevio.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Paciente {
	@Id
	private int id;
	private String documento;
	private String nombre;
	private String apellido;
	private String email;
	private char genero;
	private Date fechaNacimiento;
	private int peso;
	private int estatura;
	public Paciente(String documento, String nombre, String apellido, String email, char genero, Date fechaNacimiento,
			int peso, int estatura) {
		super();
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
		this.peso = peso;
		this.estatura = estatura;
	}
	
	

}
