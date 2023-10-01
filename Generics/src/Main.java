public class Main {
    public static void main(String[] args) {

        FootballPlayer Messi = new FootballPlayer("Messi");
        SoccerPlayer Ronaldo = new SoccerPlayer("Ronaldo");
        BaseballPlayer Dhoni = new BaseballPlayer("Dhoni");

        Team<FootballPlayer> RCB = new Team("RCB");
        RCB.addPlayer(Messi);

        Team<SoccerPlayer> FC = new Team<>("FC");
        FC.addPlayer(Ronaldo);

        Team<FootballPlayer> Goa = new Team<>("Goa");
        Team<FootballPlayer> Hyderabad = new Team<>("Hyderabad");

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Thunder");
        baseballPlayerTeam.addPlayer(Dhoni);

        Hyderabad.matchResult(Goa, 10, 0);
        Goa.matchResult(Hyderabad, 1, 100);

        Hyderabad.matchResult(Goa, 10, 0);

        System.out.println("Rankings");
        System.out.println(Goa.getName() + ": " + Goa.ranking());
        System.out.println(Hyderabad.getName() + ": " + Hyderabad.ranking());

        System.out.println(Hyderabad.compareTo(Goa));

    }
}