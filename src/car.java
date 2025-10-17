import java.util.Scanner;

public class car
{
    private String make;
    private String model;
    private double price;
    private String colour;
    car()
    {

    }
    car(String make, String model, double price, String colour)
    {
        this.make = make;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }


    void print_all_inform()//打印所有信息
    {
        System.out.println("品牌:"+make);
        System.out.println("型号:"+model);
        System.out.println("价格:"+price+"w");
        System.out.println("颜色:"+colour);
    }

    public void setPrice(double price)//变价
    {
        int priceConfirm=0;
        while(priceConfirm==0)
        {
            if(price<0)
            {
                System.out.println("数值必须大于0");
            }
            else if(price>100)
            {
                System.out.println("数值必须小于100");
            }
            else
            {
                System.out.println("改价成功");
                this.price = price;
                priceConfirm=1;
            }
        }
    }





    public double getPrice()
    {
        return(this.price);
    }



}
