package seminar1.seminarDj.task2.swing.task1.task1S03;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingWindow extends JFrame {
    private static final int WIDTH = 230;
    private static final int HEIGHT = 350;

    JButton btnStart;
    //JButton — это класс в пакете javax.swing, который используется
    // для отображения кнопки на экране.
    JPanel modelPanel;
    JSlider sliderWin;

    SettingWindow(GameWindow gameWindow){
        btnStart = new JButton("Start new game");
        modelPanel = getModelPanel();

        setLocationRelativeTo(gameWindow);
        setSize(WIDTH, HEIGHT);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                gameWindow.startNewGame(0, 3, 3, 3);
            }
        });

        add(btnStart);
        add(getModelPanel());
        add(getFieldSize());
    }
    public JPanel getModelPanel(){
        modelPanel = new JPanel(new GridLayout(3,1));
        JLabel teetTitle = new JLabel("Select game");
        JRadioButton compButton = new JRadioButton("Human vs comp");
        //JRadioButton — это компонент Swing, который представляет элемент
        // с состоянием «выбрано» или «не выбрано».
        JRadioButton buttonHuman = new JRadioButton("Human vs Human");

        ButtonGroup group = new ButtonGroup();
        group.add(compButton);
        group.add(buttonHuman);

        modelPanel.add(teetTitle);
        modelPanel.add(compButton);
        modelPanel.add(buttonHuman);

        return modelPanel;
    }
    private JPanel getFieldSize() {
        /*JPanel — это элемент управления в Java, представляющий собой
        прямоугольное пространство, на котором можно размещать другие
        элементы.*/
        String textTitle = "Installed size fields";
        modelPanel = new JPanel(new GridLayout(3,1));
        JLabel textTitle1 = new JLabel("Select field size ");
        // отображения короткой строки или значка
        JSlider sliderSize = new JSlider(3,10,3);
        //позволить пользователям регулировать числовое значение между
        // минимальным и максимальным значениями.
        JLabel textTitle2 = new JLabel(textTitle + sliderSize.getValue());

        sliderSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                textTitle2.setText(textTitle + sliderSize.getValue());
                sliderWin.setMaximum(sliderSize.getValue());
            }
        });

        modelPanel.add(textTitle1);
        modelPanel.add(textTitle2);
        modelPanel.add(sliderSize);

        return modelPanel;
    }

}
