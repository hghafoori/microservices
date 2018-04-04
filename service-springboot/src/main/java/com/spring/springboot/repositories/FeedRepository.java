package com.spring.springboot.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.springboot.domain.Feed;

@Repository
@EnableCassandraRepositories(basePackages={"com.spring.springboot.domain"})
public interface FeedRepository extends CrudRepository<Feed, UUID>{

	public Feed findById(UUID id);
	public List<Feed> findAll();
	
}
