/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ShellEnergy;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import model.Configuration;
import model.Energy.Location;
import model.Energy.RefuelingStation;

import java.util.ArrayList;

/**
 *
 * @author sahithi
 */
public class EnergyManageFuelStations extends javax.swing.JPanel {

    /**
     * Creates new form EnergyManageFuelStations
     */
    private JSplitPane jsp;
    int index =0 ;

    public EnergyManageFuelStations(JSplitPane jsp) {

        this.jsp = jsp;
        initComponents();
        populate();
        hideComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login1 = new javax.swing.JButton();
        Login2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        save = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        foodOptions2 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        state = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        zip = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        a1Field = new javax.swing.JTextField();
        ev = new javax.swing.JCheckBox();
        a2Field = new javax.swing.JTextField();
        restroom = new javax.swing.JCheckBox();
        city = new javax.swing.JTextField();
        carwash = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        View = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 254, 244));

        Login1.setBackground(new java.awt.Color(243, 216, 188));
        Login1.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        Login1.setForeground(new java.awt.Color(129, 108, 87));
        Login1.setText("<");
        Login1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login1ActionPerformed(evt);
            }
        });

        Login2.setBackground(new java.awt.Color(243, 216, 188));
        Login2.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        Login2.setForeground(new java.awt.Color(129, 108, 87));
        Login2.setText("Create New");
        Login2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Login2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel3.setText("Select Fuel Stations: ");

        jComboBox1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        save.setBackground(new java.awt.Color(243, 216, 188));
        save.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        save.setForeground(new java.awt.Color(129, 108, 87));
        save.setText("Save");
        save.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(243, 216, 188));
        edit.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        edit.setForeground(new java.awt.Color(129, 108, 87));
        edit.setText("Edit");
        edit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        foodOptions2.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        foodOptions2.setText("Food Options");
        foodOptions2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodOptions2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel2.setText("Address Line 1");

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel4.setText("Address Line 2");

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel5.setText("City");

        state.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel6.setText("State");

        zip.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

        nameField.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel7.setText("Zip");

        a1Field.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

        ev.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        ev.setText("EV Charging");
        ev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evActionPerformed(evt);
            }
        });

        a2Field.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

        restroom.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        restroom.setText("Restrooms");
        restroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restroomActionPerformed(evt);
            }
        });

        city.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

        carwash.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        carwash.setText("Car Wash");

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel1.setText("Name");

        View.setBackground(new java.awt.Color(243, 216, 188));
        View.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        View.setForeground(new java.awt.Color(129, 108, 87));
        View.setText("View");
        View.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 0, 36)); // NOI18N
        jLabel8.setText("Manage Fuel Stations");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Login1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameField)
                            .addComponent(a1Field)
                            .addComponent(zip)
                            .addComponent(foodOptions2)
                            .addComponent(carwash)
                            .addComponent(ev)
                            .addComponent(restroom)
                            .addComponent(state)
                            .addComponent(city)
                            .addComponent(a2Field)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(206, 206, 206))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Login2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(edit)
                        .addGap(18, 18, 18)
                        .addComponent(save))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Login1)
                                .addGap(112, 112, 112))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Login2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(View))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(47, 47, 47)
                .addComponent(ev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restroom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carwash)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodOptions2)
                .addGap(118, 118, 118))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login1ActionPerformed
        // TODO add your handling code here:
        EnergyAdmin ea = new EnergyAdmin(jsp);
        jsp.setRightComponent(ea);
    }//GEN-LAST:event_Login1ActionPerformed

    private void Login2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login2ActionPerformed
        // TODO add your handling code here:
        CreateNewEnergyStations ces = new CreateNewEnergyStations(jsp);
        jsp.setRightComponent(ces);
    }//GEN-LAST:event_Login2ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        enableEdit(false);
        populate();
        JOptionPane.showMessageDialog(this, "Fuel Station Updated");
        RefuelingStation rs = Configuration.getRefuelingNetwork().getRefuelingStations().get(index);
        rs.setName(nameField.getText());
        rs.setRestroomAvailable(restroom.isSelected());
        rs.setEvChargingAvailable(ev.isSelected());
        rs.setCarWashAvailable(carwash.isSelected());
        if(foodOptions2.isSelected()){
            ArrayList<String> foodOptions = new ArrayList<String>();
            foodOptions.add("Snacks");
            rs.setFoodOptions(foodOptions);
        } else{
            rs.setFoodOptions(new ArrayList<>());
        }
        Location location = new Location(a1Field.getText(), a2Field.getText(), city.getText(), state.getText(), zip.getText());
        rs.setLocation(location);
    }//GEN-LAST:event_saveActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        enableEdit(true);
        
    }//GEN-LAST:event_editActionPerformed

    private void foodOptions2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodOptions2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodOptions2ActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void restroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restroomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restroomActionPerformed

    private void evActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_evActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        // TODO add your handling code here:
        if (jComboBox1.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(this, "Please select a station to view.");
        } else {
            System.out.println("Selected an Option: " + jComboBox1.getSelectedIndex());
            index = jComboBox1.getSelectedIndex()-1;
            RefuelingStation rs = Configuration.getRefuelingNetwork().getRefuelingStations().get(jComboBox1.getSelectedIndex()-1);
            populate(rs);
        }
    }//GEN-LAST:event_ViewActionPerformed

    private void populate(RefuelingStation rs) {
        System.out.println("Populating");
        showComponents();
        nameField.setText(rs.getName());
        a1Field.setText(rs.getLocation().getAddressLine1());
        a2Field.setText(rs.getLocation().getAddressLine2());
        city.setText(rs.getLocation().getCity());
        state.setText(rs.getLocation().getState());
        zip.setText(rs.getLocation().getZipCode());
        ev.setSelected(rs.isEvChargingAvailable());
        carwash.setSelected(rs.isCarWashAvailable());
        restroom.setSelected(rs.isRestroomAvailable());
        foodOptions2.setSelected(rs.getFoodOptions().size()!=0);
        
    }

    private void populate() {
        jComboBox1.removeAllItems();
        jComboBox1.addItem("Select");
        for (RefuelingStation rs : Configuration.getRefuelingNetwork().getRefuelingStations()) {
            jComboBox1.addItem(rs.getLocation().getCity());
        }
        enableEdit(false);
    }
        private void hideComponents(){
        nameField.hide();
         jLabel1.hide();
         jLabel2.hide();
            jLabel4.hide();
            jLabel5.hide();
            jLabel6.hide();
            jLabel7.hide();
            a1Field.hide();
            a2Field.hide();
            carwash.hide();
            city.hide();
            state.hide();
            zip.hide();
            ev.hide();
            restroom.hide();
            carwash.hide();
            foodOptions2.hide();
            edit.hide();
            save.hide();
    }
    private void showComponents(){
        nameField.show();
         jLabel1.show();
         jLabel2.show();
            jLabel4.show();
            jLabel5.show();
            jLabel6.show();
            jLabel7.show();
            a1Field.show();
            a2Field.show();
            carwash.show();
            city.show();
            zip.show();
            ev.show();
            state.show();
            restroom.show();
            carwash.show();
            foodOptions2.show();
            edit.show();
            save.show();

    }
    private void enableEdit(boolean value){
        nameField.setEditable(value);
        a1Field.setEditable(value);
        a2Field.setEditable(value);
        city.setEditable(value);
        state.setEditable(value);
        zip.setEditable(value);
        ev.setEnabled(value);
        carwash.setEnabled(value);
        restroom.setEnabled(value);
        foodOptions2.setEnabled(value);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login1;
    private javax.swing.JButton Login2;
    private javax.swing.JButton View;
    private javax.swing.JTextField a1Field;
    private javax.swing.JTextField a2Field;
    private javax.swing.JCheckBox carwash;
    private javax.swing.JTextField city;
    private javax.swing.JButton edit;
    private javax.swing.JCheckBox ev;
    private javax.swing.JCheckBox foodOptions2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nameField;
    private javax.swing.JCheckBox restroom;
    private javax.swing.JButton save;
    private javax.swing.JTextField state;
    private javax.swing.JTextField zip;
    // End of variables declaration//GEN-END:variables
}
