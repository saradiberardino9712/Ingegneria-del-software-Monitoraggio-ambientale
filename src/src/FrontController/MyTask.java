package FrontController;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

import javafx.scene.control.Label;

public class MyTask extends TimerTask {
	
	public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";
	private Label txtdataora;
	
	public MyTask(Label txtdataora) {
		this.txtdataora=txtdataora;
	}
	
	public void run() {
		Calendar cal = Calendar.getInstance();
    	SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
    	sdf.format(cal.getTime());
    	txtdataora.setText(sdf.format(cal.getTime()));
	}	
}
