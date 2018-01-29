import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int listItem : list) {
            sum += listItem;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return sum(list) / (double)list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        if (list.size() <= 1) {
            System.out.println("Too small, NaN");
            return 0;
        }
        double avg = average(list);
        double temp = 0;
        double var;
        
        for(int listItem : list){
            temp += Math.pow((listItem-avg), 2);
        }
        var = temp / (list.size()-1);
        return var;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
