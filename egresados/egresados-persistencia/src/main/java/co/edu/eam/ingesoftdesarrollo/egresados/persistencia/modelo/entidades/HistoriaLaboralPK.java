package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades;

import java.io.Serializable;

public class HistoriaLaboralPK implements Serializable{
	
	private int egresado;
	
	private int empresa;
	
	public HistoriaLaboralPK() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param egresado
	 * @param empresa
	 */
	public HistoriaLaboralPK(int egresado, int empresa) {
		super();
		this.egresado = egresado;
		this.empresa = empresa;
	}

	/**
	 * @return the egresado
	 */
	public int getEgresado() {
		return egresado;
	}

	/**
	 * @param egresado the egresado to set
	 */
	public void setEgresado(int egresado) {
		this.egresado = egresado;
	}

	/**
	 * @return the empresa
	 */
	public int getEmpresa() {
		return empresa;
	}

	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(int empresa) {
		this.empresa = empresa;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + egresado;
		result = prime * result + empresa;
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
		HistoriaLaboralPK other = (HistoriaLaboralPK) obj;
		if (egresado != other.egresado)
			return false;
		if (empresa != other.empresa)
			return false;
		return true;
	}
	
	

}
