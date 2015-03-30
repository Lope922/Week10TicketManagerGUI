import javax.activity.InvalidActivityException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Lope on 3/24/2015.
 */
public class TicketManager extends JFrame {


    private JPanel rootPanel; // JPanel is rootPanel. good practice for now. when i have other pop up windows
    // they will be labeled differently.

    private JTextField userName; // where user inputs their name

    private JTextField descriptionOfProblem; // a breif description of problem
    private JComboBox severityLevel; // combo dropdown box for severity of problem
    private JList list1; // list used to store information
    private JButton addTicketButton; // button to add items to list
    private JTextField dateTextFieldEntered; // user input box for date problem was recorded.

    private JSpinner spinner1; // not used anymore. was going to use for calandar date picker.
    //  private JSpinner spinner2;

    // use this list for the gui form
    DefaultListModel<ProblemTicket> problemTicketDefaultListModel;


    // setup the ticketmanager window layout and set its visibility to true.
    protected TicketManager() {
        super("Ticket Manager App");

        setContentPane(rootPanel);
        pack();
        setVisible(true);

        // this is requesting that the date be types in the mm/dd/yy format.
        DateFormat userDateInput = new SimpleDateFormat("MM/dd/yy"); //TODO CREATE A METHOD THAT CHECKS FOR PROPER INPUT

        // set the default action when closed to not consume resources.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the applicatin and resources when closing the window

        problemTicketDefaultListModel = new DefaultListModel<ProblemTicket>();
        // declaring list1 as a model that contains PROBLEM TICKETS
        list1.setModel(problemTicketDefaultListModel);


        // populate the combo box
        final int one = 1;
        final int two = 2;
        final int three = 3;
        final int four = 4;
        final int five = 5;

        severityLevel.addItem(one);
        severityLevel.addItem(two);
        severityLevel.addItem(three);
        severityLevel.addItem(four);
        severityLevel.addItem(five);


//public static String buildInfoFromGUI() { // don't know how to build a method to interpret info. ??? //todo




        // add the action listener that listens for when the button is clicked.
        // this code defines a class, method, and creates an object all in this itty bitty block.
        addTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Name = userName.getText(); // reporter name is the name entered in text box
                // get the rest of the arguments for the problem ticket.

                String issueDiscription = descriptionOfProblem.getText(); // description of problem textbox

                int severity = severityLevel.getSelectedIndex()+ 1; // rank of problem from combo box

                // get date time format entered in textbox for date
                String dateEntered = dateTextFieldEntered.getText(); // date from text box entered

                ProblemTicket userInput = new ProblemTicket (Name, issueDiscription,severity,dateEntered);

              //  list1.add(infoFromForm);
                problemTicketDefaultListModel.addElement(userInput);

//                try {
//                    // todo write this code
//                } catch (NullPointerException iae) {
//                    JOptionPane.showMessageDialog(TicketManager.this, "we are missing some information here !" + iae);
//                }
//
            }

// add a new ticket to the list and the array list.


        });


    }
}

