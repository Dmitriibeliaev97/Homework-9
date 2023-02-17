public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }



    public static void task1 () {
        System.out.println("Задача 1");
        int[ ] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println(sum);

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[ ] arr = generateRandomArray();
        int minSum = arr [0];
        int maxSum = minSum;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
                if (arr[i] < minSum) {
                    minSum = arr[i];
                }
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSum + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей");
    }
    public static void task3 () {
        System.out.println("Задача 3");

    }
    public static void task4 () {
        System.out.println("Задача 4");

    }
}