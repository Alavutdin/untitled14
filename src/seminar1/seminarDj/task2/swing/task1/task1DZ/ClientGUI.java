package seminar1.seminarDj.task2.swing.task1.task1DZ;

import javax.swing.*;
import java.awt.*;

public class ClientGUI extends JFrame {
    private static final int WINDOW_HEIGHT = 500;
    private static final int WINDOW_WIDTH = 400;

    private final JTextArea log = new JTextArea();

    private final JPanel panelTop = new JPanel(new GridLayout(2,3));
    private final JTextField ifIPAddress =new JTextField("127.0.0.1");
    private final JTextField tfPort =new JTextField("8189");
    private final JTextField tfLogin =new JTextField("Nick Kik");
    private final JPasswordField tfPassword = new JPasswordField("123456");
    private final JButton btnLogin = new JButton("Login");

    private final JPanel panelBotom = new JPanel(new BorderLayout());
    private final JTextField tfMessage = new JTextField();
    private final JButton btnSend = new JButton("Send");

    ClientGUI(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        setTitle("Chat Client");

        panelTop.add(ifIPAddress);
        panelTop.add(tfPort);
        panelTop.add(tfLogin);
        panelTop.add(tfPassword);
        panelTop.add(btnLogin);
        add(panelTop,BorderLayout.NORTH);

        panelBotom.add(tfMessage,BorderLayout.CENTER);
        panelBotom.add(btnSend,BorderLayout.EAST);
        add(panelBotom,BorderLayout.SOUTH);

        log.setEditable(false);
        JScrollPane scrollLog = new JScrollPane(log);
        add(scrollLog);

        setVisible(true);

    }

    public static void main(String[] args) {
        new ClientGUI();
    }

}
