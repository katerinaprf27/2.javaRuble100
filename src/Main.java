public class Main {
    public static void main(String[] args) {
        long balance = 565;
        long refill = 2200;
        long total;
        if (refill > 1000) {
            total = balance + refill + (refill / 100);
        } else {
            total = balance + refill;
        }
        System.out.println(total);

    }
}
