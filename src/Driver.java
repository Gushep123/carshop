
import java.util.Scanner;
public class Driver
{
    public static void main(String[] args)
    {
        new Driver();
    }

    car car1;
    car car2;


    private void comparison()
    {
        if(car1.getPrice()>car2.getPrice())
        {
            System.out.println("car1比car2贵");
        }
        else if (car1.getPrice()<car2.getPrice())
        {
            System.out.println("car2比car1贵");
        }
        else
        {
            System.out.println("car和car2一样贵");
        }
    }


    Driver()//主函数
    {
        Scanner input = new Scanner(System.in);
        car1=new car("benz", "x1", 20.0, "white");
        car2=new car("byd", "han", 10.0, "black");
        System.out.println("car1 信息：");
        car1.print_all_inform();
        System.out.println(" ");
        System.out.println("car2 信息：");
        car2.print_all_inform();
        System.out.println(" ");
        comparison();

        System.out.println("car1 改价：");
        car1.setPrice(input.nextDouble());
        comparison();

    }



}