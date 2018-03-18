package br.com.SpringApp.SpringApp.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.SpringApp.SpringApp.model.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
	Evento findByCodigo(long codigo);
}
