package builder.facade;

public class OccupationBuilder extends PersonBuilder {
    private Occupation occupation = new Occupation();

    public OccupationBuilder(Person person) {
        this.person = person;
        this.person.setOccupation(occupation);
    }

    public OccupationBuilder occupation(String occupation) {
        this.occupation.setOccupation(occupation);
        return this;
    }

    public OccupationBuilder earnings(String earnings) {
        this.occupation.setEarnings(earnings);
        return this;
    }

    public OccupationBuilder workingLocation(String workingLocation) {
        this.occupation.setWorkingLocation(workingLocation);
        return this;
    }

    public OccupationBuilder workingAt(String workingAt) {
        this.occupation.setWorkingAt(workingAt);
        return this;
    }

}
