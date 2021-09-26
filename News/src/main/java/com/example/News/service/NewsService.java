package com.example.News.service;

import java.util.List;
import java.util.Optional;

import com.example.News.entity.NewsEntity;
import com.example.News.model.News;

public interface NewsService {
	
	public List<String>  addNews(List<News> newsList);
	
	public List<News> getAllNews();
	
	public News getNews(String newsId) throws Exception;
	
	public void deleteNews(String newsId);

}
