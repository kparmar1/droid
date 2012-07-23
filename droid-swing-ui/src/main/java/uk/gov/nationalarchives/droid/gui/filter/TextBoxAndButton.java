/**
 * Copyright (c) 2012, The National Archives <pronom@nationalarchives.gsi.gov.uk>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following
 * conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 *  * Neither the name of the The National Archives nor the
 *    names of its contributors may be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package uk.gov.nationalarchives.droid.gui.filter;

import java.awt.Color;
import java.awt.Dialog;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;

import uk.gov.nationalarchives.droid.gui.filter.domain.GenericMetadata;
import uk.gov.nationalarchives.droid.profile.FilterCriterionImpl;

/**
 * @author Alok Kumar Dash
 */
public class TextBoxAndButton extends javax.swing.JPanel {

    /** */
    private static final long serialVersionUID = -1248240900794717169L;
    private Dialog parent;
    private GenericMetadata metadata;
    private FilterCriterionImpl filterCriteria;

    /**
     * Creates new form TextBoxAndButton.
     * 
     * @param parent
     *            the parent dialog
     */
    public TextBoxAndButton(Dialog parent) {
        this.parent = parent;
        initComponents();
        jButtonShowValues.setText("..."); // NOI18N
    }

    /**
     * FIXME: javadoc.
     * 
     * @param genericMetadata
     *            FIXME: javadoc
     * @param criteria
     *            FIXME: javadoc
     */
    public void setType(GenericMetadata genericMetadata,
            FilterCriterionImpl criteria) {
        this.metadata = genericMetadata;
        this.filterCriteria = criteria;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtextValues = new javax.swing.JTextField();
        jButtonShowValues = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jtextValues.setText(org.openide.util.NbBundle.getMessage(TextBoxAndButton.class, "TextBoxAndButton.jtextValues.text")); // NOI18N
        jtextValues.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtextValues.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButtonShowValues.setText(org.openide.util.NbBundle.getMessage(TextBoxAndButton.class, "TextBoxAndButton.jButtonShowValues.text")); // NOI18N
        jButtonShowValues.setIconTextGap(0);
        jButtonShowValues.setInheritsPopupMenu(true);
        jButtonShowValues.setPreferredSize(new java.awt.Dimension(259, 32));
        jButtonShowValues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowValuesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jtextValues, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonShowValues, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jtextValues, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addComponent(jButtonShowValues, javax.swing.GroupLayout.PREFERRED_SIZE, 21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonShowValuesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonShowValuesActionPerformed

        ValuesDialog dialog = new ValuesDialog(parent, true, metadata,
                filterCriteria);
        dialog.setTitle(metadata.getMetadataName().getName());
        
        dialog.setVisible(true);
        jtextValues.setText(dialog.getSelectedString());

    }// GEN-LAST:event_jButtonShowValuesActionPerformed

    /**
     * @return FIXME: javadoc
     */
    public JButton getButton() {
        return jButtonShowValues;
    }

    /**
     * 
     * @return FIXME: javadoc
     */
    public JTextField getTextField() {
        return jtextValues;
    }

    /**
     * 
     * FIXME: javadoc.
     */
    public void hide() {

        jButtonShowValues.hide();
        jtextValues.hide();

    }

    /**
     * 
     * FIXME: javadoc.
     */
    public void show() {
        jButtonShowValues.show();
        jtextValues.show();
    }

    /**
     * 
     * FIXME: javadoc.
     */
    public void paintRedBoxToComponents() {
        jtextValues.setBorder(BorderFactory.createLineBorder(Color.red));
        repaint();
    }

    /**
     * 
     * FIXME: javadoc.
     */
    public void clearRedBoxToComponents() {
        jtextValues.setBorder(null);

        repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonShowValues;
    private javax.swing.JTextField jtextValues;
    // End of variables declaration//GEN-END:variables

}
