package whenDo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CRUDTask extends WhenDoBase{
    @Test
    public void taskCRUDIsSuccessfull(){
        //Create project
        String task = "UPB"+new Date().getTime();
        String noteTask= "UPB";

        mainPage.addTaskButton.click();
        taskFormsPage.taskNameTextBox.setText(task);
        taskFormsPage.notesTextBox.setText(noteTask);
        taskFormsPage.addTaskButton.click();
        String actualTask = mainPage.nameOfTaskLabel.getText();
        String actualNoteTask = mainPage.noteOfTaskLabel.getText();
        Assertions.assertEquals(task, actualTask,"ERROR! The task was not created");
        Assertions.assertEquals(noteTask,actualNoteTask,"ERROR! The task was not created");

        //Update project
        String updatedTask = task + "UPDATED";
        String updatedNote = noteTask + "UPDATED";

        mainPage.taskButton.click();
        taskFormsPage.taskNameTextBox.clearSetText(updatedTask);
        taskFormsPage.notesTextBox.clearSetText(updatedNote);
        taskFormsPage.updateTaskbutton.click();
        actualTask = mainPage.nameOfTaskLabel.getText();
        actualNoteTask = mainPage.noteOfTaskLabel.getText();
        Assertions.assertEquals(updatedTask, actualTask,"ERROR! The task was not updated");
        Assertions.assertEquals(updatedNote,actualNoteTask,"ERROR! The task was not updated");

        //Delete project
        mainPage.taskButton.click();
        taskFormsPage.deleteTaskButton.click();
        deleteProjectPopUp.confirmDeleteButton.click();
        Assertions.assertTrue(mainPage.noTasksLabel.isControlDisplayed(),"ERROR!The task was not deleted");
    }
}
