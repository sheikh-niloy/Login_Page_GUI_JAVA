import javax.swing.*;

import java.awt.*;

public class Login
{
    private JFrame  flogin;
    private JButton bLogin;
    private JButton bRegister;
    private JButton bExit;
    private JButton bReset;
    private JLabel  lUsername; 
    private JLabel  lPassword;
    private JLabel  lReset;
    private JLabel  tNotRegistered; 
    private JTextField tUsername; 
    private JPasswordField pPassword;
    private JCheckBox   cRemember;
    private JFrame Color;
 


    public Login()
    {   
        flogin = new JFrame("Login");     

        //allocate new memory for first Username/Email Label
        lUsername = new JLabel();
        lUsername.setText("Username/Email: ");
        lUsername.setBounds(50,100,150,30);     

        //allocate new memory for Password name Label
        lPassword = new JLabel();
        lPassword.setText("Password: ");
        lPassword.setBounds(50,150,150,30);

        //allocate new memory for Username TextField
        tUsername = new JTextField();
        tUsername.setBounds(200,100,150,30);

        //allocate new memory Password Field
        pPassword = new JPasswordField();
        pPassword.setBounds(200,150,150,30);

        //allocate new memory for Remember Me password checkbox
        cRemember = new JCheckBox();
        cRemember.setText("Remember Me");
        cRemember.setBounds(50,200,150,30);        

        //allocate new memory for login button
        bLogin = new JButton();
        bLogin.setText("Login");
        bLogin.setBounds(200,200,150,30); 

        //allocate new memory for Reset Label
        lReset = new JLabel();
        lReset.setText("Forgot Password?");
        lReset.setBounds(50,250,150,30);

        //allocate new memory for Reset button
        bReset = new JButton();
        bReset.setText("Reset Password");
        bReset.setBounds(200,250,150,30); 

        //allocate new memory for Not registered text
        tNotRegistered = new JLabel();
        tNotRegistered.setText("Not Registered? ");
        tNotRegistered.setBounds(50,300,150,30);    
        
        //allocate new memory for Register button
        bRegister = new JButton();
        bRegister.setText("Register");
        bRegister.setBounds(200,300,150,30);       
        
        //allocate new memory for Exit button
        bExit = new JButton();
        bExit.setText("Exit");
        bExit.setBounds(125,350,150,30);  

        Color color=new Color(0,122,204);

        //allocate new memory for background color
        // fBackground= new JFrame();
        // fBackground.setBackground(#1F1F1F);  
        

        flogin.add(lUsername); 
        flogin.add(lPassword); 
        flogin.add(tUsername); 
        flogin.add(pPassword); 
        flogin.add(cRemember); 
        flogin.add(bLogin);
        flogin.add(lReset);
        flogin.add(bReset);
        flogin.add(tNotRegistered); 
        flogin.add(bRegister); 
        flogin.add(bExit); 


        // flogin.getContentPane().setBackground(color);

        flogin.setLayout(new FlowLayout());


        flogin.setSize(450,500);
        flogin.setLayout(null);
        flogin.setVisible(true);
        flogin.setResizable(false); //prevent from resizing 

    }

}