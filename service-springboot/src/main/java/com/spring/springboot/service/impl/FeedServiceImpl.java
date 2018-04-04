package com.spring.springboot.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.spring.springboot.domain.Feed;
import com.spring.springboot.repositories.FeedRepository;
import com.spring.springboot.service.FeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedServiceImpl implements FeedService{

	
	
	@Autowired
	private FeedRepository feedRepository;
	
	@Override
	@HystrixCommand(fallbackMethod = "recoverMe")
	public List<Feed> getFeed() {
		if(true)
		throw new RuntimeException();
		return feedRepository.findAll();
	}

	@Override
	@HystrixCommand(fallbackMethod = "recoverMeNew")
	public List<Feed> getFeedNew() {
		if(true)
			throw new RuntimeException();
		return feedRepository.findAll();
	}
	public List<Feed> recoverMe() {
		return feedRepository.findAll();
	}
	public List<Feed> recoverMeNew() {
		return feedRepository.findAll();
	}



}
