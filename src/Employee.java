public class Employee extends Person {
    private String jobTitle;
    private int hoursWorked;

    public Employee() {}

    public Employee(String name, int age, String id, String jobTitle, int hoursWorked) {
        super(name, age, id);
        this.jobTitle = jobTitle;
        this.hoursWorked = hoursWorked;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}

