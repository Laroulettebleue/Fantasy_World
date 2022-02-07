package com.nice.fantasy_world.dao;

import com.nice.fantasy_world.entities.Webtoon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebtoonsDao extends CrudRepository<Webtoon,Integer> {



}
