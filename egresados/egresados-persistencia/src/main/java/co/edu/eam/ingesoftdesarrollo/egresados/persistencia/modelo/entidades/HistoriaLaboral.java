package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_HIST_LABORAL")
@IdClass(HistoriaLaboralPK.class)
public class HistoriaLaboral implements Serializable {
	
	@Id
	@JoinColumn(name="ID_EGRESADO")
	@ManyToOne(cascade={})
	private InformacionLaboral egresado;
	
	@Id
	@JoinColumn(name="NIT")
	@ManyToOne(cascade={})
	private Empresa empresa;

	
	public HistoriaLaboral() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param egresado
	 * @param empresa
	 */
	public HistoriaLaboral(InformacionLaboral egresado, Empresa empresa) {
		super();
		this.egresado = egresado;
		this.empresa = empresa;
	}

	/**
	 * @return the egresado
	 */
	public InformacionLaboral getEgresado() {
		return egresado;
	}

	/**
	 * @param egresado the egresado to set
	 */
	public void setEgresado(InformacionLaboral egresado) {
		this.egresado = egresado;
	}

	/**
	 * @return the empresa
	 */
	public Empresa getEmpresa() {
		return empresa;
	}

	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((egresado == null) ? 0 : egresado.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
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
		HistoriaLaboral other = (HistoriaLaboral) obj;
		if (egresado == null) {
			if (other.egresado != null)
				return false;
		} else if (!egresado.equals(other.egresado))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		return true;
	}
	
	
	
	

}
