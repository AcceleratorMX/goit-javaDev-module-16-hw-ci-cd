package ua.goit;

public class SumCalculator {
    public static void main(String[] args) {
        System.out.println(sum(7));
    }
        public static int sum (int n){
            return switch (n) {
                case 0 -> throw new IllegalArgumentException();
                default -> (n * (n + 1)) / 2;
            };
        }
}


