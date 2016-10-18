package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_PAIS")
public class Pais {

	@Column(name = "nombre")
	private String nombre;

	@Id
	@Column(name = "cod")
	private int cod;

	public Pais() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param cod
	 */
	public Pais(String nombre, int cod) {
		super();
		this.nombre = nombre;
		this.cod = cod;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the cod
	 */
	public int getCod() {
		return cod;
	}

	/**
	 * @param cod
	 *            the cod to set
	 */
	public void setCod(int cod) {
		this.cod = cod;
	}

}
