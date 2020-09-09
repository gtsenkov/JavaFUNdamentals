package AraysLab03;

public class Demo {
    public static void main(String[] args) {
        int [] numbers = new int [10];
        for (int i = 0; i < numbers.length ; i++) {

            numbers [i] = 1;


        }
        numbers [5] = numbers [2] + numbers [7];
        System.out.println(numbers[5]);
    }
}
