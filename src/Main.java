public class Main {
    public static void main(String[] args) {
        double[] doubleNumbers = {12.86, -32.45, 23.00, 65.78, -75.90, 56.78, 34.67, -46.76, 33.44, 89.71, -100.00, 56.00, -67.78, 54.98, 0.96};
        double point = 0;
        if (doubleNumbers.length > 0) {
            double summa = 0;
            for (double doubleNumber : doubleNumbers) {
                summa += doubleNumber;
            }
            point = summa / doubleNumbers.length;
            System.out.println(point);
        }
    }
}