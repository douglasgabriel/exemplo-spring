package br.com.recursive.exemplo.spring.web.controladores;

import br.com.recursive.exemplo.spring.entidades.Pessoa;
import br.com.recursive.exemplo.spring.negocio.services.PessoaService;
import br.com.recursive.exemplo.spring.negocio.services.PessoaServiceImpl;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Controller
@RequestMapping("/pessoa")
public class PessoaControlador {

    @Inject
    private PessoaService service;
    
    @RequestMapping("/salvar")
    public String salvar (Pessoa pessoa){
        service.salvar(pessoa);
        return "/";
    }
    
}
