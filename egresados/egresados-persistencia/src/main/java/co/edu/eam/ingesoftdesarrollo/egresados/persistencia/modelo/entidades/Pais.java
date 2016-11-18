package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
/**
 * Entidad Pais
 * @author LuchoBolivar
 *
 */
@Entity
@Table(name = "T_PAIS")
@NamedQueries({ @NamedQuery(name = Pais.PAISES, query = "SELECT p FROM Pais p") })
public class Pais {

	/**
	 * Obtiene la lista de paises
	 */
	public static final String PAISES = "Pais.listar";

	/**
	 * atributo nombre
	 */
	@Column(name = "nombre")
	private String nombre;

	/**
	 * atributo cod
	 */
	@Id
	@Column(name = "cod")
	private int cod;

	/**
	 * constructor de la clase Pais
	 */
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

	/**
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nombre;
	}	
	

}
