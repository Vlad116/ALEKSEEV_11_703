package Staff;

public class ProjectManager extends CompanyEmployee {
    public ProjectManager(String name){
        this.name = name;
        salary = 90000;
        post = "Проект менеджер";
        charge = "Отвечает за сроки сдачи , ведет все переговоры с заказчиками";
    }
    @Override
    void getInfo() {
        System.out.println("Имя: " + name + "\n" + "Пост: " + post + "\n" + "Зарплата: " + salary + "\n" + "Задачи: " + charge);
    }
}
