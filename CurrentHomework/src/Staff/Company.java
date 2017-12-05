package Staff;

import java.util.Scanner;
/* main допишу и покажу завтра, суть:
   1) создать массив сотрудников компании,
   2) вывести информацию о каждом сотруднике,
   3) найти сумму которая нужна что бы выплатить зарплату*/
public class Company {
    public static void main(String[] args) {
        /* System.out.println("Введите кол-во сотрудников: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();*/
        int StaffSalary = 0;
        ProjectManager Ilya = new ProjectManager("Ilya");
        Analyst Vasya = new Analyst("Vasya");
        Designer Olya = new Designer("Olya");
        Devoloper Jack = new Devoloper("Jack");
        Devoloper John = new Devoloper("John");
        Tester Ly = new Tester("Ly");
        CompanyEmployee staff[] = {Ilya,Vasya,Olya,Jack,John,Ly};
        for (int i = 0; i < staff.length; i++){
            staff[i].getInfo();
            System.out.println();
            StaffSalary += staff[i].salary;
        }
        System.out.println("Всего сотрудникам нужно заплатить: " + StaffSalary);
    }
}
