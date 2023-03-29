package com.abhi.repository;

import org.springframework.data.repository.CrudRepository;

import com.abhi.entity.PlayerEntity;

public interface PlayerRepository extends CrudRepository<PlayerEntity, Integer> {

}
