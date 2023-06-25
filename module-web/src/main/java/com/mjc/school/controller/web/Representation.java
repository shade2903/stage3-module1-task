package com.mjc.school.controller.web;

import com.mjc.school.controller.Controller;
import com.mjc.school.controller.impl.ControllerImpl;
import com.mjc.school.service.dto.NewsDto;
import com.mjc.school.service.exception.InvalidDataException;
import com.mjc.school.service.exception.NotFoundException;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Representation {


    private Controller<NewsDto> controller;
    Scanner reader;

    private NewsDto newsDto;


    public Representation() {
        controller = new ControllerImpl();
        reader = new Scanner(System.in);
    }


    public void initialProgram(){
        while(true){
                startMenu();
                switch (reader.nextLine()){
                    case "1" ->  getAllNews();
                    case "2" -> getNewsById(reader);
                    case  "3" -> createNews(reader);
                    case  "4" -> updateNews(reader);
                    case "5" -> deleteNews(reader);
                    case "0" -> System.exit(0);
                    default -> System.out.println(MenuConstants.OPERATION_ERROR);
                }
        }
    }

    public static void startMenu() {
        System.out.println(MenuConstants.START_MENU_TEXT);
    }

    public void getAllNews(){
        System.out.println(MenuConstants.OPERATION_GET_ALL);
        controller.readAllNews().forEach(System.out::println);
    }

    public void getNewsById(Scanner input){
        System.out.println(MenuConstants.ENTER_ID);
        try{
            System.out.println(controller.getById(inputNumberValidator(input)));
                    } catch (InvalidDataException | NotFoundException e){
            System.out.println(e.getMessage());
        }


    }

    public void createNews(Scanner input){
         newsDto = new NewsDto();
        try{
            System.out.println(MenuConstants.ENTER_TITLE);
            newsDto.setTitle(input.nextLine());
            System.out.println(MenuConstants.ENTER_CONTENT);
            newsDto.setContent(input.nextLine());
            System.out.println(MenuConstants.ENTER_AUTHOR_ID);
            newsDto.setAuthorId(inputNumberValidator(input));
            controller.create(newsDto);
        }catch (InvalidDataException | NotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateNews(Scanner input){
         newsDto = new NewsDto();
        try{
            System.out.println(MenuConstants.ENTER_AUTHOR_ID);
            newsDto.setAuthorId(inputNumberValidator(input));
            System.out.println(MenuConstants.ENTER_TITLE);
            newsDto.setTitle(input.nextLine());
            System.out.println(MenuConstants.ENTER_CONTENT);
            newsDto.setContent(input.nextLine());
            System.out.println(MenuConstants.ENTER_AUTHOR_ID);
            newsDto.setAuthorId(inputNumberValidator(input));
            controller.update(newsDto);
        }catch (InvalidDataException | NotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteNews(Scanner input){
        System.out.println(MenuConstants.ENTER_ID);
        try{
            System.out.println(controller.delete(inputNumberValidator(input)));
        } catch (InvalidDataException | NotFoundException e){
            System.out.println(e.getMessage());
        }
    }



    private  Long  inputNumberValidator(Scanner input){
        Long inputLong = null;
        try{
            inputLong = input.nextLong();
        }catch (Exception e){
            System.out.println(MenuConstants.OPERATION_ERROR);
        }
        return inputLong;
    }


}
