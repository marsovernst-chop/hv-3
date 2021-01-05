package com.company;

public class Main {

    public static void main(String[] args) {

        double massiv[] = {0.10, 0.56, -5.89, 0.47, 6.36, -10.85, 0.12, -0.22, 2.46, 0.91, 1.80, -0.77, 4.53, 0.81, -5.33};
        double sum = 0;
        int temp = 1;
        boolean otr = false;

        for (int i = 0; i < massiv.length; i++) {

            if (massiv[i] < 0) {
                otr=true;
            }

            if (otr && massiv[i] > 0) {
                sum+=massiv[i];
                temp++;
            }
        }
        System.out.println("Среднее арифметическое:"+sum/temp);
    }
}
