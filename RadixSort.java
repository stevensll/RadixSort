import java.util.*;
public class RadixSort{
    
    public static int nth(int n, int col){
        return (Math.abs(n) / (int)(Math.pow(10, col))) % 10;
    }

    public static int length(int n){
        if (n == 0) return 1;
        else return (int) (Math.log10(Math.abs(n)) + 1);
    }

    public static void merge(SortableLinkedList original, SortableLinkedList[] buckets){
        for (int i  = 0; i < buckets.length; i++){
            original.extend(buckets[i]);    
        }
    }

    public static void radixSortSimple(SortableLinkedList data){
       /*
       Procedure:
       1) On each n pass, we need to bucket sort the elements by their nth digit. This is o(n)
       2) Once elements are bucket sorted, we will then call merge. This is o(1)
       3) We repeat this for n digits of the longest number. 
       */
        //create bucket array, 10 possible values for 0-9
        SortableLinkedList[] buckets = makeBuckets();
        
        int passes = 1;
        for(int n = 0; n < passes; n++){
            //O(n) bucket sort pass
            //repeat n times. the first iteration will get the longest number and change n to that length.
            //System.out.println("--------pass " + n+1);
            int size = data.size();
            for (int i = 0; i < size; i++){
                //call remove(0) for a linear pass of retrieving data and clearing the list. remove(0) will maintain the stability
                int value = data.remove(0); 
                //get the nth digit of value
                int digitAt = nth(value, n);
                //add value to the specific bucket corresponding to that digit
                buckets[digitAt].add(value);
                //System.out.println(Arrays.toString(buckets));
                
                // change the loop to repeat until the longest length. 
                if (length(value) > passes) passes = length(value);
            }    
            merge(data, buckets);
            //System.out.println(data);
        }

    }

    private static SortableLinkedList[] makeBuckets(){
        // this is a constant time operation since it is always of size 10
        SortableLinkedList buckets [] = new SortableLinkedList[10];
        for(int i = 0; i < 10; i++){
            SortableLinkedList bucket = new SortableLinkedList();
            buckets[i] = bucket;
        }
        return buckets;
    }
}