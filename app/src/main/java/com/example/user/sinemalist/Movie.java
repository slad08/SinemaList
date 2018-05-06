package com.example.user.sinemalist;

class Movie {
    private String name,description,directorName;
    private int numberOfViews;

    Movie(String name,String description,String directorName,int numberOfViews){
        super();

        this.name = name;
        this.description = description;
        this.directorName = directorName;
        this.numberOfViews = numberOfViews;
    }
    String getName(){
        return this.name;
    }
    String getDescription(){
        return  this.description;
    }
    String getDirectorName(){
        return  this.getDirectorName();
    }
    int getNumberOfViews(){
        return this.getNumberOfViews();
    }

}
