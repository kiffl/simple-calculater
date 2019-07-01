/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculater;

import java.util.Scanner;

/**
 *
 * @author Fa14-bse-202
 */
public class Calculater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Cal c=new Cal();
        System.out.println(c.add(1,2));
        System.out.println(c.sub(1,2));
        System.out.println(c.mul(1,2));
        System.out.println(c.div(1,2));
    }
    
    
}
       

