class prodect {
int id;
String name;
double price;
Product(int id,String name,double price){
this.id = id;
this.name = name;
this.price = price;
}

void display()
{
System.out.println(id + "" + name + "" + price);
}
}
class ProductStore() {
public static void main(String[] args){
Product[] products = new Product[3];
Product[0] = new Product(111,"mobile",50000);
Product[1] = new Product(222,"laptop",50000);
Product[0] = new Product(333,"harddisk",50000);
for(int i = 0; i<products.length;i++)
{
System.out.println(products[i].id+""+products[i].name+""+products[i].price);
products[i].display();
}
}
}