
import java.swing.JFrame;
import java.swing.JLabel;
import java.swing.JPanel;
import java.swing.JPasswordField;
import java.swing.JTextField;
import java.swing.JButton;
import java.sql*;




public class LOGIN extends javax.swing.JFrame {

   
    public LOGIN() {
        initComponents();
    }

                            
    private void initComponents() {

        fname = new javax.swing.JTextField();
        Name = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        dateofbirth = new javax.swing.JTextField();
        GenDer = new javax.swing.JTextField();
        bloodgrp = new javax.swing.JTextField();
        mob = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        Signup = new javax.swing.JButton();
        UserName = new javax.swing.JLabel();
        Dob = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        BloodGroup = new javax.swing.JLabel();
        MOB = new javax.swing.JLabel();
        ADDRess = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        emailaddress = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        pass_word = new javax.swing.JPasswordField();
        confirmPass = new javax.swing.JLabel();
        confirmpassword = new javax.swing.JPasswordField();
        titile = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(fname);
        fname.setBounds(240, 60, 150, 20);

        Name.setText("Name");
        getContentPane().add(Name);
        Name.setBounds(60, 60, 110, 20);
        getContentPane().add(username);
        username.setBounds(240, 90, 150, 20);
        getContentPane().add(dateofbirth);
        dateofbirth.setBounds(240, 120, 150, 20);
        getContentPane().add(GenDer);
        GenDer.setBounds(239, 150, 150, 20);
        getContentPane().add(bloodgrp);
        bloodgrp.setBounds(240, 180, 150, 20);

        mob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobActionPerformed(evt);
            }
        });
        getContentPane().add(mob);
        mob.setBounds(240, 210, 150, 20);

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address);
        address.setBounds(240, 240, 150, 20);

        Signup.setText("Sign Up");
        Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupActionPerformed(evt);
            }
        });
        getContentPane().add(Signup);
        Signup.setBounds(180, 420, 73, 25);

        UserName.setText("UserName");
        getContentPane().add(UserName);
        UserName.setBounds(60, 90, 150, 20);

        Dob.setText("Date Of Birth");
        getContentPane().add(Dob);
        Dob.setBounds(60, 120, 160, 20);

        Gender.setText("Gender");
        getContentPane().add(Gender);
        Gender.setBounds(59, 150, 170, 20);

        BloodGroup.setText("Blood Group");
        getContentPane().add(BloodGroup);
        BloodGroup.setBounds(60, 180, 150, 16);

        MOB.setText("Mobile No");
        getContentPane().add(MOB);
        MOB.setBounds(60, 210, 150, 16);

        ADDRess.setText("Address");
        getContentPane().add(ADDRess);
        ADDRess.setBounds(60, 240, 170, 20);

        Email.setText("Email");
        getContentPane().add(Email);
        Email.setBounds(60, 270, 160, 20);
        getContentPane().add(emailaddress);
        emailaddress.setBounds(240, 270, 150, 22);

        Password.setText("Password");
        getContentPane().add(Password);
        Password.setBounds(60, 310, 160, 20);
        getContentPane().add(pass_word);
        pass_word.setBounds(240, 310, 150, 22);

        confirmPass.setText("Confirm Password");
        getContentPane().add(confirmPass);
        confirmPass.setBounds(60, 350, 140, 16);
        getContentPane().add(confirmpassword);
        confirmpassword.setBounds(240, 350, 150, 22);

        titile.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        titile.setForeground(new java.awt.Color(5, 5, 5));
        titile.setText("Create Account");
        getContentPane().add(titile);
        titile.setBounds(140, 20, 170, 29);

        pack();
    }                       

    private void SignupActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String name=fname.getText();
	String user_name=username.getText();
	String dob=dateofbirth.getText();
	String gender=GenDer.getText();
	String blood=bloodgrp.getText();
	String mobile=mob.getText();
        String adress=address.getText();
        String email=emailaddress.getText();
        String password=pass_word.getText();
	try {
		Connection c=null;
		Class.forName("org.postgresql.Driver");
		c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample","postgres","Jithin123");
		String query="INSERT INTO registrationpage values('"+name+"','"+user_name+"','"+dob+"','"+gender+"','"+blood+"','"+mobile+"','"+adress+"','"+email+"','"+password+"')";
		Statement sta=c.createStatement();
		int x= sta.executeUpdate(query);
		if(x==0) {
			JOptionPane.showMessageDialog(send_req_button,"user already have an account");
		}else {
			JOptionPane.showMessageDialog(send_req_button,"Sucessfully registered");
		}
		c.close();
	}
	catch(Exception e1){
		e1.printStackTrace();
	}	
    }                                      

    private void mobActionPerformed(java.awt.event.ActionEvent evt) {                                    
        
    }                                   

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {                                        
       
    }                                       

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }


    private javax.swing.JLabel titile;                   
    private javax.swing.JLabel ADDRess;
    private javax.swing.JTextField address;
    private javax.swing.JLabel BloodGroup;
    private javax.swing.JTextField bloodgrp;
    private javax.swing.JLabel Dob;
    private javax.swing.JTextField dateofbirth;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField emailaddress;
    private javax.swing.JLabel Gender;
    private javax.swing.JTextField gender;
    private javax.swing.JLabel MOB;
    private javax.swing.JTextField mob;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton Signup;
    private javax.swing.JLabel UserName;
    private javax.swing.JTextField username;
    private javax.swing.JLabel confirmPass;
    private javax.swing.JPasswordField confirmpassword;
    
                      
}
