package com.mjc.school.repository.entity;

public class AuthorModel {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private static class AuthorModelBuilder{
        private AuthorModel authorModel;

        public AuthorModelBuilder(){
            authorModel = new AuthorModel();
        }

        private AuthorModelBuilder setId(Long id){
            authorModel.id = id;
            return this;
        }

        private AuthorModelBuilder setName (String name){
            authorModel.name = name;
            return this;
        }

        public AuthorModel build(){
            return authorModel;
        }
    }
}
