package com.distribuida;

import com.distribuida.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteDAO extends JpaRepository<Cliente, Integer> {

    Cliente findByCedula(String cedula);


    // comentario git hub desde casa

}
