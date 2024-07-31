package EX_5;

class Node {
    Task task;
    Node next;

    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
}

public class TaskLinkedList {
    private Node head;

    public TaskLinkedList() {
        this.head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Task searchTask(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null; // Task not found
    }

    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    public boolean deleteTask(String taskId) {
        if (head == null) {
            return false; // List is empty
        }

        if (head.task.getTaskId().equals(taskId)) {
            head = head.next; // Remove head
            return true;
        }

        Node current = head;
        while (current.next != null && !current.next.task.getTaskId().equals(taskId)) {
            current = current.next;
        }

        if (current.next == null) {
            return false; // Task not found
        }

        current.next = current.next.next; // Remove node
        return true;
    }
}


