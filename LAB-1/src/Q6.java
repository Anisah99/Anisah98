import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int [] numbers=new int[10];
        input(numbers,10);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
    static void input(int [] array,int size)
    {
        Scanner in=new Scanner(System.in);
        for (int i = 0; i <size ; i++) {
            array[i]=in.nextInt();
        }
    }

}
