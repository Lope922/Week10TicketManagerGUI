import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Lope on 3/24/2015.
 */
public class ProblemTicket {


    //problem ticket class needs to hold the issue , name of th person recorded it, date resolved , and date issued, as
    // well as severity of the ticket

    // Person who recorded the issue
    private String workerName;

    //description of the problem
    private String issueDicription;

    // severity level measured by number
    private int severity;

    // date it was entered
    private String dateEntered; // but in a date time format

    // date it was resolved;
    private DateFormat dateResolved;


    // Constructor for date time format
    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");

    // looking into a calendar with date time picker i realized that i needed to import a dateformat, calendar
    // as well as a couple other things.
    //http://www.mkyong.com/java/java-how-to-get-current-date-time-date-and-calender/


    // 2 different constructors to either add or remove a ticket
    // to enter a ticket
    public ProblemTicket(String workerName, String issueDicription, int severity, String dateEntered) {
        this.workerName = workerName; // i would like to set this equal to textbox with username
        this.issueDicription = issueDicription; // set this equal to text box of issue description.
        this.severity = severity; // combo dropdown box selected value.
        this.dateEntered = dateEntered; // set this equal to users entered date.
    }

    //to resolve a ticket
    public ProblemTicket(String workerName, String issueDicription, int severity, String dateEntered, DateFormat dateResolved) {
        this.workerName = workerName;
        this.issueDicription = issueDicription;
        this.severity = severity;
        this.dateEntered = dateEntered;
        this.dateResolved = dateResolved;
    }


    @Override
    public String toString() {

        return (" Reporter name: " + this.workerName + " Severity Of Problem: " + this.severity + " Problem Description: " + this.issueDicription +
                " Date called in : " + this.dateEntered);

    }
}