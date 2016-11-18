package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades;

import java.io.Serializable;

/**
 * entidad AreasEgresadosPK
 * @author LuchoBolivar
 *
 */
public class AreasEgresadoPK implements Serializable {

	/**
	 * atributo codigoEgresado
	 */
	private int codigoEgresado;

	/**
	 * atributo codigoArea
	 */
	private int codigoArea;

	/**
	 * @param codigoEgresado
	 * @param codigoArea
	 */
	public AreasEgresadoPK(int codigoEgresado, int codigoArea) {
		super();
		this.codigoEgresado = codigoEgresado;
		this.codigoArea = codigoArea;
	}

	/**
	 * @return the codigoEgresado
	 */
	public int getCodigoEgresado() {
		return codigoEgresado;
	}

	/**
	 * @param codigoEgresado
	 *            the codigoEgresado to set
	 */
	public void setCodigoEgresado(int codigoEgresado) {
		this.codigoEgresado = codigoEgresado;
	}

	/**
	 * @return the codigoArea
	 */
	public int getCodigoArea() {
		return codigoArea;
	}

	/**
	 * @param codigoArea
	 *            the codigoArea to set
	 */
	public void setCodigoArea(int codigoArea) {
		this.codigoArea = codigoArea;
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
		result = prime * result + codigoArea;
		result = prime * result + codigoEgresado;
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
		AreasEgresadoPK other = (AreasEgresadoPK) obj;
		if (codigoArea != other.codigoArea)
			return false;
		if (codigoEgresado != other.codigoEgresado)
			return false;
		return true;
	}

}
