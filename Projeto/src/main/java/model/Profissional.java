package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profissional implements Serializable{	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codProfissional; 
	private String linkLates;
	private String miniCurriculo;
	
	public Profissional(Integer codProfissional, String linkLates, String miniCurriculo) {
		super();
		this.codProfissional = codProfissional;
		this.linkLates = linkLates;
		this.miniCurriculo = miniCurriculo;
	}

	
	public Profissional () {}
	
	
	public Integer getCodProfissional() {
		return codProfissional;
	}

	public void setCodProfissional(Integer codProfissional) {
		this.codProfissional = codProfissional;
	}

	public String getLinkLates() {
		return linkLates;
	}

	public void setLinkLates(String linkLates) {
		this.linkLates = linkLates;
	}

	public String getMiniCurriculo() {
		return miniCurriculo;
	}

	public void setMiniCurriculo(String miniCurriculo) {
		this.miniCurriculo = miniCurriculo;
	}
	


	
	
	
	
	
	
	
}
