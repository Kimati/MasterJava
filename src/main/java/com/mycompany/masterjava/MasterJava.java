/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.masterjava;

import java.util.Scanner;

/**
 *
 * @author KamsAdmin
 */
public class MasterJava {
    static MasterJava masterjava = new MasterJava();
    
    public static void main(String[] args) {
        System.out.println("---------------Choose Test Drive--------------\n 1. Print Hello Ezra \t\t 2. Test");
        Scanner action = new Scanner(System.in);
        int choice = action.nextInt();
        
        //switch choice
        switch(choice){
            case 1:
                 System.out.println("Hello Ezra");
                 masterjava.ezraResponse();
                break;
            
            case 2:
                
                break;
                
            default:
                System.out.println("Kimati is asking you whether you know what you are doing or not!!!!");
                break;
        }
        
    }
    
    public void ezraResponse(){
        System.out.println("Hello, this is Ezra Kimati. Responding to you from the Plains [Hahahaha]. How may i help?");
    }
}
