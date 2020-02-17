package com.mwcc.mwccmoney.api.resource;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mwcc.mwccmoney.api.event.RecursoCriadoEvent;
import com.mwcc.mwccmoney.api.model.Pessoa;
import com.mwcc.mwccmoney.api.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	
	@GetMapping
	public List<Pessoa> findPessoas(){
		return pessoaRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Pessoa> salvar(@Valid @RequestBody Pessoa pessoa, HttpServletResponse response){
		Pessoa pessoaSalva = pessoaRepository.save(pessoa);
		publisher.publishEvent(new RecursoCriadoEvent(this, response, pessoaSalva.getCodigo()));
		return ResponseEntity.status(HttpStatus.CREATED).body(pessoaSalva);
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<?> byCodigo(@PathVariable Long codigo){
		Optional<Pessoa> pessoa = pessoaRepository.findById(codigo);
		
		return !(pessoa == null) ? ResponseEntity.of(pessoa) : ResponseEntity.notFound().build();
	}
}
