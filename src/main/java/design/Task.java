package design;

import java.util.List;


public class Task {
    private final String title;
    private final List<Discuss> discusses;
    private final int likes;
    private final int dislikes;
    private final Difficulty difficulty;
    private final Tag tag;

    public Task(String title, List<Discuss> discusses,
                int likes, int dislikes, Difficulty difficulty,
                Tag tag) {
        this.title = title;
        this.discusses = discusses;
        this.likes = likes;
        this.dislikes = dislikes;
        this.difficulty = difficulty;
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public List<Discuss> getDiscusses() {
        return discusses;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public Tag getTag() {
        return tag;
    }
}
