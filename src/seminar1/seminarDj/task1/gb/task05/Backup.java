package seminar1.seminarDj.task1.gb.task05;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Backup {
    private final String source;
    public Backup(String source) {
        this.source = source;
    }
    private final String backup = "./backup";

    /**
     * копирует файлы из текущей папки в папку "./backup"
     *
     */
    public void copy() throws IOException {
        File folder = new File(this.source);
        File file1 = new File(this.backup);
        if(!file1.exists())
        {
            Path path = Files.createDirectories(Paths.get(this.backup));
            System.out.printf("Директория %s создана\n", path.toString());
        }
        for (File file : folder.listFiles()) {
            if (file.isFile()) {
                Files.copy(Paths.get(file.getName()),
                        Paths.get(file1+"/"+file.getName()),
                        REPLACE_EXISTING);
                System.out.printf("File %s скопирован.\n", file.getName());
            }
        }
    }
}

