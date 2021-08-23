package com.company;

public class Card {
    //Instance Variable
    private String cardName;
    private String cardDefinition;

    //Default Constructor
    public Card(){

    }
    //Default Constructor Override
    public Card(String cardName, String cardDefinition){
        this.cardName = cardName;
        this.cardDefinition = cardDefinition;
    }
    //Set Flashcard Name
    public void setName(String cardName){
        this.cardName = cardName;
    }

    //Get Flashcard Name
    public String getName(){
        return cardName;
    }

    //Set Flashcard Definition
    public void setDefinition(String cardDefinition){
        this.cardDefinition = cardDefinition;
    }
    //Get Flashcard Definition
    public String getDefinition(){
        return cardDefinition;
    }
}
