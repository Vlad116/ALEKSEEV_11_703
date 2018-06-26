package ExamTask.Task2;

// pattern - Prototype
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Hero myHero = new Hero("Vlad");
        myHero.run();
        myHero.speak();
        System.out.println("We're attacked." + "\n");
        myHero.attack();

        System.out.println("We're injured, using the avatar." + "\n");
        Hero myHeroAvatar = myHero.useAnAvatarCyborg();

        myHeroAvatar.run();
        myHeroAvatar.attack();
        myHeroAvatar.speak();

    }
}
