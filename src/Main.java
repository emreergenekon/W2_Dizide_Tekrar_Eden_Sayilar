public class Main {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {1, 5, 12, 2, 18, 5, 9, 19, 22, 2, 2, 10, 14, 82, 82, 90};
        int[] uniqueEvenNumbers = new int[list.length]; // Tekrar etmeyen çift sayıları saklamak için

        int uniqueIndex = 0; // Tekrar etmeyen çift sayıların indeksi

        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0 && !isFind(uniqueEvenNumbers, list[i])) { // Çift sayıyı ve tekrar etmeyi kontrol eder
                uniqueEvenNumbers[uniqueIndex++] = list[i]; // Tekrar etmeyen çift sayıları diziye ekler
            }
        }

        // Tekrar etmeyen çift sayıları yazdırır
        for (int value : uniqueEvenNumbers) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}