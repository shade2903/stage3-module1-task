package com.mjc.school.service.impl;

import com.mjc.school.repository.Repository;
import com.mjc.school.repository.entity.NewsModel;
import com.mjc.school.repository.impl.RepositoryImpl;
import com.mjc.school.service.NewsService;
import com.mjc.school.service.dto.NewsDto;
import com.mjc.school.service.mapper.NewsMapper;
import com.mjc.school.service.utils.NewsValidator;

import java.util.ArrayList;
import java.util.List;


public class NewsServiceImpl implements NewsService<NewsDto> {
    private final NewsMapper newsMapper;
    private final Repository<NewsModel> repository;

    private final NewsValidator newsValidator;

    public NewsServiceImpl(){
        newsMapper = NewsMapper.INSTANCE;
        repository = new RepositoryImpl();
        newsValidator = new NewsValidator();
    }
    @Override
    public NewsDto createNews(NewsDto entity) throws RuntimeException {
        newsValidator.validateDTO(entity);

        return null;
    }

    @Override
    public List<NewsDto> getAllNews() {
        List<NewsDto> newsDtoList = new ArrayList<>();
        for(NewsModel e : repository.readAll()){
            newsDtoList.add(newsMapper.NewsModelToDto(e));
        }
        return newsDtoList;
    }


    @Override
    public NewsDto getNewsById(Long id) throws RuntimeException {
        return null;
    }

    @Override
    public NewsDto updateNews(NewsDto entity) throws RuntimeException {
        return null;
    }

    @Override
    public Boolean deleteNews(Long id) throws RuntimeException {
        return null;
    }
}
