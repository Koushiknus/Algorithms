package general;

public class JavaFormatterSample {

    public static void main(String args[]){
        int x = 100;
        // Printf samples

        System.out.printf("Printing sample integer: x= %d\n", x);
        // Format with 3 decimal values
        System.out.printf("Formatted with two decimals: Koushik = %.3f\n",Math.PI);

        float n = 5.2f;
        System.out.printf("To show append zero to right example: test = %.4f\n",n);

        // Format
         n = 2324435.7f;
         System.out.printf("Formatted to the right margin: n = %20.4f\n",n);

    }
}
