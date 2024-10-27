package com.accio.NewsScrapper.dto;


import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewsResponse {

  private String status;
  private Integer totalResults;
  private List<Article> articles;

}
