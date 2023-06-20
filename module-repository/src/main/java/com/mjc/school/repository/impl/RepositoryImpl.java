package com.mjc.school.repository.impl;

import com.mjc.school.repository.Repository;
import com.mjc.school.repository.domain.DataSource;
import com.mjc.school.repository.entity.NewsModel;

import java.util.List;

public class RepositoryImpl implements Repository<NewsModel> {
    private DataSource dataSource;

    public RepositoryImpl(){
        dataSource = DataSource.getInstance();
    }
    @Override
    public NewsModel create(NewsModel entity) {
        return dataSource.addNews(entity);
    }

    @Override
    public List<NewsModel> readAll() {
        return dataSource.getAllNews();
    }

    @Override
    public NewsModel getById(Long id) {
        return dataSource.getNewsById(id);
    }

    @Override
    public NewsModel update(NewsModel entity) {
        return dataSource.updateNews(entity);
    }

    @Override
    public Boolean delete(Long id) {
        return dataSource.removeNews(getById(id));
    }
}
