/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alisonka
 */
public class Run_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*for (int i = 1; i <=10; i++ )
         {       
            System.out.println(i);
         }*/
        
        
        /*int j = 1;
        while(j<=10){
            System.out.println(j);
            j++;            
        }*/
        
        /*String a = "Hello";
        String b = "all";
        String c = "_";        
        System.out.println(a+" "+b+" "+"!");*/
        //i = i+ 1;
        int[] digits= {1,2,3,4,5,6,7,8,9,10};
        float sum=0;
        //float result=0;
     for(int i=0; i<digits.length; i++){
         sum += digits[i];            
     }
     float result = sum/digits.length;
         System.out.println(result);
        //public static ArrayList<String> row(){
            
        }
        
        // TODO code application logic here
    }
    
}
