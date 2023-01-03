package enums;

public enum EmotionalCondition {
    FEAR ("Страх"),
    ANGER ("Гнев"),
    JOY ("Радость"),
    CALMNESS ("Спокойствие"),
    ANXIETY ("Беспокойство"),
    BOREDOM ("Скука"),
    EMBARRASSMENT ("Смущение"),
    DISGUST ("Отвращение"),
    ENVY ("Зависть"),
    EXCITEMENT ("Восхищение"),
    SADNESS ("Грусть");
    private String title;
    EmotionalCondition(String title){
        this.title = title;
    }
    @Override
    public String toString() {
        return title;
    }
}

