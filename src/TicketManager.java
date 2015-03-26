import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by Lope on 3/24/2015.
 */
public class TicketManager extends JFrame {

    private JPanel rootPanel; // JPanel is rootPanel. good practice for now. when i have other pop up windows
    // they will be labeled differently.

    private JTextField userName; // where user inputs the

    private JTextField descriptionOfProblem;
    private JComboBox severityLevel; //todo create an enum value to store in severity level
    private JList list1;
    private JButton addTicketButton;
    private JSpinner spinner1;
    private JSpinner spinner2;
public enum severityNumbers {one,two,three,four,five}

    // setup the ticketmanager window layout and set its visibility to true.
    protected TicketManager() {
        super("Ticket Manager App");
        setContentPane(rootPanel);
        pack();
        setVisible(true);

        // will need access to Problem Ticket ?
    ProblemTicket problemTicket;


        // add the action listener that listens for when the button is called.
        // this code defines a class, method, and creates an object all in this itty bitty block.
        addTicketButton.addActionListener(new ActionListener() {

// add a new ticket to the list and the array list.


        });


    }
}

//todo map the buttons to commands

//todo Create a new main class to run this code.

//todo add a quit button


