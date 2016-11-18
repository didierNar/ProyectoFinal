package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades;

import java.io.Serializable;

/**
 * Entidad OfertaAplicadaEgresadoPK
 * @author LuchoBolivar
 *
 */
public class OfertaAplicadaEgresadoPK implements Serializable{

	/**
	 * atributo codigoEgresado
	 */
	private int codigoEgresado;
	
	/**
	 * atributo codigoOferta
	 */
	private int codigoOferta;
	
	/**
	 * @param codigoEgresado
	 * @param codigoOferta
	 */
	public OfertaAplicadaEgresadoPK(int codigoEgresado, int codigoOferta) {
		super();
		this.codigoEgresado = codigoEgresado;
		this.codigoOferta = codigoOferta;
	}

	/**
	 * @return the codigoEgresado
	 */
	public int getCodigoEgresado() {
		return codigoEgresado;
	}

	/**
	 * @param codigoEgresado the codigoEgresado to set
	 */
	public void setCodigoEgresado(int codigoEgresado) {
		this.codigoEgresado = codigoEgresado;
	}

	/**
	 * @return the codigoOferta
	 */
	public int getCodigoOferta() {
		return codigoOferta;
	}

	/**
	 * @param codigoOferta the codigoOferta to set
	 */
	public void setCodigoOferta(int codigoOferta) {
		this.codigoOferta = codigoOferta;
	}

	/**
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoEgresado;
		result = prime * result + codigoOferta;
		return result;
	}

	/**
	 * (non-Javadoc)
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
		OfertaAplicadaEgresadoPK other = (OfertaAplicadaEgresadoPK) obj;
		if (codigoEgresado != other.codigoEgresado)
			return false;
		if (codigoOferta != other.codigoOferta)
			return false;
		return true;
	}
	
	
	
}
