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



}