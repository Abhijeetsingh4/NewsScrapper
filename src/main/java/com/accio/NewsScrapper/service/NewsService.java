package com.accio.NewsScrapper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.accio.NewsScrapper.dto.NewsResponse;
import com.accio.NewsScrapper.enums.Gender;

@Service
public class NewsService {

  @Autowired
  @Qualifier("getSlowRestTemplate")
  private RestTemplate restTemplate;

  public NewsResponse getNews(String country, String category, String apiKey) {
    String url = "https://newsapi.org/v2/top-headlines?country=" + country + "&category=" + category
        + "&apiKey=" + apiKey;
    NewsResponse  newsResponse= restTemplate.getForObject(url, NewsResponse.class);
    convert();
    Gender gender= Gender.FEMALE;
    return newsResponse;

  }
  private void convert(){

  }

}
