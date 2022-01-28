import java.util.ArrayList;

public class TaskList {

    ArrayList<Task> taskArrayList;

    public TaskList(ArrayList<Task> taskArrayList) {
        this.taskArrayList = taskArrayList;
    }

    public void deleteTask(int index) {
        taskArrayList.remove(index);
    }

    public void addTask(Task task) {
        taskArrayList.add(task);
    }

    public ArrayList<String> convertListToString() {
        ArrayList<String> stringOfTasks = new ArrayList<>();
        int counter = 1;
        String indentation = "    ";

        if (taskArrayList.isEmpty()) {
            stringOfTasks.add("List is currently empty");
            return stringOfTasks;
        }

        for (Task task: taskArrayList) {
            stringOfTasks.add(indentation + String.valueOf(counter) + ". "  + task.toString() + task.getStatus() + " " + task.getDescription());
            counter++;
        }
        return stringOfTasks;
    }

    public void unmarkTask(int index) {
        taskArrayList.get(index).unmarkDone();
    }

    public void markTask(int index) {
        taskArrayList.get(index).markDone();
    }

    public Task getTask(int index) {
        return taskArrayList.get(index);
    }

    public int getSize() {
        return taskArrayList.size();
    }
}
