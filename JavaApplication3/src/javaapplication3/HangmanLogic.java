/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Trigg
 */
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        while(true){
            //The problem is that the condition of the if statement is faulty in its logic.
            //The object doesn't recognise characters of the word individually, it only recognises the word as a whole.
            //Solved it motherbitch. The 'contains' method is case sensitive. The entered letters weren't capitalised so they all ended up being false.
            letter = letter.toUpperCase();
            if(this.word.contains(letter)){
                if(this.guessedLetters.contains(letter)){
                    letter = "";
                }else{
                    this.guessedLetters = letter + this.guessedLetters;
                }
            }else if(!this.word.contains(letter)){
                if(this.guessedLetters.contains(letter)){
                    letter = "";
                }else{
                    this.guessedLetters = letter + this.guessedLetters;
                }
                this.numberOfFaults++;
            }
            
            if(this.word.contains("")){
                break;
            }
        }
    }

    public String hiddenWord() {
        /*The issue here is that I don't know how to start off with the 'underscores' characterising an unknown word.
        The second issue is that I don't know how to replace those underscores with letters.
        The third issue is that the letters that come through have to be either added on to form the word or rejected.
        The fourth thing is that I have to print it out. Right now it says return ""; and that doesn't make much sense,
        so I feel as though that will have to change.*/
        
        /*int control = 0;
        String begin = "_";
        String start = "";
        while(control < this.word.length()){
            start = begin + start;
            control++;
        }
        
        while(true){
            if(this.word.contains(this.guessedLetters)){
                int io = this.word.indexOf(this.guessedLetters);
                String help = "" + start.charAt(io);
                help = this.guessedLetters;
                start.replace(help, this.guessedLetters);
            }
            
            if(this.guessedLetters.isEmpty()){
                break;
            }
        }
        

        return "" + start;*/
        
        //The following is not my solution.
        
        String hiddenWord = "";
        int i = 0;
        while (i < this.word.length()) {
            String a = this.word.charAt(i) + "";
            if (this.guessedLetters.contains(a)) {
                hiddenWord = hiddenWord+a;
            }
            else {
                hiddenWord = hiddenWord+"_";
            }
            i++;
        }
        
        return hiddenWord;
        
    }
}
