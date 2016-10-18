package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_OFERTAAPLICADA_EGRE")
@IdClass(OfertaAplicadaEgresadoPK.class)
public class OfertaAplicadaEgresado implements Serializable {

	@Id
	@JoinColumn(name="ID_EGRESADO")
	@ManyToOne
	private Egresado codigoEgresado;
	
	@Id
	@JoinColumn(name="ID_OFERTA")
	@ManyToOne
	private OfertaLaboral codigoOferta;
	
	public OfertaAplicadaEgresado() {
		// TODO Auto-generated constructor stub
	}

	/** Constructor
	 * @param egresado
	 * @param oferta
	 */
	public OfertaAplicadaEgresado(Egresado egresado, OfertaLaboral oferta) {
		super();
		this.codigoEgresado = egresado;
		this.codigoOferta = oferta;
	}

	/**
	 * @return the egresado
	 */
	public Egresado getEgresado() {
		return codigoEgresado;
	}

	/**
	 * @param egresado the egresado to set
	 */
	public void setEgresado(Egresado egresado) {
		this.codigoEgresado = egresado;
	}

	/**
	 * @return the oferta
	 */
	public OfertaLaboral getOferta() {
		return codigoOferta;
	}

	/**
	 * @param oferta the oferta to set
	 */
	public void setOferta(OfertaLaboral oferta) {
		this.codigoOferta = oferta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoEgresado == null) ? 0 : codigoEgresado.hashCode());
		result = prime * result + ((codigoOferta == null) ? 0 : codigoOferta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OfertaAplicadaEgresado other = (OfertaAplicadaEgresado) obj;
		if (codigoEgresado == null) {
			if (other.codigoEgresado != null)
				return false;
		} else if (!codigoEgresado.equals(other.codigoEgresado))
			return false;
		if (codigoOferta == null) {
			if (other.codigoOferta != null)
				return false;
		} else if (!codigoOferta.equals(other.codigoOferta))
			return false;
		return true;
	}
	
	
	
	
	
}
