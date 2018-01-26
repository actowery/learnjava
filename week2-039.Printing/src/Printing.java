public class Printing {

    public static void printStars(int amount) {
        int x=0;
        while(x <amount){
            System.out.print("*");
            x++;
        }  
        System.out.println();
    }

    public static void printSquare(int sideSize) {
        int x=0;
        
        while(x<sideSize){
            printStars(sideSize);
            x++;
        }
    }

    public static void printRectangle(int width, int height) {
     
        for(int x=0;x<height;x++){
            printStars(width);
         
        }
    }

    public static void printTriangle(int size) {
        int iter = 1;
        for(int i =0;i<size;i++){
            printStars(iter);
            iter++;
        }    
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
