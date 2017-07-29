package final_exam;


import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Ben Michalowicz
 */
public class FileIOTest {
    
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        
        File f = new File("C:\\Users\\Ben Michalowicz\\Desktop\\CSE114Summer\\CSE114_Summer\\CSE114_Summer\\src\\final_exam\\xanadu.txt");
        
        FileReader fr = new FileReader(f);
        
        
        
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        
        
        int count = 0;
        while(fr.ready()){
            
            char s = (char)fr.read();
            
            if(s==c){
                count++;
            }
        }
        
        
        
        System.out.println(c + " was found in the file " + count + " times");
        
        
    }
    
}
