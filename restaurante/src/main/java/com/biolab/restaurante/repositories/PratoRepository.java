package com.biolab.restaurante.repositories;

import com.biolab.restaurante.entities.Prato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Para funcionar o Prato no banco de dados
@Repository
    public interface PratoRepository extends JpaRepository<Prato,Long> {

}
