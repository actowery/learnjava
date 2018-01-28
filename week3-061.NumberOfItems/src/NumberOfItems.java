import java.util.ArrayList;

public class NumberOfItems {

    // implement here the method countItems
    public static int countItems(ArrayList<String> items) {
//I'm a fool... I could have just returned size all along..
//        int count = 0;
//        for (String item : items){
//            count ++;
//        }
//        return count;
        return items.size();
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Moi");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items on the list:");
        // You can remove the comment from below when the method is done
        //System.out.println(countItems(list)); 
    }

}
