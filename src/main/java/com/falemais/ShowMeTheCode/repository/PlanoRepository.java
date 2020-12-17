package com.falemais.ShowMeTheCode.repository;

import com.falemais.ShowMeTheCode.entity.Plano;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanoRepository extends CrudRepository<Plano,Integer> {
}
