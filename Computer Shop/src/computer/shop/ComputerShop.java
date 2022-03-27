/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer.shop;

/**
 *
 * @author johnfred
 */
public class ComputerShop {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Home gui1 = new Home();
        gui1.show();
           
        UserLogin usrl = new UserLogin();
        usrl.show();
    }
}
