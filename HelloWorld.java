public class HelloWorld
{

    int i = 14;
    int k = 6;
    int a = 9;
    int b = 19;

    public void run() {
        while (i < 15) {
            System.out.println("i is " + i + " but is less than 15");
            i = i + 1;

        }
        while (k > 5) {
            System.out.println("k is " + k + " but is more than 5");
            k = k - 1;
        }
        while (a < 10 && b <= 20) {
            System.out.println("a is" + a + "but less than 10, and"); 
            System.out.println("b is" + b + "b is less than or equal to 20");
            a = a + 1;
            b = b + 1;
        }
    }     

    public static void main(String[] args)
    {        
        HelloWorld hw = new HelloWorld();
        hw.run();
    }
}


