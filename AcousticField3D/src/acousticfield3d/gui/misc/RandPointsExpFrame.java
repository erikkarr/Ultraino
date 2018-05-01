/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acousticfield3d.gui.misc;

import acousticfield3d.algorithms.CalcField;
import acousticfield3d.algorithms.SimplePhaseAlgorithms;
import acousticfield3d.gui.MainForm;
import acousticfield3d.math.M;
import acousticfield3d.math.Transform;
import acousticfield3d.math.Vector3f;
import acousticfield3d.simulation.ControlPoint;
import acousticfield3d.simulation.Transducer;
import acousticfield3d.utils.FileUtils;
import acousticfield3d.utils.Parse;
import acousticfield3d.utils.TimerUtil;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author am14010
 */
public class RandPointsExpFrame extends javax.swing.JFrame {
    final MainForm mf;
    final Transform workingVolume = new Transform();
    
    float[][][] pointsToUse = null;
    
    public RandPointsExpFrame(final MainForm mf) {
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
        repetitionsText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        numPointsText = new javax.swing.JTextField();
        goButton = new javax.swing.JButton();
        copyCubeButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        minDistText = new javax.swing.JTextField();
        generatePointsButton = new javax.swing.JButton();
        auxButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        minDistZText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        selectButton = new javax.swing.JButton();
        fileText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        simpleForcesButton = new javax.swing.JButton();
        generateTestPointsButton = new javax.swing.JButton();
        simpleForcesToCSVButton = new javax.swing.JButton();
        spatialResVsFocusButton = new javax.swing.JButton();
        simpleForcesGenPoints = new javax.swing.JCheckBox();
        simpleForcesToCSVButton1 = new javax.swing.JButton();
        simpleForcesToCSVButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Random points experiments");

        jLabel1.setText("Repetitions:");

        repetitionsText.setText("10000");

        jLabel2.setText("nPoints");

        numPointsText.setText("1");

        goButton.setText("Go");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        copyCubeButton.setText("Set working vol");
        copyCubeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyCubeButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Min dist:");

        minDistText.setText("0.01");

        generatePointsButton.setText("Generate Points");
        generatePointsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePointsButtonActionPerformed(evt);
            }
        });

        auxButton.setText("Set of exp");
        auxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auxButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Min distZ:");

        minDistZText.setText("0.04");

        jLabel5.setText("File:");

        selectButton.setText("Select");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        jButton1.setText("BFGS vs HOLO Pressure");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("BFGS vs HOLO Forces");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        simpleForcesButton.setText("Simple Forces");
        simpleForcesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpleForcesButtonActionPerformed(evt);
            }
        });

        generateTestPointsButton.setText("GenerateTestPoints");
        generateTestPointsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateTestPointsButtonActionPerformed(evt);
            }
        });

        simpleForcesToCSVButton.setText("SimpleForcesToCSV");
        simpleForcesToCSVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpleForcesToCSVButtonActionPerformed(evt);
            }
        });

        spatialResVsFocusButton.setText("Spatial res vs focus");
        spatialResVsFocusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spatialResVsFocusButtonActionPerformed(evt);
            }
        });

        simpleForcesGenPoints.setText("genPoints");

        simpleForcesToCSVButton1.setText("TmpX");
        simpleForcesToCSVButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpleForcesToCSVButton1ActionPerformed(evt);
            }
        });

        simpleForcesToCSVButton2.setText("TmpY");
        simpleForcesToCSVButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpleForcesToCSVButton2ActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(repetitionsText, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numPointsText, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(copyCubeButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minDistText, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minDistZText))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fileText)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectButton)
                                .addGap(18, 18, 18)
                                .addComponent(auxButton))
                            .addComponent(generatePointsButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(goButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(simpleForcesButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(generateTestPointsButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(simpleForcesToCSVButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(simpleForcesGenPoints))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spatialResVsFocusButton)
                                .addGap(18, 18, 18)
                                .addComponent(simpleForcesToCSVButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(simpleForcesToCSVButton2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(repetitionsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(numPointsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copyCubeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(minDistText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(minDistZText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(generatePointsButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(9, 9, 9)
                .addComponent(goButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(auxButton)
                        .addComponent(selectButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(fileText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(simpleForcesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateTestPointsButton)
                    .addComponent(simpleForcesToCSVButton)
                    .addComponent(simpleForcesGenPoints))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spatialResVsFocusButton)
                    .addComponent(simpleForcesToCSVButton1)
                    .addComponent(simpleForcesToCSVButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void copyCubeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyCubeButtonActionPerformed
        workingVolume.set( mf.scene.getCubeHelper().getTransform());
    }//GEN-LAST:event_copyCubeButtonActionPerformed

    
    private float[][][] generatePoints(){
        final int repetitions = Parse.toInt( repetitionsText.getText() );
        final int nPoints = Parse.toInt( numPointsText.getText() );
        final float minDist = Parse.toFloat(minDistText.getText() );
        final float minZDist = Parse.toFloat(minDistZText.getText() );
        
        final float[][][] pointSet = new float[repetitions][nPoints][3];
        
        for(int i = 0; i < repetitions; ++i){
            selectPoints(pointSet[i], minDist, minZDist);
        }
        
        return pointSet;
    }
    
    private void generatePointsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePointsButtonActionPerformed
        final float[][][] pointSet = generatePoints();
       
        try {
            FileUtils.writeObject(new File("pointsTmp.xml"), pointSet);
        } catch (IOException ex) {
            Logger.getLogger(RandPointsExpFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_generatePointsButtonActionPerformed

    private void auxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auxButtonActionPerformed
        File f = new File("pointsTmp.xml");
        final String filePath = fileText.getText();
        if(! filePath.isEmpty()){
            f = new File(filePath);
        }
        try {
            pointsToUse = (float[][][]) FileUtils.readObject(f);
        } catch (IOException ex) {
            Logger.getLogger(RandPointsExpFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("********** Starting experiment " + f.getName());
     
        final int[] stepsGorkov = {10, 50, 100, 150, 250, 500, 1000, 2000, 3000};
        //final int[] stepsLap = {10, 50, 100, 150, 250, 500, 1000, 2000, 3000};
       
        for( int i : stepsGorkov){
            runExperiment(i, 3);
        }
   /*
        for( int i : stepsLap){
            runExperiment(i, 4);
        }
        */   
    }//GEN-LAST:event_auxButtonActionPerformed

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        calcExperiments(null, true);
    }//GEN-LAST:event_goButtonActionPerformed

    private void calcExperiments(final String fileName, final boolean reportText){
        final boolean needToGeneratePoints = (pointsToUse == null);
        if (needToGeneratePoints){
            pointsToUse = generatePoints();
        }
        
        FileWriter fw = null;
        if (fileName != null){
            try {
                fw = new FileWriter(new File(fileName));
            } catch (IOException ex) {
                fw = null;
                Logger.getLogger(RandPointsExpFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        final int repetitions = pointsToUse.length;
        final int nPoints = pointsToUse[0].length;
        
        //init variables: sum, squareSum, max
        final Vector3f pressure = new Vector3f(0,0,-Float.MAX_VALUE);
        final Vector3f pressureDiff = new Vector3f(0,0,-Float.MAX_VALUE);
        final Vector3f trapX = new Vector3f(0,0,-Float.MAX_VALUE);
        final Vector3f trapY = new Vector3f(0,0,-Float.MAX_VALUE);
        final Vector3f trapZ = new Vector3f(0,0,-Float.MAX_VALUE);

        final Vector3f pressureDiffTmp = new Vector3f();
        
        final float particleR = mf.scene.getParticleRadious();

        //create the points
        final ControlPoint[] cPoints = new ControlPoint[nPoints];
        mf.clearSelection();
        for(int i = 0; i < nPoints; ++i){
            final ControlPoint cp = new ControlPoint();
            cPoints[i] = cp;
            mf.selection.add(cp);
        }
        
        try {
            TimerUtil.get().tick("Seconds");
            for (int i = 0; i < repetitions; ++i) {
                final float[][] pointSet = pointsToUse[i];

                //place the control points
                for (int j = 0; j < nPoints; ++j) {
                    final float[] point = pointSet[j];
                    cPoints[j].getTransform().getTranslation().set(point[0], point[1], point[2]);
                }

                //clear the phases
                resetTransducers();

                //run algorithm
                mf.algForm.runBFGS(false, false, false);

                //take measurements
                pressureDiffTmp.set(0, 0, -Float.MAX_VALUE);
                for (int j = 0; j < nPoints; ++j) {
                    final Vector3f p = cPoints[j].getTransform().getTranslation();
                    final float press = CalcField.calcFieldAt(p, mf).length();
                    final Vector3f forceG = CalcField.calcForceGradients(p.x, p.y, p.z, particleR, mf);

                    aggregate(pressure, press);
                    aggregate(trapX, forceG.x);
                    aggregate(trapY, forceG.y);
                    aggregate(trapZ, forceG.z);
                    aggregate(pressureDiffTmp, press);

                    if (fw != null) {
                        //repetition nPoint x y z fx fy fz
                        fw.write(i + "," + j + "," + p.toStringSimple(",") + "," + forceG.toStringSimple(",") + "\n");
                    }
                }
                final double pressStdBetweenPoints = getStd(pressureDiffTmp, nPoints);
                aggregate(pressureDiff, (float) pressStdBetweenPoints);
            }

        } catch (IOException ex) {
            Logger.getLogger(RandPointsExpFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        TimerUtil.get().tack("Seconds", false);
        
        mf.clearSelection();

        
        //report the variables
        if (reportText){
            final int n = repetitions * nPoints;
            reportAvgAndStd("Pressure", pressure, n);
            reportAvgAndStd("PressDev", pressureDiffTmp, repetitions);
            reportAvgAndStd("trapX", trapX, n);
            reportAvgAndStd("trapY", trapY, n);
            reportAvgAndStd("trapZ", trapZ, n);
            System.out.println();
        }
        
        if (fw != null) {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(RandPointsExpFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(needToGeneratePoints){
            pointsToUse = null;
        }
    }
    
    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        final String file = FileUtils.selectFile(this, "Select", ".xml", null);
        if(file != null){
            fileText.setText( file );
        }
    }//GEN-LAST:event_selectButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        final int MAX_POINTS = 30;
        final int REPETITIONS = 1000;
        final int[] iterations = {10,100,1000,10000};
        final int[] algs = {0,4};
        
        repetitionsText.setText(REPETITIONS + "");
        
        for (int nPoints = 1; nPoints <= MAX_POINTS; ++nPoints) {
            numPointsText.setText( nPoints + "");
            pointsToUse = generatePoints();
            for (int iter : iterations) {
                mf.algForm.setSteps( iter );
                for (int alg : algs) {
                    mf.algForm.setAlgorithm(alg);
                    System.out.print("nPoints " + nPoints + " iters " + iter + " alg " + alg + "\t");
                    calcExperiments(null, true);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        final int MAX_POINTS = 30;
        final int REPETITIONS = 1000;
        final int[] algs = {0,4}; //BFGS, HOLOGRAPHIC
        final boolean[] useBFGSGorkov = {false, true};
        
        repetitionsText.setText(REPETITIONS + "");
        final String iters = mf.algForm.getItersMultiFocalKickText().getText();
        
        for (int nPoints = 1; nPoints <= MAX_POINTS; ++nPoints) {
            numPointsText.setText( nPoints + "");
            pointsToUse = generatePoints();
            
            for (boolean useGorkov : useBFGSGorkov) {
                for (int alg : algs) {
                    mf.algForm.getKickstartBFGSorHoloCheck().setSelected( (alg==0) );
                    mf.algForm.getItersMultiFocalKickText().setText( useGorkov ? iters : "0");
                    
                    System.out.print("nPoints " + nPoints + " alg " + alg + " 5Gorkov " + useGorkov + "\t");
                    calcExperiments(null, true);
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void simpleForcesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpleForcesButtonActionPerformed
        final int MAX_POINTS = 30;
        final int REPETITIONS = 1000;

        repetitionsText.setText(REPETITIONS + "");

        for (int nPoints = 1; nPoints <= MAX_POINTS; ++nPoints) {
            numPointsText.setText(nPoints + "");
            pointsToUse = generatePoints();

            System.out.print("nPoints " + nPoints + "\t");
            calcExperiments(null, true);
        }

    }//GEN-LAST:event_simpleForcesButtonActionPerformed

    private void generateTestPointsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateTestPointsButtonActionPerformed
        final int nPoints = Parse.toInt( numPointsText.getText() );
        
        for (int i = 1; i <= nPoints; ++i){
            numPointsText.setText( i + "");
            final float[][][] pointSet = generatePoints();
            
            try {
                FileUtils.writeObject(new File("points" + i + ".xml"), pointSet);
            } catch (IOException ex) {
                Logger.getLogger(RandPointsExpFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
       numPointsText.setText( nPoints + "");
        
        
    }//GEN-LAST:event_generateTestPointsButtonActionPerformed

    private void simpleForcesToCSVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpleForcesToCSVButtonActionPerformed
        final int nPoints = Parse.toInt( numPointsText.getText() );
        
        for (int i = 1; i <= nPoints; ++i){
            try {
                if ( simpleForcesGenPoints.isSelected() ){
                    numPointsText.setText( i + "");
                    pointsToUse = generatePoints();
                }else{
                    pointsToUse = (float[][][]) FileUtils.readObject( new File("points" + i + ".xml"));
                }
                
                calcExperiments(fileText + "_" + i + ".csv", false);
            } catch (IOException ex) {
                Logger.getLogger(RandPointsExpFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_simpleForcesToCSVButtonActionPerformed

    private void spatialResVsFocusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spatialResVsFocusButtonActionPerformed
        //load the 1-n points
        final int nPoints = 1;
        final float width = 0.16f;
        
        try {
            pointsToUse = (float[][][]) FileUtils.readObject( new File("points" + nPoints + ".xml"));
        } catch (IOException ex) {
            Logger.getLogger(RandPointsExpFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        final int repetitions = pointsToUse.length;
        assert ( pointsToUse[0].length == nPoints);
        
        for (int nTrans = 1; nTrans < 256; ++ nTrans){
            final Vector3f pressAgg = new Vector3f();
            
            //delete all the previous transducers
            mf.transPanel.selectAll();
            mf.transPanel.deleteSelectedTransducers();
            
            //create the array of transducers
            final float transWidth = width / nTrans;
            final float transPower = 2.5f * 16 * 16 / nTrans / nTrans;
            final float transApperture = 0.009f * 16 / nTrans;
            mf.addTransducersForm.getColSpinner().setValue( nTrans );
            mf.addTransducersForm.getRowSpinner().setValue( nTrans );
            mf.addTransducersForm.getSizeText().setText( transWidth + " 0.003 " + transWidth);
            mf.addTransducersForm.getSpaceText().setText(transWidth + "");
            mf.addTransducersForm.getpText().setText( transPower + "");
            mf.addTransducersForm.getwText().setText( transApperture + "");
            mf.addTransducersForm.pressOkButton();
            
            //for each point
            for(int i = 0; i < repetitions; ++i){
                //focus at the point
                final float[] p = pointsToUse[i][0];
                final Vector3f point = new Vector3f(p[0], p[1], p[2]);
                SimplePhaseAlgorithms.focus(mf.simulation.transducers, point, mf.simulation.getMediumSpeed());
                //get the amplitude
                final float amplitude = CalcField.calcFieldAt(point, mf).length();
                
                //average
                aggregate(pressAgg, amplitude);
            }
            
            //show results
            reportAvgAndStd("nTrans" + nTrans, pressAgg, repetitions);
            System.out.println();
        }
    }//GEN-LAST:event_spatialResVsFocusButtonActionPerformed

    private void simpleForcesToCSVButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpleForcesToCSVButton1ActionPerformed
        final int nPoints = Parse.toInt( numPointsText.getText() );
        
        final float lambda = 0.0086f;
        
        for (int sep = 0; sep < 10; ++sep){
            for (int i = 1; i <= nPoints; ++i){
                numPointsText.setText( i + "");
                minDistText.setText( (sep*lambda) + "");
                minDistZText.setText( (5*lambda) + "");
                pointsToUse = generatePoints();

                calcExperiments(fileText + "_x" + sep + "_" + i + ".csv", false);
            }
        }
    }//GEN-LAST:event_simpleForcesToCSVButton1ActionPerformed

    private void simpleForcesToCSVButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpleForcesToCSVButton2ActionPerformed
        final int nPoints = Parse.toInt( numPointsText.getText() );
        
        final float lambda = 0.0086f;
        
        for (int sep = 0; sep < 10; ++sep){
            for (int i = 1; i <= nPoints; ++i){
                numPointsText.setText( i + "");
                minDistText.setText( (5*lambda) + "");
                minDistZText.setText( (sep*lambda) + "");
                pointsToUse = generatePoints();

                calcExperiments(fileText + "_z" + sep + "_" + i + ".csv", false);
            }
        }
    }//GEN-LAST:event_simpleForcesToCSVButton2ActionPerformed

    private void runExperiment(final int steps, final int alg){
        System.out.println("----- " + (alg==3?"gorkov":"laplacian") + " steps " + steps);
        mf.algForm.setAlgorithm(alg);
        mf.algForm.setSteps(steps);
        calcExperiments(null, true);
    }
    
    private static void aggregate(Vector3f v, final float val){
        v.x += val;
        v.y += val*val;
        v.z = M.max(v.z, val);
    }
    
    private static double getStd(final Vector3f val, final int n){
        final double average = val.x / n;
        return M.sqrt( (float) (val.y / n - average * average));
    }
    
    private static void reportAvgAndStd(String name, final Vector3f val, final int n){
        final double average = val.x / n;
        final double stddev = getStd(val, n);
        final double max = val.z;
        //System.out.println(name + " " + average + " " + stddev + " " + max);
        System.out.print(name + "\t" + average + "\t" + stddev + "\t" + max + "\t");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton auxButton;
    private javax.swing.JButton copyCubeButton;
    private javax.swing.JTextField fileText;
    private javax.swing.JButton generatePointsButton;
    private javax.swing.JButton generateTestPointsButton;
    private javax.swing.JButton goButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField minDistText;
    private javax.swing.JTextField minDistZText;
    private javax.swing.JTextField numPointsText;
    private javax.swing.JTextField repetitionsText;
    private javax.swing.JButton selectButton;
    private javax.swing.JButton simpleForcesButton;
    private javax.swing.JCheckBox simpleForcesGenPoints;
    private javax.swing.JButton simpleForcesToCSVButton;
    private javax.swing.JButton simpleForcesToCSVButton1;
    private javax.swing.JButton simpleForcesToCSVButton2;
    private javax.swing.JButton spatialResVsFocusButton;
    // End of variables declaration//GEN-END:variables

    private void selectPoints(final float[][] points, final float minDist, final float minDistZ) {
        final int n = points.length;
        
        calcRandomPoint( points[0] );
        for (int i = 1; i < n; ++i){
            do{
                calcRandomPoint( points[i] );
            }while( minDistance(points, i, minDist, minDistZ) );
        }
    }
    
    private void calcRandomPoint( final float[] p ){
        final Vector3f scale = workingVolume.getScale();
        final Vector3f pos = workingVolume.getTranslation();
        p[0] = M.random(-scale.x/2,scale.x/2) + pos.x;
        p[1] = M.random(-scale.y/2,scale.y/2) + pos.y;
        p[2] = M.random(-scale.z/2,scale.z/2) + pos.z;
    }

    private static boolean minDistance(final float[][] points, final int currentPoint, final float minDist, final float minDistY) {
        final float[] currentP = points[currentPoint];
        for(int i = 0; i < currentPoint; ++i){
            final float[] p = points[i];
            if (dist(currentP,p) < minDist || distY(currentP,p) < minDistY ){
                return false;
            }
        }
        return true;
    }
    
    private static float distY(final float[] p1, final float[] p2){
        return M.abs( p1[1]-p1[1] );
    }
    
    private static float dist(final float[] p1, final float[] p2){
        return M.sqrt( p1[0]*p1[0] + p1[1]*p1[1] + p1[2]*p1[2]);
    }

    private void resetTransducers() {
        for (Transducer t : mf.simulation.transducers){
            t.setpAmplitude(1);
            t.setPhase(0);
        }
    }
}
