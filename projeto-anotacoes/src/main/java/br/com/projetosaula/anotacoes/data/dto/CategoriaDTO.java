package br.com.projetosaula.anotacoes.data.dto;

import java.io.Serializable;

import br.com.projetosaula.anotacoes.data.entity.Categoria;

public class CategoriaDTO implements Serializable {
	
	
	private static final long serialVersionUID = 1L; 
	
	private Integer idCategoria;
	private String descricaoCategoria;
	private boolean flativo;
	
	public CategoriaDTO() {}
	
	
	
	public CategoriaDTO(Integer idCategoria, String descricaoCategoria, boolean flativo) {
		super();
		this.idCategoria = idCategoria;
		this.descricaoCategoria = descricaoCategoria;
		this.flativo = flativo;
	}
	
	public Categoria convertToEntity() {
		return new Categoria(getIdCategoria(),
							getDescricaoCategoria(),
							isFlativo());
	}
	
     
	public Integer getIdCategoria() {
		return idCategoria;
	}



	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}



	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}



	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}



	public boolean isFlativo() {
		return flativo;
	}



	public void setFlativo(boolean flativo) {
		this.flativo = flativo;
	}


}
