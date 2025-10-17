class car
{
  String make;
  String model;
  float price;
  String colour;
  car()
  {
    
  }
  car(String make,String model,float price,String colour)
  {
    this.make=make;
    this.model=model;
    this.price=price;
    this.colour=colour;
  }
  
  
  void printallinform()//打印所有信息
  {
    println("品牌:"+make);
    println("型号:"+model);
    println("价格:"+price+"w");
    println("颜色:"+colour);
  }
  
  
  void setprice(float price)//变价
  {
   this.price=price; 
  }
  
  
  
}
