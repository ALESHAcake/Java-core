import java.util.ArrayList;
import java.util.Collections;


public class zadacha_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(8);
        list.add(3);
        System.out.println("Исходный список" + list);
        System.out.println();
        
        int min = Collections.min(list);

        
        int max = Collections.max(list);

        
        double average = 0;
        if (list.size() > 0) {
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            average = (double) sum / list.size();
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + average);

    }
}
    
  
