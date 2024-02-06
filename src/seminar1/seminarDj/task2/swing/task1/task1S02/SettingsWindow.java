package seminar1.seminarDj.task2.swing.task1.task1S02;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 236;
    private static final int WINDOW_WIDTH = 350;
    private JSlider sliderSize,sliderWin;
    JRadioButton humanComp,humanHuman;

    JButton btnStart;
    JButton btnExit;
    SettingsWindow(GameWindow gameWindow){
        btnStart = new JButton("Start new game");
        //JPanel modelPanel1 = getModePanel();
        //JPanel modelPanel2 = getFieldSize();
        JPanel mainPanel = new JPanel(new GridLayout(3,1));


        setLocationRelativeTo(gameWindow);
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                int mode =humanComp.isSelected()?1:0;// метод выбран ли элемент
                gameWindow.startNewGame(0,sliderSize.getValue(),
                        sliderSize.getValue(),sliderSize.getValue());
            }
        });

        mainPanel.add(getModePanel());
        mainPanel.add(getFieldSize());
        mainPanel.add(getWinLength());
        add(mainPanel);
        add(btnStart, BorderLayout.SOUTH);

    }
    private JPanel getModePanel(){
        JPanel modelPanel = new JPanel(new GridLayout(3,1));

        JLabel textTitle = new JLabel("Select mode game");
        humanComp = new JRadioButton("Human vs Comp");
        humanHuman = new JRadioButton("Human vs Human");

        humanComp.setSelected(true);
        ButtonGroup group = new ButtonGroup();
        group.add(humanComp);
        group.add(humanHuman);

        modelPanel.add(textTitle);
        modelPanel.add(humanComp);
        modelPanel.add(humanHuman);

        return modelPanel;
    }

    private JPanel getFieldSize(){
        String testTitle = " Installed size field ";

        JPanel modelPanel = new JPanel(new GridLayout(3,1));

        JLabel textTitle1 = new JLabel("Select size field: ");

        sliderSize = new JSlider(3,10,3);

        JLabel textTitle2 = new JLabel(testTitle+sliderSize.getValue());

        sliderSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
               textTitle2.setText(testTitle+sliderSize.getValue());
               sliderWin.setMaximum(sliderSize.getValue());
            }
        });
        modelPanel.add(textTitle1);
        modelPanel.add(textTitle2);
        modelPanel.add(sliderSize);

        return modelPanel;
    }
    private JPanel getWinLength(){
        JPanel modelPanel = new JPanel(new GridLayout(3,1));

        String testTitle = " Choose the length to win ";

        JLabel textTitle1 = new JLabel("The length is set: ");

        sliderWin = new JSlider(3,10,3);

        JLabel textTitle2 = new JLabel(testTitle+sliderWin.getValue());

        sliderWin.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                textTitle2.setText(testTitle+sliderWin.getValue());
            }
        });
        modelPanel.add(textTitle1);
        modelPanel.add(textTitle2);
        modelPanel.add(sliderWin);

        return modelPanel;
    }
}