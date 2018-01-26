public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
     public static void printStars(int amount) {
        int x=0;
        while(x <amount){
            System.out.print("*");
            x++;
        }  
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        int x=0;
        while(x <amount){
            System.out.print(" ");
            x++;
        }  
    }

    public static void printTriangle(int size) {
        int iter = 1;
        while(iter <= size){
            printWhitespaces(size-iter);
            printStars(iter);
            iter++;
        }   
    }

    public static void xmasTree(int height) {
            
        int wtsp = height - 1;
        int star = 1;
        for(int i =0;i<height;i++){
            printWhitespaces(wtsp);
            printStars(star);
            wtsp --;
            star += 2;
        }          
        printWhitespaces(height-2);
        printStars(3);
        printWhitespaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
