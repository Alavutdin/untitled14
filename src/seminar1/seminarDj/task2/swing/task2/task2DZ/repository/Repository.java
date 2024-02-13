package seminar1.seminarDj.task2.swing.task2.task2DZ.repository;

public interface Repository<T> {
    void save(T message);
    T load();
}
