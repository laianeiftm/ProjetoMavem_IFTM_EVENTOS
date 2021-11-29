package model;

//comentário bruno
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;

@Entity
public class Categoria implements Serializable{	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer codCategoria;
private String tipo;


public Categoria() {

}


public Categoria(Integer codCategoria, String tipo) {
	super();
	this.codCategoria = codCategoria;
	this.tipo = tipo;
}


public Integer getCodCategoria() {
	return codCategoria;
}


public void setCodCategoria(Integer codCategoria) {
	this.codCategoria = codCategoria;
}


public String getTipo() {
	return tipo;
}


public void setTipo(String tipo) {
	this.tipo = tipo;
}







}
