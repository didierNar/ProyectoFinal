package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
/**
 * entidad Ciudad
 * @author LuchoBolivar
 *
 */
@Entity
@Table(name = "T_CIUDAD")
@NamedQueries({ @NamedQuery(name = Ciudad.CIUDADES_DEPTO, query = "SELECT c FROM Ciudad c WHERE c.departamento = ?1") })
public class Ciudad implements Serializable {

	/**
	 * Obtiene la lista de ciudades de un departemento
	 */
	public static final String CIUDADES_DEPTO = "Ciudad.ciudadesDepto";

	/**
	 * atributo codigoCiudad
	 */
	@Id
	@Column(name = "ID_CIUDAD")
	private int codigoCiudad;

	/**
	 * atributo departamento
	 */
	@JoinColumn(name = "ID_DEPARTAMENTO")
	@ManyToOne(cascade={})
	private Departamento departamento;

	/**
	 * atributo nombre
	 */
	@Column(name = "nombre_ciudad")
	private String nombre;

	/**
	 * constructor de la clase Ciudad
	 */
	public Ciudad() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param codigoCiudad
	 * @param departamento
	 * @param nombre
	 */
	public Ciudad(int codigoCiudad, Departamento departamento, String nombre) {
		super();
		this.codigoCiudad = codigoCiudad;
		this.departamento = departamento;
		this.nombre = nombre;
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
	 * @return the codigoCiudad
	 */
	public int getCodigoCiudad() {
		return codigoCiudad;
	}

	/**
	 * @param codigoCiudad
	 *            the codigoCiudad to set
	 */
	public void setCodigoCiudad(int codigoCiudad) {
		this.codigoCiudad = codigoCiudad;
	}

	/**
	 * @return the departamento
	 */
	public Departamento getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento
	 *            the departamento to set
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	

	/**
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nombre;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoCiudad;
		result = prime * result + ((departamento == null) ? 0 : departamento.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciudad other = (Ciudad) obj;
		if (codigoCiudad != other.codigoCiudad)
			return false;
		if (departamento == null) {
			if (other.departamento != null)
				return false;
		} else if (!departamento.equals(other.departamento))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

}
