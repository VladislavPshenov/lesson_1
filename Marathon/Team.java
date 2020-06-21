package Lesson_1.Marathon;

public class Team {

    private String teamName;
    private Competitor[] competitors;

    public Team(String teamName, Competitor... competitors)
    {
        this.teamName = teamName;
        this.competitors = competitors;
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public void showResults() {
        System.out.println("информация обо всех членах команды: " +teamName);
        for (Competitor competitor : competitors)
        {
            competitor.result();
        }
    }

    public void showResultIsTrue() {
        System.out.println("Информация о членах команды прошедших дистанцию: " + teamName);
        for (Competitor competitor : competitors) {
            if (competitor.isOnDistance())
            {
                competitor.result();
            }
        }
    }
}