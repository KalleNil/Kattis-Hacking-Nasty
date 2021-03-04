
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kalle
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = Integer.parseInt(scan.nextLine());
        
        for (int i = 0; i<n; i++){
            String[] inputen = scan.nextLine().split(" ");
            
            int r = Integer.parseInt(inputen[0]);
            int e = Integer.parseInt(inputen[1]);
            int c = Integer.parseInt(inputen[2]);
            
            if (e-c < r){
                System.out.println("do not advertise");
                
            }
            else if (e-c == r){
                System.out.println("does not matter");
                
            }else{
                System.out.println("advertise");
            }
            
            
        }
        
        
        
        
    }
    
}
