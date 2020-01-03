/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek8;

//Used in conjunction with Box.java class, Book.java class and the ToBeStored.java interface.

/**
 *
 * @author Trigg
 */
public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int publishingYear;
    
    public CD(String artist, String title, int publishingYear){
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
    }
    
    @Override
    public String toString(){
        return this.artist + ": " + this.title + " (" + this.publishingYear + ") ";
    }
    
    @Override
    public double weight() {
        return 0.1;
    }
    
}
