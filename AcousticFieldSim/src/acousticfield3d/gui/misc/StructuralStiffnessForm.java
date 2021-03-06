/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acousticfield3d.gui.misc;

import acousticfield3d.algorithms.CalcField;
import acousticfield3d.gui.MainForm;
import acousticfield3d.math.M;
import acousticfield3d.math.Vector3f;
import acousticfield3d.scene.MeshEntity;
import acousticfield3d.scene.Scene;
import acousticfield3d.utils.Parse;
import acousticfield3d.utils.TextFrame;
import java.util.ArrayList;

/**
 *
 * @author am14010
 */
public class StructuralStiffnessForm extends javax.swing.JFrame {
    final MainForm mf;
    
    public StructuralStiffnessForm(MainForm mf) {
        this.mf = mf;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nPointsText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        dispText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rotText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        scaleText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        stepsText = new javax.swing.JTextField();
        goSeriesExpsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("N Points:");

        nPointsText.setText("50");

        jButton1.setText("Calc");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Displacement:");

        dispText.setText("0 0 0");

        jLabel3.setText("Rotation (deg):");

        rotText.setText("0 0 0");

        jLabel4.setText("Scale(total dist):");

        scaleText.setText("0");
        scaleText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scaleTextActionPerformed(evt);
            }
        });

        jLabel5.setText("steps:");

        stepsText.setText("0,5,10");

        goSeriesExpsButton.setText("Go");
        goSeriesExpsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goSeriesExpsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nPointsText, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dispText)
                            .addComponent(rotText)
                            .addComponent(scaleText)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stepsText)
                        .addGap(18, 18, 18)
                        .addComponent(goSeriesExpsButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nPointsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dispText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rotText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(scaleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(stepsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goSeriesExpsButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        calcStiffnessSteps(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    protected String calcStiffnessSteps(boolean reportOnText) {
        final Vector3f disp = new Vector3f();
        final Vector3f rot = new Vector3f();
        final Vector3f scale = new Vector3f();
        
        int nPoints = parseIncrements(disp, rot, scale);
        
        final StringBuilder sb = new StringBuilder();
        
        //snap the position of the points
        if (reportOnText){
            mf.movePanel.snapParticlesPosition();
        }
        
        for (int i = 0; i < nPoints; i++) {
            moveIncParticles(disp, rot, scale);
            
            //calculate the amplitude before adding PI to the top array
            final float totalAmpSqr = calcTotalAmpSqr();
            
            //add PI to the top array and then calculate force and torque stiffness
            mf.simulation.addPiToTopTransducers();
            
            final Vector3f stiffness = new Vector3f();
            calcTotalStiffness(stiffness);
            
            //add PI again on top to return to the previous phases
            mf.simulation.addPiToTopTransducers();
            
            //report
            
            final float minDist = calcMinDistBetweenParticles();
            if (reportOnText)
                sb.append(i + "\t" + minDist + "\t" + stiffness.toStringSimple("\t") + "\t" + totalAmpSqr + "\n");
            else
                sb.append(stiffness.y + "\t");
        }
        
        //restore the position of the points and report
        if (reportOnText){
            mf.movePanel.resetParticlePos();
            TextFrame.showText("Stiffness forces and torque", sb.toString(), this);
        }
        
        return sb.toString();
    }

    
    protected void moveIncParticles(final Vector3f disp, final Vector3f rot, final Vector3f scale) {
        //move the particles, apply the algorithm
        if(! disp.isZero() ){ //move
            mf.movePanel.applyDisplacement(disp.x, disp.y, disp.z);
        }else if(! rot.isZero() ){ //rotate
            mf.movePanel.applyRotation(rot.x, rot.y, rot.z);
        }else{ //scale
            mf.movePanel.applyScale(scale.x);
        }
    }

    protected int parseIncrements(final Vector3f disp, final Vector3f rot, final Vector3f scale) {
        final int nPoints = Parse.toInt( nPointsText.getText() );
        final float dispStep = mf.movePanel.getDisplacementStep();
        final float rotStep = mf.movePanel.getRotationStep();
        disp.parse( dispText.getText() ).divideLocal( dispStep ).divideLocal( nPoints );
        rot.parse( rotText.getText() ).divideLocal( rotStep ).divideLocal( nPoints );
        final String scaleT = scaleText.getText();
        scale.x = Parse.toFloat( scaleT ) / dispStep / nPoints;
        return nPoints;
    }

    protected float calcTotalAmpSqr() {
        float totalAmpSqr = 0;
        for (MeshEntity point : mf.simulation.controlPoints) {
            final Vector3f pos = point.getTransform().getTranslation();
            final float amp = CalcField.calcFieldAt(pos, mf).length();
            totalAmpSqr += amp*amp;
        }
        return totalAmpSqr;
    }

    protected void calcTotalStiffness(final Vector3f totalStiffness) {
        for (MeshEntity point : mf.simulation.controlPoints) {
            final Vector3f pos = point.getTransform().getTranslation();
            
            //calc total stiffness
            final Vector3f forceGrad = CalcField.calcForceGradients(pos.x, pos.y, pos.z,
                    point.getTransform().getScale().maxComponent(), mf);
            totalStiffness.addLocal( forceGrad );
        }
        totalStiffness.negateLocal(); //the stiffness are easier to understand with the negated sign (possitve is converging forces, negative is divergent forces)
    }

    private void scaleTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scaleTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scaleTextActionPerformed

    private void goSeriesExpsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goSeriesExpsButtonActionPerformed
        final int[] steps = Parse.parseIntArray(stepsText.getText(),",");
        
        //get the initial movements
        final String dispM = dispText.getText();
        final String rotM = rotText.getText();
        final String scaleM = scaleText.getText();
        
        final Vector3f disp = new Vector3f();
        final Vector3f rot = new Vector3f();
        final Vector3f scale = new Vector3f();
        parseIncrements(disp, rot, scale);
        
        final StringBuilder sb = new StringBuilder();
        mf.movePanel.snapParticlesPosition();
        //move calcs
        applySteps(steps, dispM, rotM, scaleM, disp, rot, scale, sb, "move", true, "0 0 0");
        //rotZ
        applySteps(steps, dispM, rotM, scaleM, disp, rot, scale, sb, "rotZ", false, "0 0 360");
        //rotY
        applySteps(steps, dispM, rotM, scaleM, disp, rot, scale, sb, "rotY", false, "0 360 0");
        mf.movePanel.resetParticlePos();
        TextFrame.showText("results", sb.toString(), this);
    }//GEN-LAST:event_goSeriesExpsButtonActionPerformed

    protected void applySteps(final int[] steps, 
            final String dispM, final String rotM, final String scaleM, 
            final Vector3f disp, final Vector3f rot, final Vector3f scale, 
            final StringBuilder sb, final String header, final boolean move, final String rotString) {
        //apply all separations on move
        
        final float arrayWidth = Scene.calcSize(mf.simulation.transducers).x;
        for (int step : steps) {
            mf.movePanel.resetParticlePos();
            resetTextIncs(dispM, rotM, scaleM);

            for (int i = 0; i < step; i++) {
                moveIncParticles(disp, rot, scale);
            }

            //displace to the left
            if (move) {
                for (MeshEntity controlPoint : mf.simulation.controlPoints) {
                    controlPoint.getTransform().getTranslation().x -= arrayWidth / 2;
                }
            }

            //set the text accordingly
            if (move) {
                dispText.setText(arrayWidth + " 0 0");
            } else {
                dispText.setText("0 0 0");
            }
            rotText.setText(rotString);
            scaleText.setText("0");

            String res = calcStiffnessSteps(false);
            sb.append(header + "\t" + step + "\t" + res + "\n");
        }
    }

    protected void resetTextIncs(final String dispM, final String rotM, final String scaleM) {
        dispText.setText(dispM + "");
        rotText.setText(rotM + "");
        scaleText.setText(scaleM + "");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dispText;
    private javax.swing.JButton goSeriesExpsButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nPointsText;
    private javax.swing.JTextField rotText;
    private javax.swing.JTextField scaleText;
    private javax.swing.JTextField stepsText;
    // End of variables declaration//GEN-END:variables

    private float calcMinDistBetweenParticles() {
        final ArrayList<MeshEntity> points = mf.simulation.controlPoints;
        final int n = points.size();
        float minDist = Float.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            MeshEntity a = points.get(i);
            for (int j = i+1; j < n; j++) {
                MeshEntity b = points.get(j);
                minDist = M.min(minDist, a.distanceTo(b));
            }
        }
        return minDist;
    }
}
