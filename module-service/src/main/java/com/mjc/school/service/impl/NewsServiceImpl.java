package com.mjc.school.service.impl;

import com.mjc.school.service.NewsService;
import com.mjc.school.service.dto.NewsDto;

import java.util.List;


public class NewsServiceImpl implements NewsService<NewsDto> {
    @Override
    public NewsDto createNews(NewsDto entity) throws RuntimeException {
        return null;
    }

    @Override
    public List<NewsDto> getAllNews() {
        return null;
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
