package com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.br.model.*;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long>{

}
