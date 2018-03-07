package Staff;

public class Designer extends CompanyEmployee {
    public Designer(String name){
        this.name = name;
        salary = 37000;
        post = "Дизайнер";
        charge = "Отвечает за графический дизайн приложения или сайта";
    }
    @Override
    void getInfo() {
        System.out.println("Имя: " + name + "\n" + "Пост: " + post + "\n" + "Зарплата: " + salary + "руб." + "\n" + "Задачи: " + charge);
    }
}
