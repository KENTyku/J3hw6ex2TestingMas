/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j3hw6ex2testingmas;

/**
 *
 * @author user
 */
public class J3hw6ex2TestingMas {

    public static int[] mas={1,1,4,1,4,1,1,4,1};
   
   
    boolean metod(int[] mas) //throws RuntimeException
    {   boolean bool=false;
        for(int i=0; i<mas.length; i++){                       
            if (mas[i]!=1){
                if (mas[i]!=4) {
                    bool=false;
                    break; //выходим из цикла
                }
            }
            else bool=true;
            //return ((mas[i]!=1) || (mas[i]!=4));
        } 
        return bool;
    }
    public static void main(String[] args) {
        J3hw6ex2TestingMas test=new J3hw6ex2TestingMas();
        if (test.metod(mas)==true) System.out.println("true");
        else System.out.println("false");   
    }
    
}
