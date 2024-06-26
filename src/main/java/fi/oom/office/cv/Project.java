package fi.oom.office.cv;

import java.util.Date;

public record Project(Date from, Date to, String projectDescription, String role, String accomplishments) {
    
}
