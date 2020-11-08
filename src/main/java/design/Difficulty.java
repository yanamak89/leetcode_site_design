package design;

public enum Difficulty {
    EASY("Easy"),
    MEDIUM("Medium"),
    HARD("Hard");

    private String difficultyName;

    Difficulty(String name) {
        this.difficultyName = difficultyName;
    }

    public String getDifficultyName() {
        return difficultyName;
    }
}
