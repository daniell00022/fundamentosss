

package com.mycompany.mavenproject3;
public class Mavenproject3 {

    public static void main(String[] args) {
      
        String [][] tablero = {
           {"T","C","A","R","Q","A","C","T"},
           {"P","P","P","P","P","P","P","P"},
           {"_","_","_","_","_","_","_","_",},
           {"_","_","_","_","_","_","_","_",},
           {"_","_","_","_","_","_","_","_",},
           {"_","_","_","_","_","_","_","_",}, 
           {"P","P","P","P","P","P","P","P"},
           {"T","C","A","R","Q","A","C","T"},
       };
        tablero(tablero);
    }
     public static void tablero(String [][] ajedrez ) {
        for (int i = 0; i < ajedrez.length; i ++){
            for (int a = 0; a < ajedrez [i].length; a ++){
                System.out.print(ajedrez [i] [a]+ " ");
               
        }
         System.out.println();
         
            
            
        }
     }
}
