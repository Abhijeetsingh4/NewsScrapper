package com.accio.NewsScrapper.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.accio.NewsScrapper.dto.NewsResponse;
import com.accio.NewsScrapper.service.NewsService;

@RestController
@RequestMapping("/api/v1/news")
public class NewsController {

  @Autowired
  private NewsService newsService;

  @GetMapping("/")
  public NewsResponse getNews(@RequestParam("country") String country,
      @RequestParam("category") String category, @RequestParam("apiKey") String apiKey) {
    return newsService.getNews(country,category,apiKey);
  }

}
