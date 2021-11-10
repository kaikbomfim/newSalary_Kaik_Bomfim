/*This program is to do a calculation to know what is the new salary with a certain rate*/

import java.util.Scanner;
class Main{
  public static void main(String [] args){

    float salary, rate, newSalary;

    Scanner keyboard = new Scanner(System.in);


    System.out.print("Informe o salário atual: ");
    salary = keyboard.nextFloat();

    System.out.print("Informe o percentual de aumento (+)/descréscimo (-): ");
    rate = keyboard.nextFloat();

    
    newSalary = salary * (1 + (rate/100));
    System.out.print("O salário aplicado ao percentual informado é igual a: " + newSalary);


  }
}