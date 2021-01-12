public class SRadixTester {
    public static void main(String[] args) {
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
    }
}
