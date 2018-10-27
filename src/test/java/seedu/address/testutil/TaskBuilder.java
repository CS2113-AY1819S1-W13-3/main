package seedu.address.testutil;

import seedu.address.model.task.Deadline;
import seedu.address.model.task.PriorityLevel;
import seedu.address.model.task.Task;

/**
 * A utility class to help with building Task objects.
 */
public class TaskBuilder {

    public static final String DEFAULT_DEADLINE = "1/1/2018";
    public static final String DEFAULT_MODULECODE = "CS2113T";
    public static final String DEFAULT_TITLE = "Complete code refactoring";
    public static final String DEFAULT_DESCRIPTION = "refer to notes";
    public static final String DEFAULT_PRIORITY = "high";
    public static final boolean DEFAULT_COMPLETE = false;
    public static final String DEFAULT_EXPECTED_NUM_OF_HOURS = "1";
    public static final String DEFAULT_COMPLETED_NUM_OF_HOURS = "0";

    private Deadline deadline;
    private String moduleCode;
    private String title;
    private String description;
    private PriorityLevel priority;
    private boolean isCompleted;
    private int expectedNumOfHours;
    private int completedNumOfHours;

    public TaskBuilder() {
        this.deadline = new Deadline(DEFAULT_DEADLINE);
        this.moduleCode = DEFAULT_MODULECODE;
        this.title = DEFAULT_TITLE;
        this.description = DEFAULT_DESCRIPTION;
        this.priority = new PriorityLevel(DEFAULT_PRIORITY);
        this.isCompleted = DEFAULT_COMPLETE;
        this.completedNumOfHours = Integer.parseInt(DEFAULT_COMPLETED_NUM_OF_HOURS);
        this.expectedNumOfHours = Integer.parseInt(DEFAULT_EXPECTED_NUM_OF_HOURS);
    }

    /**
     * Initializes the TaskBuilder with the data of {@code taskToCopy}.
     */
    public TaskBuilder(Task taskToCopy) {
        this.deadline = taskToCopy.getDeadline();
        this.moduleCode = taskToCopy.getModuleCode();
        this.title = taskToCopy.getTitle();
        this.description = taskToCopy.getDescription();
        this.priority = taskToCopy.getPriorityLevel();
        this.isCompleted = taskToCopy.isCompleted();
        this.expectedNumOfHours = taskToCopy.getExpectedNumOfHours();
        this.completedNumOfHours = taskToCopy.getCompletedNumOfHours();
    }
    /**
     * Sets the {@code Deadline} of the {@code Task} that we are building.
     */
    public TaskBuilder withDeadline(String deadline) {
        this.deadline = new Deadline(deadline);
        return this;
    }

    /**
     * Sets the ModuleCode of the {@code Task} that we are building.
     */
    public TaskBuilder withModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
        return this;
    }

    /**
     * Sets the Title of the {@code Task} that we are building.
     */
    public TaskBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Sets the {@code description} of the {@code Task} that we are building.
     */
    public TaskBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Sets the {@code Priority} of the {@code Task} that we are building.
     */
    public TaskBuilder withPriority(String priority) {
        this.priority = new PriorityLevel(priority);
        return this;
    }

    /**
     * Sets the completed status of the {@code Task} that we are building.
     */
    public TaskBuilder withCompletedNumOfHours(int hours) {
        this.isCompleted = true;
        this.completedNumOfHours = hours;
        return this;
    }

    /**
     * Sets the expected number of hours of the {@code Task} that we are building.
     */
    public TaskBuilder withExpectedNumOfHours(int expectedNumOfHours) {
        this.expectedNumOfHours = expectedNumOfHours;
        return this;
    }

    /**
     * Build the task with the parameters set
     * @return Task
     */
    public Task build() {
        return new Task(deadline, moduleCode, title, description, priority, expectedNumOfHours, completedNumOfHours,
                isCompleted);
    }
}