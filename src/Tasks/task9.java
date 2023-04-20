package Tasks;

public class task9 {
    public static void main(String[] args) {
        int[][] numbers = {{23, 45, 67},
                           {44, 55, 88}};

        int largest=numbers[0][0];
        int secondLargest=numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] > largest) {
                    secondLargest = largest;
                    largest = numbers[i][j];
                } else if (numbers[i][j] > secondLargest && numbers[i][j] != largest) {
                    secondLargest = numbers[i][j];
                }
            }

        }System.out.println(secondLargest);

    }
}
