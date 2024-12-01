import java.util.ArrayList;
import java.util.List;

public class Ride implements RideInterface {
    private String rideName;
    private Employee operator;
    private int capacity;
    private List<Visitor> queue;
    private List<Visitor> history;

    public Ride() {
        queue = new ArrayList<>();
        history = new ArrayList<>();
    }

    public Ride(String rollerCoaster, Employee operator, int i) {
    }

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (queue.size() < capacity) {
            queue.add(visitor);
        } else {
            System.out.println("The queue is full!");
        }
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        queue.remove(visitor);
    }

    @Override
    public void printQueue() {
        System.out.println("Visitors in the queue:");
        for (Visitor v : queue) {
            System.out.println(v.getName());
        }
    }

    @Override
    public void runOneCycle() {
        if (!queue.isEmpty()) {
            Visitor v = queue.remove(0);
            history.add(v);
            System.out.println(v.getName() + " has taken this ride.");
        } else {
            System.out.println("The queue is empty, cannot operate.");
        }
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        history.add(visitor);
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return history.contains(visitor);
    }

    @Override
    public int numberOfVisitors() {
        return history.size();
    }

    @Override
    public void printRideHistory() {
        System.out.println("Ride history:");
        for (Visitor v : history) {
            System.out.println(v.getName());
        }
    }
}

