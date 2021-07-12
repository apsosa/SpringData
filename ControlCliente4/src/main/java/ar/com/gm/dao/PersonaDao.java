package ar.com.gm.dao;

import ar.com.gm.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long>{
    
}
