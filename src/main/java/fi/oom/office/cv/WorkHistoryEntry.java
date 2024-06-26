package fi.oom.office.cv;

import java.util.Date;

public record WorkHistoryEntry(Date from, Date to, String jobTitle, String company, String workDescription) {
    
}
