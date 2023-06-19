package com.mjc.school.repository.domain;

import com.mjc.school.repository.entity.AuthorModel;
import com.mjc.school.repository.entity.NewsModel;

import java.util.List;

public class DataSource {
    public static DataSource instance;
    private final List<AuthorModel>  authorModels;
    private final List<NewsModel> newsModels;

    private DataSource(){
        this.authorModels = initAuthorModels();
        this.newsModels = initNewsModels();

    }

     public static DataSource getInstance() {
        if(instance == null){
            instance = new DataSource();
        }
        return instance;
    }

    private List<AuthorModel> initAuthorModels(){
        return null;
    }

    private List<NewsModel> initNewsModels(){
        return null;
    }

}
