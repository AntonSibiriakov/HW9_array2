public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        //=====Task1=====
        System.out.println("\n=====Task1=====");

        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");

        //=====Task2=====
        System.out.println("\n=====Task2=====");

        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (maxSum < arr[i]) {
                maxSum = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSum + " рублей");

        int minSum = maxSum;

        for (int i = 0; i < arr.length; i++) {
            if (minSum > arr[i]) {
                minSum = arr[i];
            }


        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей");

        //=====Task3=====
        System.out.println("\n=====Task3=====");

        double average = total / arr.length;

        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //=====Task4=====
        System.out.println("\n=====Task4=====");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length ; i++) {

            System.out.print(reverseFullName[reverseFullName.length - i - 1]);

        }
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}