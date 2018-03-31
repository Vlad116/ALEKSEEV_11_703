package Archive.src.Staff;

public class Devoloper extends CompanyEmployee {
    public Devoloper(String name){
        this.name = name;
        salary = 38000;
        post = "Разработчик";
        charge = "Пишет код приложения";
    }
    @Override
    void getInfo() {
        System.out.println("Имя: " + name + "\n" + "Пост: " + post + "\n" + "Зарплата: " + salary + "руб." + "\n" + "Задачи: " + charge);
    }
}
