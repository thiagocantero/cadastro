package br.com.thiagocantero.cadastro.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.thiagocantero.cadastro.core.models.Client;

public interface ClientRepository  extends JpaRepository<Client, Long> {
    
}
