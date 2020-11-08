package design;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Топ 6 задачек по уровню сложности Хард
 * и топ 6 задачек в разделе линкед лист
 */
public class StreamExample {

    public static List<Task> getTopNTasksByLikes(List<Task> tasks, int n){
        tasks.stream()
                .sorted(Comparator.comparing(Task::getDifficulty))
                .filter(t -> t.getDifficulty().equals(Difficulty.HARD))
                .sorted(Comparator.comparing(Task::getTag))
                .filter(t -> t.getTag().equals(Tag.LINKED_LIST))
                .collect(Collectors.toList());
        return tasks;
    }
}
