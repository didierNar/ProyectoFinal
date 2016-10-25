package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "T_SECTORLABORAL")
@NamedQueries({ @NamedQuery(name = SectorLaboral.LISTA_SECTORES, query = "SELECT s FROM SectorLaboral s") })
public class SectorLaboral implements Serializable {

	/**
	 * Obtiene la lista de sectores laborales
	 */
	public static final String LISTA_SECTORES = "SectorLaboral.sectores";

	@Id
	@Column(name = "ID_SECTOR")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codigo;

	@Column(name = "nombre")
	private String nombre;

	public SectorLaboral() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param codigo
	 * @param nombre
	 */
	public SectorLaboral(String nombre) {
		super();
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 *            a enviar
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
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nombre;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	/*
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
		SectorLaboral other = (SectorLaboral) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

}
