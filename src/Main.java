public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println("=====Task1=====");
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");

        System.out.println("=====Task2=====");

        int maxSum = 0;


        for (int i = 0; i < arr.length; i++) {
            if (maxSum < arr[i]) {
                maxSum = arr[i];
            }
        }
        System.out.println(maxSum);

        int minSum = maxSum;

        for (int i = 0; i < arr.length; i++) {
            if (minSum > arr[i]) {
                minSum = arr[i];
            }


        }
        System.out.println(minSum);


        System.out.println("=====Task3=====");
        double average = total / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println("=====Task4=====");
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