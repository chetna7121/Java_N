package javacombined.src317.model;

public class Team {
    String city;
    String deparment;

    public Team() {
    }

    public Team(String city, String deparment) {
        this.city = city;
        this.deparment = deparment;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("its overridden equals method");
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Team))
            return false;
        Team team1 = (Team) obj;
        boolean objectEquals =
                ((this.city == null && team1.city == null)
                        ||
                        (this.deparment != null &&
                                this.city.equals(team1.city)));
        return this.city .equals(team1.city) && objectEquals;
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (city != null) {
            result = 31 * result + city.hashCode();
        }
        if (deparment != null) {
            result = 31 * result + deparment.hashCode();
        }
        return result;
    }
}
