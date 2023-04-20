package Tasks;

public class task4 {
    public static void main(String[] args) {
        int [][] numbers={{12,43,55,2,44,},
                          {23,4,2,5,6}};
        int even=0;
        int odd=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                int sum=numbers[i][j];
                if (sum%2==0){
                    even+=sum;
                }else {
                    odd +=sum;

                }

            }



        }System.out.println(even);
        System.out.println(odd);

    }
}
