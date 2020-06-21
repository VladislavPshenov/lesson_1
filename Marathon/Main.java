package Lesson_1.Marathon;


public class Main {
    public static void main(String[] args) {
       // Competitor[] competitors = { new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
//        Obstacle[] course = {new Cross(80), new Water(5), new Wall(1), new Cross(120)};
//        for (Competitor c : competitors) {
//            for (Obstacle o : course) {
//                o.doIt(c);
//                if (!c.isOnDistance()) break;
//            }
//        }
//        for (Competitor c : competitors) {
//            c.info();
//        }


        Course course1 = new Course(new Cross(280), new Wall(4), new Water(10));

        Team team1 = new Team ("команда 1", new Human("Иван"), new Cat("Мурик"),
                new Dog("Шарик"), new Cat("Барсик"));


        course1.doIt(team1);

        System.out.println ();
        System.out.println ( "РЕЗУЛЬТАТЫ: ");
        System.out.println ();

        team1.showResults ();
        System.out.println ();
        team1.showResultIsTrue ();
    }
}