package lecture_programs;
//Methods!!!
public class Jun62017Pt2 {
	
    public static void main(String[] args) {
        
        int i = 1; 
        System.out.println("After this method, i is temporarily now: " + change(i));
        
        int j = 2;
        
        swap(i, j);
        
        System.out.println("I (1) is still " + i + " and J (2) is still "+ j);
    }
    
    
    public static int change(int i){
        return i+1;
    }
    
    
    public static void swap(int i, int j){
        int temp = i;
        i=j;
        j = temp;
        System.out.println("i is " + i + " and j is " + j);
    }
	

}
