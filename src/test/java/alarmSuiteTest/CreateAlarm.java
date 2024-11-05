package alarmSuiteTest;

import activities.alarm.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreateAlarm extends AlarmTestBase{
    @Test
    public void CreateAlarmSuccessfully(){
        homePage.alarmButton.click();
        alarmPage.addAlarmButton.click();
        alarmPage.selectHour.click();
        alarmPage.selectMinutes.click();
        alarmPage.selectAM.click();
        //alarmPage.acceptAlarm.click();
        Assertions.assertTrue(alarmPage.newAlarmLabel.isControlDisplayed(),"ERROR! The alarm was not created");
    }
}
