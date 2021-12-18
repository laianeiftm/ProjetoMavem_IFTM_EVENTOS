package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Certificado implements Serializable{	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codCertificado; 
	private String texto;
	private String dtEmissao;
	
	public Integer getCodCertificado() {
		return codCertificado;
	}
	public void setCodCertificado(Integer codCertificado) {
		this.codCertificado = codCertificado;
	}
	public String gettexto() {
		return texto;
	}
	public void settexto(String texto) {
		this.texto = texto;
	}
	public String getdtEmissao() {
		return dtEmissao;
	}
	public void setdtEmissao(String dtEmissao) {
		this.dtEmissao = dtEmissao;
	}
	
	public Certificado(Integer codCertificado, String texto, String dtEmissao) {
		super();
		this.codCertificado = codCertificado;
		this.texto = texto;
		this.dtEmissao = dtEmissao;
	}
	
}
	