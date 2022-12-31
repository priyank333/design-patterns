package creational.builder.facade;

public class Occupation {
    private String occupation;
    private String earnings;
    private String workingLocation;
    private String workingAt;

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEarnings() {
        return earnings;
    }

    public void setEarnings(String earnings) {
        this.earnings = earnings;
    }

    public String getWorkingLocation() {
        return workingLocation;
    }

    public void setWorkingLocation(String workingLocation) {
        this.workingLocation = workingLocation;
    }

    public String getWorkingAt() {
        return workingAt;
    }

    public void setWorkingAt(String workingAt) {
        this.workingAt = workingAt;
    }

    @Override
    public String toString() {
        return "Occupation [occupation=" + occupation + ", earnings=" + earnings + ", workingLocation="
                + workingLocation + ", workingAt=" + workingAt + "]";
    }

}
