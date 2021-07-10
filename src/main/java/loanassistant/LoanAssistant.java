
package loanassistant;

import java.awt.Color;
import java.awt.Dimension;
//import java.awt.Font;
//import java.awt.GridBagConstraints;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
//import javax.swing.BorderFactory;
        
public class LoanAssistant extends javax.swing.JFrame {
Color lightYellow = new Color(255, 255, 128);
boolean computePayment;
   
    public LoanAssistant() {
        initComponents();
        
        addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent evt)
{
exitForm(evt);
}

            private void exitForm(WindowEvent evt) {
                //throw new UnsupportedOperationException("Not supported yet.");
               System.exit(0);
            }
        });
        pack();
Dimension screenSize =
Toolkit.getDefaultToolkit().getScreenSize();
setBounds((int) (0.5 * (screenSize.width - getWidth())), (int) (0.5 * (screenSize.height
- getHeight())), getWidth(), getHeight());

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        balanceLabel = new javax.swing.JLabel();
        balanceTextField = new javax.swing.JTextField();
        monthsLabel = new javax.swing.JLabel();
        interestLabel = new javax.swing.JLabel();
        paymentLabel = new javax.swing.JLabel();
        interestTextField = new javax.swing.JTextField();
        monthsTextField = new javax.swing.JTextField();
        paymentTextField = new javax.swing.JTextField();
        computeButton = new javax.swing.JButton();
        newLoanButton = new javax.swing.JButton();
        monthsButton = new javax.swing.JButton();
        paymentButton = new javax.swing.JButton();
        analysisLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        analysisTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loan Assistant");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        balanceLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        balanceLabel.setText("Loan Balance");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(70, 129, 0, 0);
        getContentPane().add(balanceLabel, gridBagConstraints);

        balanceTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        balanceTextField.setMinimumSize(new java.awt.Dimension(100, 25));
        balanceTextField.setPreferredSize(new java.awt.Dimension(100, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(67, 10, 0, 0);
        getContentPane().add(balanceTextField, gridBagConstraints);

        monthsLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        monthsLabel.setText("Number of Payments");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 129, 0, 0);
        getContentPane().add(monthsLabel, gridBagConstraints);

        interestLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        interestLabel.setText("Interest Rate");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 129, 0, 0);
        getContentPane().add(interestLabel, gridBagConstraints);

        paymentLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        paymentLabel.setText("Monthly Payment");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 129, 0, 0);
        getContentPane().add(paymentLabel, gridBagConstraints);

        interestTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        interestTextField.setMinimumSize(new java.awt.Dimension(100, 25));
        interestTextField.setPreferredSize(new java.awt.Dimension(100, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 10, 0, 0);
        getContentPane().add(interestTextField, gridBagConstraints);

        monthsTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        monthsTextField.setMinimumSize(new java.awt.Dimension(100, 25));
        monthsTextField.setPreferredSize(new java.awt.Dimension(100, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        getContentPane().add(monthsTextField, gridBagConstraints);

        paymentTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        paymentTextField.setMinimumSize(new java.awt.Dimension(100, 25));
        paymentTextField.setPreferredSize(new java.awt.Dimension(100, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        getContentPane().add(paymentTextField, gridBagConstraints);

        computeButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        computeButton.setText("Compute Monthly Payment");
        computeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 163, 0, 0);
        getContentPane().add(computeButton, gridBagConstraints);

        newLoanButton.setText("New Loan Analysis");
        newLoanButton.setEnabled(false);
        newLoanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newLoanButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 196, 49, 0);
        getContentPane().add(newLoanButton, gridBagConstraints);

        monthsButton.setText("X");
        monthsButton.setFocusable(false);
        monthsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthsButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        getContentPane().add(monthsButton, gridBagConstraints);

        paymentButton.setText("X");
        paymentButton.setFocusable(false);
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        getContentPane().add(paymentButton, gridBagConstraints);

        analysisLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        analysisLabel.setText("Loan Analysis:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(65, 10, 0, 0);
        getContentPane().add(analysisLabel, gridBagConstraints);

        exitButton.setText("Exit");
        exitButton.setFocusable(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 49, 0);
        getContentPane().add(exitButton, gridBagConstraints);

        analysisTextArea.setEditable(false);
        analysisTextArea.setColumns(20);
        analysisTextArea.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        analysisTextArea.setRows(5);
        analysisTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        analysisTextArea.setMinimumSize(new java.awt.Dimension(130, 130));
        jScrollPane1.setViewportView(analysisTextArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 204;
        gridBagConstraints.ipady = 127;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(7, 10, 0, 158);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean validateDecimalNumber(JTextField tf)
{
// checks to see if text field contains
// valid decimal number with only digits and a single decimal point
String s = tf.getText().trim();
boolean hasDecimal = false;
boolean valid = true;
if (s.length() == 0)
{
valid = false;
}
else
{
for (int i = 0; i < s.length(); i++)
{
char c = s.charAt(i);
if (c >= '0' && c <= '9')
{
continue;
}
else if (c == '.' && !hasDecimal)
{
hasDecimal = true;
}
else
{
// invalid character found
valid = false;
}
}
}
tf.setText(s);
if (!valid)
{
tf.requestFocus();
}
return (valid);
}
    private void computeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeButtonActionPerformed
double balance, interest, payment;
int months;
double monthlyInterest, multiplier;
double loanBalance, finalPayment;
if (validateDecimalNumber(balanceTextField))
{
balance =
Double.valueOf(balanceTextField.getText()).doubleValue();
}
else
{
    JOptionPane.showConfirmDialog(null, "Invalid or empty Loan Balance entry.\nPlease correct.", "Balance Input Error", JOptionPane.DEFAULT_OPTION,
JOptionPane.INFORMATION_MESSAGE);
return;
}
if (validateDecimalNumber(interestTextField))
{
interest =
Double.valueOf(interestTextField.getText()).doubleValue();
}
else
{
    JOptionPane.showConfirmDialog(null, "Invalid or empty Interest Rate entry.\nPlease correct.", "Interest Input Error", JOptionPane.DEFAULT_OPTION,
JOptionPane.INFORMATION_MESSAGE);
return;
}
monthlyInterest = interest / 1200;
// Compute loan payment
 if(computePayment)
{
    if (validateDecimalNumber(monthsTextField))
{
months =
Integer.valueOf(monthsTextField.getText()).intValue();
}
else
{
    JOptionPane.showConfirmDialog(null, "Invalid or empty Number of Payments entry.\nPlease correct.", "Number of Payments Input Error",
JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
return;
}
if (interest == 0)
{
payment = balance / months;
}
else
{
multiplier = Math.pow(1 + monthlyInterest, months);
payment = balance * monthlyInterest * multiplier / (multiplier - 1);
}
paymentTextField.setText(new DecimalFormat("0.00").format(payment));
// TODO add your handling code here:
}
else
{
// Compute number of payments
    if (validateDecimalNumber(paymentTextField))
{
payment =
Double.valueOf(paymentTextField.getText()).doubleValue();
if (payment <= (balance * monthlyInterest + 1.0))
{
if (JOptionPane.showConfirmDialog(null, "Minimum payment must be $" +  new DecimalFormat("0.00").format((int)(balance * monthlyInterest + 1.0)) + "\n" + "Do you want to use the minimum payment?", "Input Error", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)
{
paymentTextField.setText(new DecimalFormat("0.00").format((int)
(balance * monthlyInterest + 1.0)));
payment =
Double.valueOf(paymentTextField.getText()).doubleValue();
}
else
{
paymentTextField.requestFocus();
return;
}
}
}
else
{
    JOptionPane.showConfirmDialog(null, "Invalid or empty Monthly Payment entry.\nPlease correct.", "Payment Input Error", JOptionPane.DEFAULT_OPTION,
JOptionPane.INFORMATION_MESSAGE);
return;
}
if (interest == 0)
{
months = (int)(balance / payment);
}
else
{
months = (int)((Math.log(payment) - Math.log(payment - balance * monthlyInterest))
/ Math.log(1 + monthlyInterest));
}
monthsTextField.setText(String.valueOf(months));
}
 // reset payment prior to analysis to fix at two decimals
payment =
Double.valueOf(paymentTextField.getText()).doubleValue();
// show analysis
analysisTextArea.setText("Loan Balance: $" + new
DecimalFormat("0.00").format(balance));
analysisTextArea.append ("\n" + "Interest Rate: " + new 
DecimalFormat("0.00").format(interest) + "%");
// process all but last payment
loanBalance = balance;
for (int paymentNumber = 1; paymentNumber <= months - 1; paymentNumber++)
{
loanBalance += loanBalance * monthlyInterest - payment;
}
// find final payment
finalPayment = loanBalance;
if (finalPayment > payment)
{
// apply one more payment
loanBalance += loanBalance * monthlyInterest - payment;
finalPayment = loanBalance;
months++;
monthsTextField.setText(String.valueOf(months));
}
analysisTextArea.append("\n\n" + String.valueOf(months - 1) + " Payments of $"+ new
DecimalFormat("0.00").format(payment));
analysisTextArea.append("\n" + "Final Payment of: $" + new
DecimalFormat("0.00").format(finalPayment));
analysisTextArea.append("\n" + "Total Payments: $" + new
DecimalFormat("0.00").format((months - 1) * payment + finalPayment));
analysisTextArea.append("\n" + "Interest Paid $" + new
DecimalFormat("0.00").format((months - 1) * payment + finalPayment - balance));
computeButton.setEnabled(false);
newLoanButton.setEnabled(true);
newLoanButton.requestFocus();
    }//GEN-LAST:event_computeButtonActionPerformed

    private void newLoanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newLoanButtonActionPerformed
        // TODO add your handling code here:
       
// clear computed value and analysis
if (computePayment)
{
paymentTextField.setText("");
}
else
{
monthsTextField.setText("");
}
analysisTextArea.setText("");
computeButton.setEnabled(true);
newLoanButton.setEnabled(false);
balanceTextField.requestFocus();

    }//GEN-LAST:event_newLoanButtonActionPerformed

    private void monthsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthsButtonActionPerformed
        // TODO add your handling code here:
        computePayment = false;
paymentButton.setVisible(true);
monthsButton.setVisible(false);
monthsTextField.setText("");
monthsTextField.setEditable(false);
monthsTextField.setBackground(lightYellow);
monthsTextField.setFocusable(false);
paymentTextField.setEditable(true);
paymentTextField.setBackground(Color.WHITE);
paymentTextField.setFocusable(true);
computeButton.setText("Compute Number of Payments");
balanceTextField.requestFocus();
    }//GEN-LAST:event_monthsButtonActionPerformed

    private void paymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentButtonActionPerformed
        // TODO add your handling code here:
        computePayment = true;
paymentButton.setVisible(false);
monthsButton.setVisible(true);
monthsTextField.setEditable(true);
monthsTextField.setBackground(Color.WHITE);
monthsTextField.setFocusable(true);
paymentTextField.setText("");
paymentTextField.setEditable(false);
paymentTextField.setBackground(lightYellow);
paymentTextField.setFocusable(false);
computeButton.setText("Compute Monthly Payment");
balanceTextField.requestFocus();
    }//GEN-LAST:event_paymentButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoanAssistant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel analysisLabel;
    private javax.swing.JTextArea analysisTextArea;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JTextField balanceTextField;
    private javax.swing.JButton computeButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel interestLabel;
    private javax.swing.JTextField interestTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton monthsButton;
    private javax.swing.JLabel monthsLabel;
    private javax.swing.JTextField monthsTextField;
    private javax.swing.JButton newLoanButton;
    private javax.swing.JButton paymentButton;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JTextField paymentTextField;
    // End of variables declaration//GEN-END:variables
}
