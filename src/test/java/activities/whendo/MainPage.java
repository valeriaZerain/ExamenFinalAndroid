package activities.whendo;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class MainPage {
    public Button addTaskButton = new Button(By.xpath("//android.widget.ImageButton[@resource-id=\"com.vrproductiveapps.whendo:id/fab\"]"));
    public Label nameOfTaskLabel = new Label(By.xpath("//android.widget.TextView[@resource-id=\"com.vrproductiveapps.whendo:id/home_list_item_text\"]"));
    public Label noteOfTaskLabel = new Label(By.xpath("//android.widget.TextView[@resource-id=\"com.vrproductiveapps.whendo:id/home_list_item_text2\"]"));
    public Button taskButton = new Button(By.xpath("//android.widget.ListView[@resource-id=\"com.vrproductiveapps.whendo:id/notesList\"]/android.view.ViewGroup/android.widget.LinearLayout"));
    public Label noTasksLabel = new Label(By.xpath("//android.widget.TextView[@resource-id=\"com.vrproductiveapps.whendo:id/noNotesText\"]"));
}
