package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Entidad areaInteres
 * @author LuchoBolivar
 *
 */
@Entity
@Table(name="T_AREAINTERES")
public class AreasInteres implements Serializable{

	/**
	 * atributo codigo
	 */
	@Id
	@Column(name="ID_AREA")
	private int codigo;
	
	/**
	 * atributo nombre
	 */
	@Column(name="ID_NOMBRE")
	private String nombre;
	
	/**
	 * constructor de la clase AreaInteres
	 */
	public AreasInteres() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param codigo
	 */
	public AreasInteres(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	/* (non-Javadoc)
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
		AreasInteres other = (AreasInteres) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
	
	
	
	
}
