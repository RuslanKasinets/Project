package Tasks;

public class task1 {
    public static void main(String[] args) {
        int[] temp={23,45,56,76,87,45,};
        int largest=temp[0];
        for (int num:temp){
            if (num>largest){
                largest=num;
            }
        }
        System.out.println(largest);
        int smole=temp[0];
        for (int num:temp){
            if (num<smole){
                smole=num;
    }

}System.out.println(smole);
    }}
