import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    int originalTileSize = 16;
    int scale = 3;

    int tileSize = originalTileSize * scale;
    int maxScreenCol = 16;
    int maxScreenRow = 12;
    int screenWidth = tileSize * maxScreenCol;
    int screenHeight = tileSize * maxScreenRow;

    Thread gameThread;

    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    public void run() {

    }
}
