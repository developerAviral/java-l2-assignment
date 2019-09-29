package com.wipro;

public class ImplClassWithLambda {
    public int getCharacterOccurrence(String st, char character){
        CharacterOccurence characterOccurence = (str,c) -> {
            long l = str.chars().filter(ch -> ch == c).count();
            return (int)l;
        };

        return characterOccurence.findOccurence(st, character);
    }
}
