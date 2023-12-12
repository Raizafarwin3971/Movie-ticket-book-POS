
package ScopeCinema;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class Ticket_purchase extends javax.swing.JFrame {

    DefaultTableModel dm;
    public Ticket_purchase() {
        initComponents();
        createColumns();
    }
    private void createColumns(){
        dm = (DefaultTableModel) purchaseTbl.getModel();
        dm.addColumn("cus name");
        dm.addColumn("movie");
        dm.addColumn("movie id");
        dm.addColumn("seat qty");
        dm.addColumn("per ticket");
        dm.addColumn("net ticket price");
        dm.addColumn("movie time");
        dm.addColumn("customer ID");
        dm.addColumn("discount");
        dm.addColumn("net ticket price");
        
    }
    SingletonDBconnection dbcon=SingletonDBconnection.getDBconnect();

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cusNameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        movieTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        movieIdTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        seatQtyTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ticketPriceTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cusIdTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        discountTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ticketWithDis = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        showdatetime = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        purchaseTbl = new javax.swing.JTable();
        perTicket = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        loyalcustomer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Ticket invoice");

        jLabel2.setText("customer name:");

        cusNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusNameTxtActionPerformed(evt);
            }
        });

        jLabel3.setText("movie:");

        jButton1.setText("print invoice");

        movieTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieTxtActionPerformed(evt);
            }
        });

        jLabel4.setText("movie ID:");

        movieIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieIdTxtActionPerformed(evt);
            }
        });

        jLabel5.setText("seat quantity");

        seatQtyTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatQtyTxtActionPerformed(evt);
            }
        });

        jLabel8.setText("net ticket price:");

        ticketPriceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketPriceTxtActionPerformed(evt);
            }
        });

        jLabel11.setText("customer ID:");

        cusIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusIdTxtActionPerformed(evt);
            }
        });

        jLabel12.setText("discount:");

        discountTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountTxtActionPerformed(evt);
            }
        });

        jLabel13.setText("ticket price after discount:");

        ticketWithDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketWithDisActionPerformed(evt);
            }
        });

        calculate.setText("calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        jLabel14.setText("show date and time:");

        showdatetime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10.00", "02.30", "18.00", "22.00" }));
        showdatetime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showdatetimeActionPerformed(evt);
            }
        });

        purchaseTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "customer name", "movie", "movie ID", "seat quantity", "per ticket price", "discount", "net ticket price", "customer ID"
            }
        ));
        jScrollPane1.setViewportView(purchaseTbl);

        perTicket.setText("LKR. 500");
        perTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perTicketActionPerformed(evt);
            }
        });

        jLabel15.setText("per ticket");

        loyalcustomer.setText("loyalty customer?");
        loyalcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loyalcustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(seatQtyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(discountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(127, 127, 127))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(movieTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cusNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(movieIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(showdatetime, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(ticketWithDis, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(perTicket, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ticketPriceTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                                            .addComponent(cusIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(loyalcustomer))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cusNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(movieTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(movieIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seatQtyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(perTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ticketPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(showdatetime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(45, 45, 45)
                        .addComponent(loyalcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cusIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(discountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ticketWithDis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(120, 120, 120)
                .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void movieTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieTxtActionPerformed
        
    }//GEN-LAST:event_movieTxtActionPerformed

    private void movieIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieIdTxtActionPerformed
        
    }//GEN-LAST:event_movieIdTxtActionPerformed

    private void seatQtyTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatQtyTxtActionPerformed
        
    }//GEN-LAST:event_seatQtyTxtActionPerformed

    private void ticketPriceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketPriceTxtActionPerformed
        
    }//GEN-LAST:event_ticketPriceTxtActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
     
        String cname=cusNameTxt.getText();
        String mv=movieTxt.getText();
        int seatQty=Integer.parseInt(seatQtyTxt.getText());
        double ticketamt=Double.parseDouble(ticketPriceTxt.getText());
        String showDateTime=(String) showdatetime.getSelectedItem();
        double netTicketamt=seatQty*500.00;
        
        ticketPriceTxt.setText(""+netTicketamt);
        
    }//GEN-LAST:event_calculateActionPerformed

    private void showdatetimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showdatetimeActionPerformed
        
    }//GEN-LAST:event_showdatetimeActionPerformed

    private void perTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perTicketActionPerformed
       
    }//GEN-LAST:event_perTicketActionPerformed

    private void loyalcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loyalcustomerActionPerformed
        if(loyalcustomer.isSelected()){
            cusIdTxt.setVisible(true);
            discountTxt.setVisible(true);
            ticketWithDis.setVisible(true);
            
            
            String cid=cusIdTxt.getText();
            try {
                Statement stmt=dbcon.createStatement();
                String selectQ=("SELECT * FROM cusregistration WHERE '"+cid+"'=customer_id );");
                ResultSet rs=stmt.executeQuery(selectQ);
                stmt.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(Ticket_purchase.class.getName()).log(Level.SEVERE, null, ex);
            }
            double ticketamt=Double.parseDouble(ticketPriceTxt.getText());
            double discount=ticketamt-50.00;
            String ticketwithdis=ticketWithDis.getText();
        }      
    }//GEN-LAST:event_loyalcustomerActionPerformed

    private void cusIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusIdTxtActionPerformed
        
    }//GEN-LAST:event_cusIdTxtActionPerformed

    private void discountTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountTxtActionPerformed

    private void ticketWithDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketWithDisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ticketWithDisActionPerformed

    private void cusNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusNameTxtActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticket_purchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculate;
    private javax.swing.JTextField cusIdTxt;
    private javax.swing.JTextField cusNameTxt;
    private javax.swing.JTextField discountTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loyalcustomer;
    private javax.swing.JTextField movieIdTxt;
    private javax.swing.JTextField movieTxt;
    private javax.swing.JTextField perTicket;
    private javax.swing.JTable purchaseTbl;
    private javax.swing.JTextField seatQtyTxt;
    private javax.swing.JComboBox<String> showdatetime;
    private javax.swing.JTextField ticketPriceTxt;
    private javax.swing.JTextField ticketWithDis;
    // End of variables declaration//GEN-END:variables

    
}
