package seminar1.seminarDj.task2.swing.task2.task2DZ;

import seminar1.seminarDj.task2.swing.task2.task2DZ.client.ClientGUI;
import seminar1.seminarDj.task2.swing.task2.task2DZ.repository.FileRepository;
import seminar1.seminarDj.task2.swing.task2.task2DZ.repository.Repository;
import seminar1.seminarDj.task2.swing.task2.task2DZ.server.ServerWindow;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("hw from seminar one jdk");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Repository<String> repository = new FileRepository("messages.log");
                ServerWindow serverViewSwing = new ServerWindow(repository);
                new ClientGUI(serverViewSwing.getServer());
                new ClientGUI(serverViewSwing.getServer());
            }
        });
    }
}