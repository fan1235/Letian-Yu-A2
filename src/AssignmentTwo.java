public class AssignmentTwo {

    public static void main(String[] args) {
        Employee operator = new Employee("John Doe", 30, "E001", "Ride Operator", 40);
        Visitor visitor1 = new Visitor("Alice", 25, "V001", "Regular", 0);
        Visitor visitor2 = new Visitor("Bob", 28, "V002", "VIP", 3);

        Ride rollerCoaster = new Ride("Roller Coaster", operator, 5);

        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);

        rollerCoaster.printQueue();

        rollerCoaster.runOneCycle();

        rollerCoaster.printRideHistory();

        rollerCoaster.printQueue();
    }

    public void partThree() {
    }

    public void partFourA() {
    }

    public void partFourB() {
    }

    public void partFive() {
    }

    public void partSix() {
    }

    public void partSeven() {
    }
}
