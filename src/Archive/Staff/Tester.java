package OOP.Staff;

public class Tester extends CompanyEmployee {
    public Tester(String name){
        this.name = name;
        salary = 25000;
        post = "Тестировщик";
        charge = "Проводит тесты приложения,ищет баги";
    }
    @Override
    void getInfo() {
        System.out.println("Имя: " + name + "\n" + "Пост: " + post + "\n" + "Зарплата: " + salary + "руб." + "\n" + "Задачи: " + charge);
    }
}
