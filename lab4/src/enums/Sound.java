package enums;

public enum Sound {
    RINGING ("Звон"),
    STEPS ("Шаги"),
    SCREAMING ("Крик"),
    CREAK ("Скрип"),
    NOISE ("Шум"),
    WHISPER ("Шепот"),
    KNOCK("Стук");
    private String title;

    Sound(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return title;
    }
}

