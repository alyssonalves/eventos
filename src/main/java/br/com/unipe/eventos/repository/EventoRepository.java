package br.com.unipe.eventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unipe.eventos.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, String> {
	
	Evento findByCodigo(long codigo);

}
