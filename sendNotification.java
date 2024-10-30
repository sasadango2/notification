import java.awt.*;
import javax.swing.*;

public class sendNotification {
    // 通知を表示するための処理
    public static void notificationDisplay() {
        // SystemTrayのインスタンスを取得
        SystemTray tray = SystemTray.getSystemTray();
        // アイコンの画像を設定
        Image image = Toolkit.getDefaultToolkit().getImage("P1180131.jpg");
        // トレイアイコンを生成（リマインダーとして）
        TrayIcon trayIcon = new TrayIcon(image, "リマインダー");
        trayIcon.setImageAutoSize(true); // アイコンを自動的にリサイズ
        // システムトレイにトレイアイコンを追加
        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            System.err.println("トレイアイコンの追加に失敗しました。");
            return;
        }
        // 通知の表示
        trayIcon.displayMessage("休憩の時間です！", "画面の見過ぎですよあなた。", TrayIcon.MessageType.INFO);
        // 画像付きの通知を別のウィンドウで表示
        displayImageNotification();
        System.exit(0);
        
    }

    // 画像付きの通知を表示するメソッド
    public static void displayImageNotification() {
        // 画像を含むラベルを作成
        ImageIcon icon = new ImageIcon("P1180131.jpg"); // 画像を設定
        JLabel label = new JLabel("休憩の時間です！", icon, JLabel.CENTER); // 画像とテキストを設定

        //画像付きのメッセージを表示
        JOptionPane.showMessageDialog(null, label, "休憩催促通知", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {
        // 通知を表示するメソッド呼び出し
        notificationDisplay();
    }
}
