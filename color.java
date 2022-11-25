/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delet_redundunce;

import java.util.Scanner;

 

   
public class Delet_redundunce {

  
    
    
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
        int myarr[]= new int[4];
        for(int i = 0 ; i <myarr.length ; i++){
        myarr[i]=s.nextInt();
        }
        int value=0;
        for (int i = 0; i < myarr.length ; i++) {
           int key = myarr[i];
            for (int j = i+1; j < myarr.length; j++) {
                if(key==myarr[j])
                    value++;
                break;
            }
            
        }
        System.out.println(value); 
    }
    
}
