/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personsengquiz;
/**
 *
 * @author Genica Mae Seng
 */
public class PersonQuiz {
    private Person sender;
    private Person receiver;
    String destination;
    int kilos;
    
    public PersonQuiz(){
    }
    
    public PersonQuiz(Person sender, Person receiver, String destination, int kilos){
        this.sender = sender;
        this.receiver = receiver;
        this.destination = destination;
        this.kilos = kilos;
    }
    
    public void setSender(Person sender){
        this.sender = sender;
    }
    
    public Person getSender(){
        return sender;
    }
    
    public void setReceiver(Person receiver){
        this.receiver = receiver;
    }
    
    public Person getReceiver(){
        return receiver;
    }
    
    public void setDestination(String destination){
        this.destination = destination;
    }
    
    public String getDestination(){
        return destination;
    }
    
    public void setKilos(int kilos){
        this.kilos = kilos;
    }
    
    public int getKilos(){
        return kilos;
    }
    
    public int computeFee(){
        int fee = 0;
        if("NCR".equals(destination)){
            if(kilos >= 20){
                fee = 820;
            } else if(kilos >= 3 && kilos < 5){
                fee = 220;
            } else if(kilos >= 1 && kilos < 2){
                fee = 160;
            } else {
                fee = 120;
            }
        }else if("N. Luzon".equals(destination)){
            if(kilos >= 20){
                fee = 1220;
            } else if(kilos >= 3 && kilos < 5){
                fee = 320;
            } else if(kilos >= 1 && kilos < 2){
                fee = 190;
            } else {
                fee = 150;
            }
        }else if("S. Luzon".equals(destination)){
            if(kilos >= 20){
                fee = 1420;
            } else if(kilos >= 3 && kilos < 5){
                fee = 620;
            } else if(kilos >= 1 && kilos < 2){
                fee = 320;
            } else {
                fee = 150;
            }
        }else if("Visayas".equals(destination)){
            if(kilos >= 20){
                fee = 1420;
            } else if(kilos >= 3 && kilos < 5){
                fee = 720;
            } else if(kilos >= 1 && kilos < 2){
                fee = 370;
            } else {
                fee = 150;
            }
        } else if("Mindanao".equals(destination)){
            if(kilos >= 20){
                fee = 1420;
            } else if(kilos >= 3 && kilos < 5){
                fee = 720;
            } else if(kilos >= 1 && kilos < 2){
                fee = 160;
            } else {
                fee = 370;
            }
        }
        
        return fee;
    }
}
