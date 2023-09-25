import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest = 0;
        double average = 0;
        double smallest = 0;
        //todo дописать логику программы ниже.
        if(first>second && first>third){
            greatest=first;
            if(second>third){
                average=second;
                smallest=third;
            }
            if(second<third){
                average=third;
                smallest=second;
            }
        }
        if(second>first && second>third){
            greatest=second;
            if(first>third){
                average=first;
                smallest=third;
            }
            else{
                average=third;
                smallest=first;
            }
        }
        if(third>first && third>second){
            greatest=third;
            if(first>second){
                average=first;
                smallest=second;
            }
            else{
                average=second;
                smallest=first;
            }
        }





        //todo


        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }
}
