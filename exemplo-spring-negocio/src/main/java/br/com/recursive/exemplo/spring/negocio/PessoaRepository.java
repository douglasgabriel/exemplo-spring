package br.com.recursive.exemplo.spring.negocio;

import br.com.recursive.exemplo.spring.entidades.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author douglasgabriel
 */
@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long>{
    
}
