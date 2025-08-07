import java.util.ArrayList;
import java.util.List;

public class CraftAInteractiveApp {
    // User interface components
    private String userInput;
    private String trackerOutput;

    // Tracker data structure
    private List<String> taskList;

    public CraftAInteractiveApp() {
        taskList = new ArrayList<>();
    }

    public void runTracker() {
        while (true) {
            userInput = getUserInput();
            if (userInput.equalsIgnoreCase("quit")) {
                break;
            } else if (userInput.startsWith("add ")) {
                String task = userInput.substring(4);
                taskList.add(task);
                trackerOutput = "Task added: " + task;
            } else if (userInput.startsWith("remove ")) {
                String task = userInput.substring(7);
                taskList.remove(task);
                trackerOutput = "Task removed: " + task;
            } else if (userInput.equals("list")) {
                trackerOutput = "Task list: " + taskList.toString();
            } else {
                trackerOutput = "Invalid command. Try 'add <task>', 'remove <task>', or 'list'";
            }
            displayTrackerOutput();
        }
    }

    private String getUserInput() {
        // Implement input mechanism, e.g., console, GUI, or web interface
        return "";
    }

    private void displayTrackerOutput() {
        // Implement output mechanism, e.g., console, GUI, or web interface
        System.out.println(trackerOutput);
    }

    public static void main(String[] args) {
        CraftAInteractiveApp tracker = new CraftAInteractiveApp();
        tracker.runTracker();
    }
}