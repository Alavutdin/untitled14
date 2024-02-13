package seminar1.seminarDj.task2.swing.task2.task2DZ.server;

import seminar1.seminarDj.task2.swing.task2.task2DZ.client.ClientGUI;
import seminar1.seminarDj.task2.swing.task2.task2DZ.repository.Repository;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.StringWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ServerWindow extends JFrame implements ServerView{
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    private final JButton buttonStart = new JButton("start");
    private final JButton buttonStop = new JButton("stop");
    private final JTextArea informationMessages = new JTextArea();
    private ChatServer server;

    public ServerWindow(Repository<String> repository) {
        server = new Server(this, repository);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);

        setTitle("Chat server");

        addPanels();
        addListeners();

        setVisible(true);
    }

    private void addPanels() {
        JPanel buttonsPanel = new JPanel(new GridLayout(1, 2));
        buttonsPanel.add(buttonStart);
        buttonsPanel.add(buttonStop);
        add(buttonsPanel, BorderLayout.SOUTH);
        informationMessages.setEditable(false);
        add(new JScrollPane(informationMessages), BorderLayout.CENTER);
    }

    private void addListeners() {
        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Server.getServerStatus()) {
                    informationMessages.append(dateTimeWrapper("server already working"));
                } else {
                    server.setServerStatus(true);
                    informationMessages.append(dateTimeWrapper("server started"));
                }
            }
        });

        buttonStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (server.getServerStatus()) {
                    server.setServerStatus(false);
                    server.disconnectUsers();
                    informationMessages.append(dateTimeWrapper("server stopped"));
                } else {
                    informationMessages.append(dateTimeWrapper("server not working"));
                }
            }
        });
    }

    public Server getServer() {
        return server;
    }
    @Override
    public void showInfoMessage(String message) {
        informationMessages.append(message);
    }

    private String dateTimeWrapper(String message){
        return LocalDateTime.now().format(server.getDateTimeFormatter()) + message + "\n";
    }
}
