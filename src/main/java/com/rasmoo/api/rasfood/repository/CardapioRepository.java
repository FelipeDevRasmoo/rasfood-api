package com.rasmoo.api.rasfood.repository;

import com.rasmoo.api.rasfood.entity.Cardapio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardapioRepository extends JpaRepository<Cardapio,Integer> {
}
