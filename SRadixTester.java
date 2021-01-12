public class SRadixTester {
    public static void main(String[] args) {
        /* nth and length tester
        System.out.println(0 + "| " + RadixSort.length(0));
        for (int i = -3; i > -10000; i = i * 3){
            System.out.println(i + " | " + RadixSort.length(i));
        }
        System.out.println(-123456);
        System.out.println(RadixSort.nth(-123456, 0));
        System.out.println(RadixSort.nth(-123456, 1));
        System.out.println(RadixSort.nth(-123456, 2));
        System.out.println(RadixSort.nth(-123456, 3));
        System.out.println(1);
        System.out.println(RadixSort.nth(1, 0));
        */

        // merge tester 
        SortableLinkedList o = new SortableLinkedList();
        for(int i = 0; i < 10; i++){
            o.add(i);
        }
        SortableLinkedList b0 = new SortableLinkedList();
        b0.add(11);
        b0.add(12);
        SortableLinkedList b1 = new SortableLinkedList();
        b1.add(13);
        b1.add(14);
        SortableLinkedList b2 = new SortableLinkedList();
        b2.add(15);
        b2.add(16);
        SortableLinkedList[] b = new SortableLinkedList[3];
        b[0] = b0;
        b[1] = b1;
        b[2] = b2;

        RadixSort.merge(o,b);
        System.out.println(o);
        System.out.println(b0);
        //
        
    }
}
