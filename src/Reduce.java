public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int i = 100;
        while (i > 0) {
            boolean odd = i % 2 == 1;
            boolean even = i % 2 == 0;
            if (odd) {
                i = i - 1;
            } else if (even) {
                i = i/2;
            }
            count += 1;
        }
        System.out.println(count);
    }
}
