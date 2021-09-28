
package sptv20zadanije2arturstassenko;

import java.util.Scanner;


public class SPTV20Zadanije2ArturStassenko {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int num=scanner.nextInt();
        int sot=num/100,des=(num%100)/10,ed=num%10,sum=sot+des+ed;
        System.out.println("Сумма введенного трехзначного числа равна: "+sum);
    }
    
}
