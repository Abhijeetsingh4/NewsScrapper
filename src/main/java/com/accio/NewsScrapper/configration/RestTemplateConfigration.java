package com.accio.NewsScrapper.configration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfigration {

  @Bean
  public RestTemplate getFastRestTemplate() {
    return new RestTemplate(getFastRestTemplateConfirgtation());
  }

  @Bean
  @Primary
  public RestTemplate getSlowRestTemplate() {
    return new RestTemplate(getSlowRestTemplateConfirgtation());
  }

  private ClientHttpRequestFactory getSlowRestTemplateConfirgtation() {
    SimpleClientHttpRequestFactory simpleClientHttpRequestFactory = new SimpleClientHttpRequestFactory();
    simpleClientHttpRequestFactory.setReadTimeout(5000);
    simpleClientHttpRequestFactory.setConnectTimeout(5000);
    return simpleClientHttpRequestFactory;
  }

  private ClientHttpRequestFactory getFastRestTemplateConfirgtation() {
    SimpleClientHttpRequestFactory simpleClientHttpRequestFactory = new SimpleClientHttpRequestFactory();
    simpleClientHttpRequestFactory.setReadTimeout(100);
    simpleClientHttpRequestFactory.setConnectTimeout(100);
    return simpleClientHttpRequestFactory;
  }


}
