package model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;

@Entity
public class Inscricao implements Serializable{	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer codInscricao;
private String dtIncricao;
private float valorPago;

public Inscricao(Integer codInscricao, String dtIncricao, float valorPago) {
	super();
	this.codInscricao = codInscricao;
	this.dtIncricao = dtIncricao;
	this.valorPago = valorPago;
}

public Inscricao() {
}

public Integer getCodInscricao() {
	return codInscricao;
}

public void setCodInscricao(Integer codInscricao) {
	this.codInscricao = codInscricao;
}

public String getDtIncricao() {
	return dtIncricao;
}

public void setDtIncricao(String dtIncricao) {
	this.dtIncricao = dtIncricao;
}

public float getValorPago() {
	return valorPago;
}

public void setValorPago(float valorPago) {
	this.valorPago = valorPago;
}










}
