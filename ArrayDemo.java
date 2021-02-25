class ArrayDemo {
 public static void main(String[] args) {
int[] nums = {10,20,30,40,50};

ArrayDemo demo = new ArrayDemo();
int result = demo.findSum(nums);
System.out.println("Sum: " + result);

}
  int findSum(int[] arry) {
  int sum = 0;
  for(int i=0;i<arry.length;i++){
     sum = sum + arry[i];
   }
return sum;
}
}