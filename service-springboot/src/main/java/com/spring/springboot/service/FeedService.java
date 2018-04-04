package com.spring.springboot.service;

import com.spring.springboot.domain.Feed;

import java.util.List;

public interface FeedService {

	public List<Feed> getFeed();
	public List<Feed> getFeedNew();

}
