package com.spring.springboot.resources;

import com.spring.springboot.domain.Feed;
import com.spring.springboot.service.FeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RefreshScope
@RestController
@Configuration
public class FeedController {

	@Autowired
	private FeedService feedService;

	@Value("${message:Hello default}")
	private String message;


	@RequestMapping("/feed")
	public List<Feed> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return feedService.getFeedNew();
	}
	@RequestMapping("/feedNew")
	public List<Feed> greetingNew(@RequestParam(value = "name", defaultValue = "World") String name) {
		return feedService.getFeedNew();
	}

	@RequestMapping("/message")
	String getMessage() {
		return this.message;
	}

}
