/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week1;

/**
 *
 * @author Rajae Barnes
 */
import java.util.Scanner;
public class Week1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String arr[]={""};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        arr=in.nextLine();
         for(int i=arr.length-1; i>=0;i--){
            System.out.println(arr[i]);
         }
        
    }
    
}
