car car1;
car car2;
//car(make,model,price,colour) printallinform() setprice(float price)
void change_and_comparison()
{
  String temptext="";
  while (mouseButton!=ENTER)
  {
    if (key==BACKSPACE)
    {
    }
    temptext=temptext+key;
  }
  //  car1.price=float(key);
  //println(car1.price);
}

void setup()
{
  car1=new car("benz", "x1", 20.0, "white");
  car2=new car("byd", "han", 10.0, "black");
  println("car1 信息：");
  car1.printallinform();
  println(" ");
  println("car2 信息：");
  car2.printallinform();
  if (car1.price>car2.price)
  {
    println("car1比car2要贵");
  } else if (car1.price<car2.price)
  {
    println("car1比car2要便宜");
  } else
  {
    println("car1和car2价格相当");
  }
}

void mousePressed()
{
  change_and_comparison();
}

void draw()
{
}
