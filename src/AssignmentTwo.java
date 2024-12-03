public class AssignmentTwo {

    public static void main(String[] args) {

    }

    public void partThree() {
        System.out.println("-------partThree-----");
        Employee emp1 = new Employee("Alice", 28, "1234567890", "E123", "Ride Operator");
        Visitor visitor1 = new Visitor("Bob", 35, "0987654321", "T1001", "Roller Coaster");
        Visitor visitor2 = new Visitor("Charlie", 22, "5678901234", "T1002", "Roller Coaster");
        Visitor visitor3 = new Visitor("David", 30, "8765432109", "T1003", "Roller Coaster");
        Visitor visitor4 = new Visitor("Eva", 26, "2345678901", "T1004", "Roller Coaster");
        Visitor visitor5 = new Visitor("Frank", 40, "3456789012", "T1005", "Roller Coaster");
        Ride ride1 = new Ride("Roller Coaster", "Thrill Ride", emp1);
        ride1.addVisitorToQueue(visitor1);
        ride1.addVisitorToQueue(visitor2);
        ride1.addVisitorToQueue(visitor3);
        ride1.addVisitorToQueue(visitor4);
        ride1.addVisitorToQueue(visitor5);
        ride1.printQueue();
        ride1.removeVisitorFromQueue(visitor3);
        ride1.printQueue();
        ride1.runOneCycle();
        ride1.printQueue();

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
