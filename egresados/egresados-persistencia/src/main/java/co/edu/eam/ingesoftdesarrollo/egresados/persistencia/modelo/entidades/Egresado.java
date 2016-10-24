package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_EGRESADO")
@NamedQueries({
	@NamedQuery(name = Egresado.LISTA_EGRESADOS, query = "SELECT e FROM Egresado e")
})
public class Egresado implements Serializable{
	
	/**
	 * Obtiene la lista de egresados registrados
	 */
	public static final String LISTA_EGRESADOS = "Egresado.listar";

	@Id
	@Column(name="ID_EGRESADO")
	private String codigoEgresado;
	
	@JoinColumn(name="ID_PROGRAMA")
	@ManyToOne(cascade={})
	private Programa codigoPrograma;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="tipo_documento")
	private String tipoDocumento;
	
	@Column(name="num_documento")
	private String numDocumento;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="num_tel")
	private String numTel;
	
	@OneToOne(mappedBy="egresado")
	private InfoAcademica infoAcademica;
	
	@OneToOne(mappedBy="egresado")
	private InformacionLaboral infoLab;
	
	public Egresado() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param codigoEgresado
	 * @param codigoPrograma
	 * @param nombre
	 * @param apellido
	 * @param tipoDocumento
	 * @param numDocumento
	 * @param correo
	 * @param numTel
	 */
	public Egresado(String codigoEgresado, Programa codigoPrograma, String nombre, String apellido, String tipoDocumento,
			String numDocumento, String correo, String numTel) {
		super();
		this.codigoEgresado = codigoEgresado;
		this.codigoPrograma = codigoPrograma;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDocumento = tipoDocumento;
		this.numDocumento = numDocumento;
		this.correo = correo;
		this.numTel = numTel;
	}


	/**
	 * @return the codigoPrograma
	 */
	public Programa getCodigoPrograma() {
		return codigoPrograma;
	}

	/**
	 * @param codigoPrograma the codigoPrograma to set
	 */
	public void setCodigoPrograma(Programa codigoPrograma) {
		this.codigoPrograma = codigoPrograma;
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the tipoDocumento
	 */
	public String getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * @return the numDocumento
	 */
	public String getNumDocumento() {
		return numDocumento;
	}

	/**
	 * @param numDocumento the numDocumento to set
	 */
	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the numTel
	 */
	public String getNumTel() {
		return numTel;
	}

	/**
	 * @param numTel the numTel to set
	 */
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	/**
	 * @return the codigoEgresado
	 */
	public String getCodigoEgresado() {
		return codigoEgresado;
	}

	/**
	 * @param codigoEgresado the codigoEgresado to set
	 */
	public void setCodigoEgresado(String codigoEgresado) {
		this.codigoEgresado = codigoEgresado;
	}
	
	
}
