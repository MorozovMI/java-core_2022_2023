package lr3;
import java.util.Scanner;
public class Example2 {

    public static void main(String[] args) {
        System.out.println("Версия на основе условного вложенного оператора");
        System.out.println();
        System.out.println("Введите день недели:");
        Scanner in = new Scanner(System.in);
        String day = in.nextLine().toLowerCase();


        if (day.equals("понедельник")) System.out.println("1");
        else if (day.equals("вторник")) System.out.println("2");
        else if (day.equals("среда")) System.out.println("3");
        else if (day.equals("четверг")) System.out.println("4");
        else if (day.equals("пятница")) System.out.println("5");
        else if (day.equals("суббота")) System.out.println("6");
        else if (day.equals("воскресенье")) System.out.println("7");

        else System.out.println("Такого дня не существует");

        System.out.println("Версия на основе оператора switch");
        System.out.println();

        switch (day){
        case "понедельник":
            System.out.println("1");
            break;
            case "вторник":
                System.out.println("2");
                break;
            case "среда":
                System.out.println("3");
                break;
            case "четверг":
                System.out.println("4");
                break;
            case "пятница":
                System.out.println("5");
                break;
            case "суббота":
                System.out.println("6");
                break;
            case "воскресенье":
                System.out.println("7");
                break;
            default:
                System.out.println("Такого дня не существует");
    }




}}





