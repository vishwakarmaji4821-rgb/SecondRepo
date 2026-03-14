// This program finds the minimum element in an array using a for-each loop.
public class ForEachLoop {

    public static void main(String[] args) {
        int [] my_array = {7,12,9,4,11};
        int min_value = my_array[0];

        for(int i : my_array){
            if(i<min_value){
                min_value = i;
            }
        }
        System.out.println("Lowest value :"+min_value);

    }
    
}
