class Box {
double width;
double height;
double depth;
 void setDimentions(double width, double height, double depth)
{
	this.width = width;
	this.height = height;
	this.depth = depth;
}
void volume() {
	double v = width*height*depth; 
	return v;
}

   0
class BoxDemo {
public static void main(String[] args) {

Box box1 = new Box();
box1.setDimensions(10,20,10);
double vol = box1.volume();
System.out.println("volume : " + vol);
}
}
}