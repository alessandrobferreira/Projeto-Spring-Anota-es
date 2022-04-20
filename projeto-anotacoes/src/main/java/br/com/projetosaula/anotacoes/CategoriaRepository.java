package br.com.projetosaula.anotacoes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetosaula.anotacoes.data.entity.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	
	public List<Categoria> findByDescricaoContaining(String descricao);

}
