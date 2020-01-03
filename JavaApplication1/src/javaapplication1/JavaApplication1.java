package javaapplication1;
import java.util.Scanner;
import java.util.ArrayList;

public class JavaApplication1 {
    public static void main(String args[]) {
        ArrayList<Integer> first = new ArrayList<Integer>();
        ArrayList<Integer> second = new ArrayList<Integer>();
        Scanner reader = new Scanner(System.in);
        System.out.println("Back at home. Fucking shit, mate.\n");
        
        while(true){
            System.out.print("Enter words for the first list: ");
            int st = Integer.parseInt(reader.nextLine());
            
            if(st == 0){
                break;
            }
            
            first.add(st);
        }
        
        System.out.println("\n");
        
        while(true){
            System.out.print("Enter numbers for the second list: ");
            int nd = Integer.parseInt(reader.nextLine());
            
            if(nd == 0){
                break;
            }
            
            second.add(nd);
        }
        
        combine(first, second);
        System.out.println(first);
        
        //combine2(first, second);
        //System.out.println(first);
    }
    
    //both methods work in adding lists together.
    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second){
        int control = 0;
        int size1 = first.size();
        int size2 = second.size();
        while(control < size1 && control < size2){
            if(first.contains(second.get(control))){
                second.remove(control);
            }else{
                first.add(second.get(control));
            }
            
            control++;
        }
    }
    
    /*public static void combine2(ArrayList<Integer> first, ArrayList<Integer> second){
        for(int number : second){
            
            first.add(number);
            
        }
        
        int control = 0;
        while(true){
            if(first.contains(control) == second.contains(control)){
            first.remove(control);
            
            }
        
            control++;
        }
        
        
    }*/
}