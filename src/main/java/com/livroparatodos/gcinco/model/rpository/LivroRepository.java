package com.livroparatodos.gcinco.model.rpository;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.livroparatodos.gcinco.model.entity.Livro;

@RequestScoped
public class LivroRepository {

	@Inject
    private Session session;
 
    private Criteria createCriteria() {
        return session.createCriteria(Livro.class);
    }
 
    @SuppressWarnings("unchecked")
    public List<Livro> list() {
        return createCriteria().list();
    }
	
}
