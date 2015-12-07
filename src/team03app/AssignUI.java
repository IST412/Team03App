package team03app;

import java.awt.event.*;
import javax.swing.*;

public class AssignUI extends JFrame implements ActionListener {

    private final JButton back, toDo, feedback, jUnit;
    private final JTextArea assignInfo = new JTextArea("");
    private final Assign assign;
    private final AssignCntl theAssignCntl;
    JPanel toDoPanel;

    public AssignUI(AssignCntl theAssignCntl) {
        this.theAssignCntl = theAssignCntl;
        this.assign = new Assign();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        //this.setResizable(false);
        //this.setLayout(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back = new JButton("< Back");
        back.setBounds(50, 500, 100, 50);
        back.addActionListener(this);
        this.add(back);
        
        feedback = new JButton("Feedback");
        feedback.setBounds(250, 500, 100, 50);
        feedback.addActionListener(this);
        this.add(feedback);
        
        jUnit = new JButton("JUnit Test");
        jUnit.setBounds(350, 500, 100, 50);
        jUnit.addActionListener(this);
        this.add(jUnit);
        
        for (String info : assign.assignments) {
            assignInfo.append(info + "\n");
        }
        assignInfo.setOpaque(false);
        //assignInfo.setBounds(250, 150, 350, 300);
        this.add(assignInfo); 
    }

    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals("< Back")) {
            theAssignCntl.hideAssignUI();
            theAssignCntl.theMainMenuCntl.showMain();
        }
       
    }}
  
