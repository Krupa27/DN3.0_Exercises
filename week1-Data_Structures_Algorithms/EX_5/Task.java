package EX_5;

public class Task {
    private String taskId;
    private String taskName;
    private String status;

    public Task(String taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Task ID: " + taskId + ", Task Name: " + taskName + ", Status: " + status;
    }
    
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();
    
        // Adding tasks
        taskList.addTask(new Task("001", "Task 1", "Pending"));
        taskList.addTask(new Task("002", "Task 2", "In Progress"));
        taskList.addTask(new Task("003", "Task 3", "Completed"));
    
        // Traversing tasks
        System.out.println("All Tasks:");
        taskList.traverseTasks();
    
        // Searching for a task
        String searchId = "002";
        Task task = taskList.searchTask(searchId);
        if (task != null) {
            System.out.println("\nTask found: " + task);
        } else {
            System.out.println("\nTask with ID " + searchId + " not found.");
        }
    
        // Deleting a task
        String deleteId = "001";
        boolean deleted = taskList.deleteTask(deleteId);
        if (deleted) {
            System.out.println("\nTask with ID " + deleteId + " deleted.");
        } else {
            System.out.println("\nTask with ID " + deleteId + " not found.");
        }
    
        // Traversing tasks after deletion
        System.out.println("\nTasks after deletion:");
        taskList.traverseTasks();
    }

}




