package Tasks;



public class task10 {
    public static void main(String[] args) {


    String[] arr = {"Sarah","David","Emily","Emily","Ethan","Olivia","Sarah"};

        System.out.println("Duplicate elements in the array: ");

        for (int i = 0; i < arr.length-1; i++) {
        for (int j = i+1; j < arr.length; j++) {
            if (arr[i].equals(arr[j])) {
                System.out.println(arr[j]);
            }
        }
    }

}}
