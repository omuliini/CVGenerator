package fi.oom.office.cv;

public record LanguageSkill(String language, Integer level) {
    public static final Integer NOVICE = 1;
    public static final Integer GOOD = 2;
    public static final Integer EXCELLENT = 3;
    public static final Integer NATIVE = 4;
}
