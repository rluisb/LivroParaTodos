package com.livroparatodos.gcinco.controller;

import javax.inject.Inject;

import com.livroparatodos.gcinco.model.rpository.LivroRepository;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;

@Controller
@Path("/livro")
public class LivroController {

	@Inject
    private Result result;
    @Inject
    private LivroRepository livroRepository;
 
    @Get
    @Path("/list")
    public void listAll() {
        result.use(Results.json())
            .withoutRoot()
            .from(livroRepository.list())
            .serialize();
    }
	
}
