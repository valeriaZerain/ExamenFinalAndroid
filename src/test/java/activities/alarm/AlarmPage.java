package activities.alarm;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class AlarmPage {
    public Button addAlarmButton = new Button(By.xpath("//android.widget.Button[@content-desc=\"Add alarm\"]"));
    public Button selectHour = new Button(By.xpath("//android.widget.TextView[@content-desc=\"4 o'clock\"]"));
    public Button selectMinutes = new Button(By.xpath("//android.widget.TextView[@content-desc=\"45 minutes\"]"));
    public Button selectAM = new Button(By.xpath("//android.widget.CompoundButton[@resource-id=\"com.google.android.deskclock:id/material_clock_period_am_button\"]"));
    public Button acceptAlarm = new Button(By.xpath("//android.widget.Button[@resource-id=\"com.google.android.deskclock:id/material_timepicker_ok_button\"]"));
    public Label newAlarmLabel = new Label(By.xpath("//androidx.cardview.widget.CardView[@content-desc=\" Alarm\"]"));
}
