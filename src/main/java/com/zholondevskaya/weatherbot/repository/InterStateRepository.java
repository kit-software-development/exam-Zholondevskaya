package com.zholondevskaya.weatherbot.repository;

import com.zholondevskaya.weatherbot.entity.InterState;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterStateRepository  extends CrudRepository<InterState, Long> {}
