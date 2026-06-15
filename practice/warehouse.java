package practice;

public class warehouse {
    public static void main(String[] args) {

        int[] stock = {10, 20, 30, 20, 50, 10, 60};

     
        int max = stock[0];
        int min = stock[0];
        int total = 0;

        for (int i = 0; i < stock.length; i++) {
            total += stock[i];

            if (stock[i] > max) max = stock[i];
            if (stock[i] < min) min = stock[i];
        }

        System.out.println("MAX STOCK: " + max);
        System.out.println("MIN STOCK: " + min);
        System.out.println("TOTAL STOCK: " + total);

      
        System.out.println("\nDUPLICATES:");

        boolean found = false;

        for (int i = 0; i < stock.length; i++) {
            for (int j = i + 1; j < stock.length; j++) {
                if (stock[i] == stock[j]) {
                    System.out.println(stock[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No duplicates found");
        }

     
        int k = 2;
        rotateArray(stock, k);

        System.out.println("\nROTATED ARRAY:");
        for (int i = 0; i < stock.length; i++) {
            System.out.print(stock[i] + " ");
        }
        System.out.println("\n\nTRANSPOSED MATRIX:");

        int[][] shelf = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] transpose = new int[shelf[0].length][shelf.length];

        for (int i = 0; i < shelf.length; i++) {
            for (int j = 0; j < shelf[0].length; j++) {
                transpose[j][i] = shelf[i][j];
            }
        }

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateArray(int[] arr, int k) {

        k = k % arr.length;

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}



