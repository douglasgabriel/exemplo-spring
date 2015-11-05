package br.com.recursive.exemplo.spring.negocio.services;

import br.com.recursive.exemplo.spring.entidades.Pessoa;
import br.com.recursive.exemplo.spring.negocio.PessoaRepository;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Named
public class PessoaServiceImpl implements PessoaService{
    
    private PessoaRepository dao;

    @Inject
    public void setDao(PessoaRepository dao) {
        this.dao = dao;
    }
    
    @Override
    public void salvar(Pessoa pessoa) {
        dao.save(pessoa);
    }
    
}
