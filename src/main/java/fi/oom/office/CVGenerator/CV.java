package fi.oom.office.CVGenerator;

import java.util.TreeMap;

import fi.oom.office.cv.*;

public class CV {
    private String firstName;
    private String lastName;
    private String jobTitle;
    private String introductionText;
    private String phoneNumber;
    private String emailAddress;
    private String personalQuote;
    private TreeMap<Education,Integer> educations;
    private TreeMap<LanguageSkill,Integer> languageSkills;
    private TreeMap<ProfessionalSkill,Integer> professionalSkills;
    private TreeMap<WorkHistoryEntry,Integer> workHistory;
    private TreeMap<Project,Integer> selectedProjects;

    public CV() {
        // ...
    }
}
