package whenDo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AlphabeticalSort extends WhenDoBase{
    @Test
    public void alphabeticalSort(){
        String[] taskNames = {"Ahorrar dinero", "Borrar mis pendientes", "Zerain reunion"};
        for (String taskName : taskNames) {
            addTask(taskName);
        }
        mainPage.sortByOrder.click();
        mainPage.alphabeticOption.click();
        for(int i = 1; i <= 3; i++){
            Assertions.assertEquals(taskNames[i-1], mainPage.getLabelOfTask(i));
        }
    }
    private void addTask(String taskName){
        mainPage.addTaskButton.click();
        taskFormsPage.addTask(taskName);
    }
}
