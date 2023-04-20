package Tasks;

public class task3 {
    public static void main(String[] args) {
        int [][] numbers={{2,3,4,7,6},{22,33,24,51}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j]%2==0);
                System.out.println(numbers[i][j]);

            }
        }

    }
}
