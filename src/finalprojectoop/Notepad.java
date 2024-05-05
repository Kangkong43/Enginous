/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package finalprojectoop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author user
 */
public class Notepad extends javax.swing.JInternalFrame {

    /**
     * Creates new form Notepad
     */
    public Notepad() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        New = new javax.swing.JMenuItem();
        Open = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cut = new javax.swing.JMenuItem();
        copy = new javax.swing.JMenuItem();
        paste = new javax.swing.JMenuItem();

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        fileMenu.setText("File");

        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        fileMenu.add(New);

        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        fileMenu.add(Open);

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        fileMenu.add(Save);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");
        editMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuActionPerformed(evt);
            }
        });

        cut.setText("Cut");
        cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutActionPerformed(evt);
            }
        });
        editMenu.add(cut);

        copy.setText("Copy");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        editMenu.add(copy);

        paste.setText("Paste");
        paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteActionPerformed(evt);
            }
        });
        editMenu.add(paste);

        jMenuBar1.add(editMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutActionPerformed
        
        //cut the slected text
        textArea.cut();
    }//GEN-LAST:event_cutActionPerformed

    private void editMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_editMenuActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
        // copy the selected tex
        
        textArea.copy();
    }//GEN-LAST:event_copyActionPerformed

    private void pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteActionPerformed
        // Paste the text
        textArea.paste();
    }//GEN-LAST:event_pasteActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

                      // Create an object of JFileChooser class with initial directory set to "f:"
JFileChooser chooseFile = new JFileChooser("f:");

// Invoke the showsSaveDialog function to display the save dialog and get user's response
int check = chooseFile.showSaveDialog(null);

// Check if the user selected a file to save
if (check == JFileChooser.APPROVE_OPTION) {
    // Get the selected file and its path
    File saveFile = new File(chooseFile.getSelectedFile().getAbsolutePath());

    try {
        // Create a FileWriter object to write to the selected file, overwrite existing content (false)
        FileWriter wr = new FileWriter(saveFile, false);

        // Create a BufferedWriter to write text efficiently
        BufferedWriter writer = new BufferedWriter(wr);

        // Write the text from the JTextArea to the file
        writer.write(textArea.getText());

        // Flush the buffer to ensure all data is written
        writer.flush();

        // Close the writer to release resources
        writer.close();
    } catch (Exception e) {
        // Display an error message if an exception occurs during file writing
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
} else {
    // Inform the user that they cancelled the operation if they didn't select a file
    JOptionPane.showMessageDialog(null, "The user cancelled the operation");
}

    }//GEN-LAST:event_SaveActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed

                        // Create an object of JFileChooser class with initial directory set to "f:"
			JFileChooser chooseFile = new JFileChooser("f:");

			//Invoke the showsSaveDialog function to display the save dialog and get user's response
			int check = chooseFile.showOpenDialog(null);

			// Check if the user selected a file to open
			if (check == JFileChooser.APPROVE_OPTION) {
				 // Get the selected file and its path
				File filePath = new File(chooseFile.getSelectedFile().getAbsolutePath());

				try {
					 // String to store file content
					String s1 = "", sl = "";

					// Create a FileReader to read from the selected file
					FileReader fileReader = new FileReader(filePath);

					 // Create a BufferedReader to efficiently read text from the FileReader
					BufferedReader reader = new BufferedReader(fileReader);

					// Read the first line of the file
					sl = reader.readLine();

					// Read subsequent lines 
					while ((s1 = reader.readLine()) != null) {
						sl = sl + "\n" + s1;
					}

					// Set the text of the JTextArea to the content of the file
					textArea.setText(sl);
				}
				catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
			// If the user cancelled the operation
			else
				JOptionPane.showMessageDialog(null, "the user cancelled the operation");
    }//GEN-LAST:event_OpenActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        // TODO add your handling code here:
        textArea.setText("");
    }//GEN-LAST:event_NewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem New;
    private javax.swing.JMenuItem Open;
    private javax.swing.JMenuItem Save;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem cut;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem paste;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
