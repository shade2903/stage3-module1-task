package com.mjc.service;

import com.mjc.school.repository.entity.NewsModel;
import com.mjc.school.service.dto.NewsDto;
import com.mjc.school.service.mapper.NewsMapper;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceTest {
    private NewsModel modelNews = NewsModel.getBuilder()
            .setId(15L)
            .setTitle("Some test title")
            .setContent("Some test content")
            .setCreateDate(LocalDateTime.now())
            .setLastUpdateDate(LocalDateTime.now())
            .setAuthorId(11L)
            .build();

    private NewsDto newsDto = NewsDto.getBuilder()
            .setId(2L)
            .setTitle("Some new test title")
            .setContent("Some new test content")
            .setCreateDate(LocalDateTime.now())
            .setLastUpdateDate(LocalDateTime.now())
            .setAuthorId(7l)
            .build();

    @Test
    void testNewsModelFromDto(){
        NewsModel testNewsModel = NewsMapper.INSTANCE.NewsModelFromDto(newsDto);
        assertEquals(testNewsModel.getId(),newsDto.getId());
        assertEquals(testNewsModel.getTitle(),newsDto.getTitle());
        assertEquals(testNewsModel.getContent(),newsDto.getContent());
        assertEquals(testNewsModel.getCreateDate(),newsDto.getCreateDate());
        assertEquals(testNewsModel.getLastUpdateDate(),newsDto.getLastUpdateDate());
        assertEquals(testNewsModel.getAuthorId(),newsDto.getAuthorId());
    }

    @Test
    void testNewsModelToDto(){
        NewsDto testNewsDto = NewsMapper.INSTANCE.NewsModelToDto(modelNews);
        assertEquals(testNewsDto.getId(),modelNews.getId());
        assertEquals(testNewsDto.getTitle(),modelNews.getTitle());
        assertEquals(testNewsDto.getContent(),modelNews.getContent());
        assertEquals(testNewsDto.getCreateDate(),modelNews.getCreateDate());
        assertEquals(testNewsDto.getLastUpdateDate(),modelNews.getLastUpdateDate());
        assertEquals(testNewsDto.getAuthorId(),modelNews.getAuthorId());
    }
}


