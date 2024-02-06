package seminar1.seminarDj.task2.swing.task1.task1S02;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame{
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_POSX = 800;
    private static final int WINDOW_POSY = 300;
    JButton btnStart,btnExit; // отвечает за кнопки
    Map map;
    SettingsWindow settings;
    public GameWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);  // Что бы закрылось
        setLocation(WINDOW_POSX,WINDOW_POSY); // Размер окна - поток
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT); // Размер окна - поток
        setLocationRelativeTo(null);

        setTitle("TicTacToe");
        setResizable(false); // запрет на изменения окна

        btnStart = new JButton("Start new game");
        btnExit = new JButton("Exit");


        map = new Map();


       settings = new SettingsWindow(this);

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings.setVisible(true);
            }
        });

        // Компоновщик
        JPanel panBottom = new JPanel(new GridLayout(1, 2));
        panBottom.add(btnStart);
        panBottom.add(btnExit);

        add(panBottom, BorderLayout.SOUTH); // добавить кнопки
        add(map);

        setVisible(true); //окно создается, оно по умолчанию невидимо
    }
    void startNewGame(int mode, int sizeX, int sizeY, int winLen){
        map.startNewGame(mode, sizeX, sizeY, winLen);
    }
}
