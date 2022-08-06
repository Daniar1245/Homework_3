public class Main {
    public static void main(String[] args) {
        double[] doubleNumbers = {12.86, -32.45, 23.00, 65.78, -75.90, 56.78, 34.67, -46.76, 33.44, 89.71, -100.00, 56.00, -67.78, 54.98, 0.96};
        double numbers = 0;
        int summa = 0;
        boolean fG = false;
        for (double doubleNumber : doubleNumbers) {
            if (doubleNumber < 0) {
                summa += doubleNumber;
                fG = true;
            } else if (fG) {
                summa++;
                numbers += doubleNumber;
            }
        }
        System.out.println(numbers / summa);
    }
}