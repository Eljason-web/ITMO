import java.util.Arrays;
public class Main {
    public static double formula1(double x){
        return Math.cos(Math.sin(Math.pow(4*x,2)));
    }
    public static double formula2(double x){
        return Math.cos(Math.asin(Math.exp(-Math.abs(x))));
    }
    public static double formula3(double x){
        return ((Math.pow(Math.sin(Math.log(Math.abs(x))),0.25*Math.cos(Math.exp(x)) ))/3);
    }
    public static void  printArray(double[][] z){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 14; j++) {
                if (Double.isNaN(z[i][j])) {
                    System.out.printf("%10s", "null");
                } else if (Double.isInfinite(z[i][j])) {
                    System.out.printf("%15s", "infinite");
                } else {
                    System.out.printf("%10.4f", z[i][j]);
                }
            }
            System.out.println("\n");
        }
    }

    public static void main (String[] args) {
        //short[] w = {16,14,12,10,8,6,4,2}; // for loop
        int[] w = new int[8];
        for (int i=8; i>0;--i) {
            w[8-i]=i*2;
        }

        float[] x = new float [14];
        for (int i = 0; i < 10; ++i) {
            x[i] = (float) Math.random()*8-5; //fix
        }

        double[][] z = new double[8][14];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 14; j++) {  //if w[i] = 4, then z[i][j] = cos( sin((4*(x)^2))
        //rewrite to switch

                switch (w[i]){
                    case 4:
                        z[i][j] = formula1(x[j]);
        continue;
                   case 2:
                   case 8:
                   case 14:
                    case 16:
                        z[i][j] = formula2(x[j]);
        break;
                    default:
                        z[i][j] = formula3(x[j]);
                }
            }
        }
//        print the array -- into a static separate method
        printArray(z);
        System.out.println(1/4);
        //int[] x = 10;


        //example of argument
        if(args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                int a = i+1;
                System.out.println("argument "+ a + ": "+args[i]);
            }
        }  else{
            System.out.println("there are mno arguments");
        }


       //System.out.println(x);

    }}
//


