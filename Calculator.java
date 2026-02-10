import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String B = sc.nextLine();
        float A = sc.nextFloat();
        int C = sc.nextInt();

        float premium = 0;
        float Final = 0;

        if (B.equals("Domestic")) {
            int process = 50;
            if (A < 100000 ) {
                premium = (float)(0.003 * A);
                float total = premium + process;
                if (C==0){
                    float bonus = (float)(0.1 * total);
                    Final = total - bonus;
                 }
                 else Final=total;
            }
            else if (A >= 100000 ){
                premium = (float)(0.0025 * A);
                float total = premium + process;
                if (C==0){
                    float bonus = (float)(0.1 * total);
                    Final = total - bonus;
                }
                else Final=total;
            }
        }
        else{
            int process = 80;
            if (A<250000){
                premium = (float)(0.005 * A);
                float total = premium + process;
                if (C==0){
                    float bonus = (float)(0.15 * total);
                    Final = total - bonus;
                }
                else Final=total;
            }
            if (A>=250000){
                premium = (float)(0.0075 * A);
                float total = premium + process;
                if (C==0){
                    float bonus = (float)(0.15 * total);
                    Final = total - bonus;
                }
                else Final=total;
            }
            }
        System.out.printf("%.2f",Final);
    }
}