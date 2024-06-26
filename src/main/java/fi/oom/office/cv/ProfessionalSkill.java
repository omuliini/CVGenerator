package fi.oom.office.cv;

public record ProfessionalSkill(Integer skillType, String skillName, Float experienceYears) {
    public static final Integer SKILLTYPE_TECH = 1;
    public static final Integer SKILLTYPE_EXPERTISE = 2;
}
