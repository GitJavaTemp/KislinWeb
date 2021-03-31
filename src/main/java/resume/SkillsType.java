package resume;

/**
 * Admin
 * 23.03.2021
 */
public enum SkillsType {
    ACHIEVEMENT("Достижения"),
    EDUCATION("Образование"),
    EXPERIENCE("Опыт работы"),
    OBJECTIVE("Позиция"),
    QALIFICATIONS("Квалификация");

    private String title;

    SkillsType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
