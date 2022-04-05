package com.rasmoo.api.rasfood.repository;

import com.rasmoo.api.rasfood.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EnderecoRepository extends JpaRepository<Endereco,Integer> {
    List<Endereco> findByCep(String cep);
}
