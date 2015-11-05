package br.com.recursive.exemplo.spring.web.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping("/")
    public String index (){
        return "index.html";
    }
    
}
