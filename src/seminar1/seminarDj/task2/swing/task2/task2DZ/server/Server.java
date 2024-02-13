package seminar1.seminarDj.task2.swing.task2.task2DZ.server;

import seminar1.seminarDj.task2.swing.task2.task2DZ.client.Client;
import seminar1.seminarDj.task2.swing.task2.task2DZ.exceptions.LoginTakenException;
import seminar1.seminarDj.task2.swing.task2.task2DZ.repository.Repository;

import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.time.LocalDateTime;
import java.util.Map;

public class Server {
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ");
    private final Map<String, Client> authorizedUsers;
    private boolean isServerWorking;
    private final ServerView view;
    private final Repository<String> repository;

    public Server(Server view, Repository<String> repository) {
        this.repository = repository;
        authorizedUsers = new HashMap<>();
        this.view = view;
        isServerWorking = false;
    }

    public boolean getServerStatus() {
        return isServerWorking;
    }

    public DateTimeFormatter getDateTimeFormatter() {
        return dateTimeFormatter;
    }

    public void setServerStatus(boolean status) {
        isServerWorking = status;
    }
    public boolean authorize(Client client, String login, int passwordHash) throws LoginTakenException {
        if (isServerWorking) {
            if (authorizedUsers.containsKey(login)) {
                throw new LoginTakenException(login + " is already taken, try another name ");
            }
            authorizedUsers.put(login, client);
            view.showInfoMessage(LocalDateTime.now().format(dateTimeFormatter) + login + " connected\n");
            return true;
        }
        return false;
    }

    public void receiveMessage(String login, String message) {
        if (authorizedUsers.containsKey(login)) {
            updateMessages(LocalDateTime.now().format(dateTimeFormatter) + login + ": " + message + "\n");
        }
    }

    private void updateMessages(String message) {
        view.showInfoMessage(message);
        saveMessage(message);
        for (Client client : authorizedUsers.values()) {
            client.receiveMessageFromServer(message);
        }
    }

    void disconnectUsers() {
        for (String clientName : authorizedUsers.keySet()) {
            authorizedUsers.get(clientName).disconnect();
            view.showInfoMessage(LocalDateTime.now().format(dateTimeFormatter) + clientName + " disconnected from server.\n");
        }
        authorizedUsers.clear();
    }

    public String loadMessages() {
        return repository.load();
    }

    private void saveMessage(String userMessages) {
        repository.save(userMessages);
    }

}
