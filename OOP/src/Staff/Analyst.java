package Staff;

public class Analyst extends CompanyEmployee{

    public Analyst(String name){
        this.name = name;
        salary = 40000;
        post = "Аналитик";
        charge = " Пишет User-stories - сценарий того,что user,может сделать на сайте(отдается designer, по которому он рисует). Строит диаграмму связей между сущностями. \n" +
                " Создает список сущностей: атрибуты и связи между ними. (ER, relational, key). ";
    }

    @Override
    void getInfo() {
        System.out.println("Имя: " + name + "\n" + "Пост: " + post + "\n" + "Зарплата: " + salary + "руб." + "\n" + "Задачи: " + charge);
    }
}
