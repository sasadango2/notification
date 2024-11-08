import java.util.Timer;
import java.util.TimerTask;;

public class timerPreference {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                sendNotification.notificationDisplay();
            }
        };
        timer.schedule(task, 3600000);
    }
    
}