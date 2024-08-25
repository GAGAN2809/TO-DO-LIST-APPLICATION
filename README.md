# TO-DO-LIST-APPLICATION

This project is a console-based task management application in Java, designed to handle a simple to-do list with functionalities to add, delete, and view tasks. Below is a detailed description of the project:

### Project Description: To-Do List Management System

#### **Purpose**
The To-Do List Management System is a console-based application that allows users to manage their tasks efficiently. Users can add new tasks, delete completed tasks, view completed tasks, and view remaining tasks.

#### **Components**

1. **Task Addition (`addTask` Method)**:
   - **Function**: Prompts the user to enter a number of tasks and then collects those tasks.
   - **Process**:
     - Asks the user how many tasks they want to add.
     - Collects each task input from the user.
     - Adds these tasks to the existing list of tasks.
     - Displays a confirmation message listing the added tasks.
   - **Parameters**: `ArrayList<String> ar1` (the list of tasks), `Scanner sc` (to read user input).
   - **Returns**: Updated `ArrayList<String>` with the added tasks.

2. **Task Deletion (`delTask` Method)**:
   - **Function**: Allows the user to delete a completed task from the list.
   - **Process**:
     - Lists all the tasks with indices for the user to choose from.
     - Prompts the user to select a task to delete.
     - Moves the selected task to a completed tasks list (`ar2`).
     - Removes the task from the main task list (`ar1`).
     - Displays a confirmation message for the removed task.
   - **Parameters**: `ArrayList<String> ar1` (the list of tasks), `Scanner sc` (to read user input), `ArrayList<String> ar2` (the list of completed tasks).
   - **Returns**: Updated `ArrayList<String>` of completed tasks (`ar2`).

3. **View Completed Tasks (`vicoTask` Method)**:
   - **Function**: Displays all completed tasks.
   - **Process**:
     - Iterates over the list of completed tasks and prints each task.
   - **Parameters**: `ArrayList<String> ar2` (the list of completed tasks).

4. **View Remaining Tasks (`vireTask` Method)**:
   - **Function**: Displays all remaining tasks.
   - **Process**:
     - Iterates over the main list of tasks and prints each task.
   - **Parameters**: `ArrayList<String> ar1` (the list of remaining tasks).

5. **Main Method**:
   - **Function**: Provides a menu-driven interface for user interaction.
   - **Process**:
     - Displays options for adding tasks, deleting tasks, viewing completed tasks, viewing remaining tasks, and exiting the application.
     - Reads the user’s choice and calls the appropriate method based on the user’s selection.
     - Continues to loop until the user chooses to exit the application.
   - **Parameters**: None.

#### **User Interaction Flow**

1. **Add Tasks**:
   - User selects the option to add tasks.
   - The system prompts for the number of tasks and then asks for each task.
   - Tasks are added to the main list and a confirmation message is displayed.

2. **Delete Completed Tasks**:
   - User selects the option to delete a completed task.
   - The system lists all tasks with indices.
   - User selects a task to delete.
   - The selected task is moved to the completed tasks list and removed from the main list.

3. **View Completed Tasks**:
   - User selects the option to view completed tasks.
   - The system displays all tasks that have been marked as completed.

4. **View Remaining Tasks**:
   - User selects the option to view remaining tasks.
   - The system displays all tasks that are still pending.

5. **Exit**:
   - User selects the option to exit the application.
   - The application terminates.

#### **Key Features**
- **Dynamic Task Management**: Add and remove tasks dynamically.
- **Separation of Concerns**: Maintains separate lists for tasks and completed tasks.
- **User-Friendly Interface**: Simple console interface with menu options.
- **Error Handling**: Includes basic validation for invalid choices.

This project is an example of basic Java programming, demonstrating the use of `ArrayList`, `Scanner`, and simple control flow to manage and interact with a to-do list.
