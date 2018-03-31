package OOP.Staff;

public class Company {
    public static void main(String[] args) {
        int StaffSalary = 0;
        ProjectManager Ilya = new ProjectManager("Ilya");
        Analyst Vasya = new Analyst("Vasya");
        Designer Olya = new Designer("Olya");
        Devoloper Jack = new Devoloper("Jack");
        Devoloper John = new Devoloper("John");
        Tester Ly = new Tester("Li");
        Tester Ty = new Tester("Ty");
        CompanyEmployee staff[] = {Ilya,Vasya,Olya,Jack,John,Ly,Ty};
        for (int i = 0; i < staff.length; i++){
            staff[i].getInfo();
            System.out.println();
            StaffSalary += staff[i].salary;
        }
        System.out.println("Все необходимо выдать зарплату на сумму: " + StaffSalary);
    }
}