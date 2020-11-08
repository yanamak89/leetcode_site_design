package design;


import java.util.List;

public class Discuss {
    private final String text;
    private final List<Comment> comment;

    public Discuss(String text, List<Comment> comment) {
        this.text = text;
        this.comment = comment;
    }

    public String getText() {
        return text;
    }

    public List<Comment> getComment() {
        return comment;
    }


}
