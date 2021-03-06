package br.com.isidrocorp.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.ecommerce.dao.DepartamentoDAO;
import br.com.isidrocorp.ecommerce.model.Departamento;

@RestController
public class DepartamentoController {
	
	@Autowired  // Autowired indica que o objeto dao não será dado NEW nele de forma explícita e
	            // ele ainda vai buscar um objeto que possa implementar a lógica da interface
	private DepartamentoDAO dao;
	
	@GetMapping("/departamentos")
	public List<Departamento> recuperarTodos(){
		return (List<Departamento>)dao.findAll();
	}
	
	
	@PostMapping("/departamentos")
	public Departamento incluirNovo(@RequestBody Departamento novo) {
		return dao.save(novo);
	}
	
	@PutMapping("/departamentos")
	public Departamento alterarDepartamento(@RequestBody Departamento atual) {
		return dao.save(atual);
	}
	

}
