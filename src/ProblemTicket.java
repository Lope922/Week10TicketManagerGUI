import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Lope on 3/24/2015.
 */
public class ProblemTicket extends TicketManager {

    //problem ticket class needs to hold the issue , name of th person recorded it, date resolved , and date issued, as
    // well as severity of the ticket

    // Person who recorded the issue
    private String workerName;

    //description of the problem
    private String issueDicription;

    // severity level measured by number
    private int severity;

    // date it was entered
    private Date dateEntered;

    // date it was resolved;
    private Date dateResolved;


    // 2 different constructors to either add or remove a ticket
    // to enter a ticket
    public ProblemTicket(String workerName, String issueDicription, int severity, Date dateEntered) {
        this.workerName = workerName;
        this.issueDicription = issueDicription;
        this.severity = severity;
        this.dateEntered = dateEntered;
    }

    //to resolve a ticket
    public ProblemTicket(String workerName, String issueDicription, int severity, Date dateEntered, Date dateResolved) {
        this.workerName = workerName;
        this.issueDicription = issueDicription;
        this.severity = severity;
        this.dateEntered = dateEntered;
        this.dateResolved = dateResolved;
    }
// needs to be able to communicate with the ticket manager in order to get the info in textboxes. ?

    public String getWorkerName() {

        return workerName;
    }

    public String getIssueDicription() {
        return issueDicription;
    }

    public int getSeverity() {
        return severity;
    }

    public Date getDateEntered() {
        return dateEntered;
    }

    // store the problem tickets in an array List and also in a JList
//    public static ProblemTicket AddToBothLists() {


        ArrayList<ProblemTicket> problemTickets = new ArrayList<ProblemTicket>();

// get the necessary components to get the build the ticket item to add it to the list

// should recieve a username, description of the problem, severity level , and a date entered to be able to add it to the list
        // once it meets these requirements add that problem ticket to the list.
    }
