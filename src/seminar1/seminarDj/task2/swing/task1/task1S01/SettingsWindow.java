package seminar1.seminarDj.task2.swing.task1.task1S01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 236;
    private static final int WINDOW_WIDTH = 350;


    JButton btnStart;
        SettingsWindow(GameWindow gameWindow){

            btnStart = new JButton("Start new game");
            //JPanel modelPanel = getModelPanel();

            JPanel mainPanel = new JPanel(new GridLayout(3,1));


        setLocationRelativeTo(gameWindow);
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameWindow.startNewGame(0,3,3,3);
                setVisible(false);
            }
        });

        mainPanel.add(getModelPanel());
        mainPanel.add(getFieldSize());

        add(mainPanel);
    }
    private JPanel getModelPanel(){
        JPanel modelPanel = new JPanel(new GridLayout(3,1));

        JLabel textTitle = new JLabel("Select  mode game: ");
        JRadioButton robotButton = new JRadioButton("Human vs comp");
        JRadioButton humanButton = new JRadioButton("Human vs human");

        robotButton.setSelected(true);
        humanButton.setSelected(true);

        ButtonGroup group = new ButtonGroup();
        group.add(robotButton);
        group.add(humanButton);

        modelPanel.add(textTitle);
        modelPanel.add(robotButton);
        modelPanel.add(humanButton);


        return  modelPanel;
    }
    private JPanel getFieldSize(){
        JPanel modelPanel = new JPanel(new GridLayout(3,1));

        //JLabel textTitle = new JLabel("Select  mode game: ");

        JLabel textTitle1 = new JLabel("Human size pol");
        JLabel textTitle2 = new JLabel("Loading size pol");

        JSlider slider = new JSlider(3,10,3);

        modelPanel.add(textTitle1);
        modelPanel.add(textTitle2);
        modelPanel.add(slider);

        return modelPanel;
    }
}
