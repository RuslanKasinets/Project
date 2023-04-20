package Tasks;

public class task8 {
    public static void main(String[] args) {
        int [][] numbers={{23,45,67},
                         {44,55,88}};
        int max=numbers[0][0];
        int min=numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j]<min){
                    min=numbers[i][j];


                }if (numbers[i][j]>max){
                    max=numbers[i][j];

                }




            }

        }System.out.println(max);
        System.out.println(min);
}
}
