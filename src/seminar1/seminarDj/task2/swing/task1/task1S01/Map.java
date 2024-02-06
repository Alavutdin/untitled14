package seminar1.seminarDj.task2.swing.task1.task1S01;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    Map(){
        setBackground(Color.BLACK);
    }
    void startNewGame(int mode, int fSzX, int fSxY, int wLen) {
        System.out.printf("Mode: %d;\nSize: x=%d, x=%d;\nWin Lenght: %d",
                mode, fSzX, fSxY, wLen);

    }
}
