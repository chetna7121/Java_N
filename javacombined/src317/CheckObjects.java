package javacombined.src317;

import javacombined.src317.model.Money;
import javacombined.src317.model.Team;

import java.util.HashMap;
import java.util.Map;
public class CheckObjects {
    void checkObjects()
    {
        Money money = new Money(100,"INR");
        Money money1 = new Money(100,"INR");
        Money money2 = new Money();
        Money money3 = new Money();
    //    money1=money;
        //SOP carries only those methods which return something
        System.out.println(money.equals(money1) +"\t"+money.hashCode()+"\t"+money1.hashCode()); //false
        System.out.println(money2.equals(money3));
    }
    void checkTeamObjects()
    {
        Map<Team,String> leaders = new HashMap<>();
        leaders.put(new Team("New York","Development"),"Anne");
        leaders.put(new Team("Boston","Development"),"Brain");
        leaders.put(new Team("New York","Marketing"),"Charlie");
        Team myTeam = new Team("New York","Development");
        Team myTeam1 = new Team("New York","Development");
        System.out.println("hashcode result "+leaders.get(myTeam));
        System.out.println("equals result "+myTeam.equals(myTeam1));
    }
}
