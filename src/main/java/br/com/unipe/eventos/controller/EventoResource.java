package br.com.unipe.eventos.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unipe.eventos.models.Evento;
import br.com.unipe.eventos.repository.EventoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="API REST EVENTOS")
@RestController
@RequestMapping("/evento")
public class EventoResource {

	@Autowired
	private EventoRepository er;
	
	@ApiOperation(value="Retorna uma lista de eventos")
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Evento> listaEvento() {
		Iterable<Evento> listaEventos = er.findAll();
		return listaEventos;
	}
	
	@ApiOperation(value="Salva um evento")
	@PostMapping()
	public Evento cadastrarEvento(@RequestBody @Valid Evento evento) {
		return er.save(evento);
	}
	
	@ApiOperation(value="Deleta um eventos")
	@DeleteMapping
	public Evento deletaEvento(@RequestBody Evento evento) {
		er.delete(evento);
		return evento;
	}
	
	
	@ApiOperation(value="Retorna um Evento")
	@GetMapping(value="/{codigo}", produces="application/json")
	public @ResponseBody Evento evento(@PathVariable(value="codigo") long codigo) {
		Evento evento = er.findByCodigo(codigo);
		return evento;
	}
	
	
}
