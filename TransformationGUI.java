
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class TransformationGUI extends javax.swing.JFrame 
{
    public static GLEventListener g = new GLEventListener();
    GLProfile glprofile = GLProfile.getDefault();
    GLCapabilities glcapabilities = new GLCapabilities( glprofile );
    GLCanvas glcanvas = new GLCanvas( glcapabilities );
    /**
     * Parse event listener to other classes
     * @return 
     */
    
    /**
     * Creates new form TransformationGUI
     */
    public TransformationGUI()
    {
        super("An Interactive Example of Transformations using JOGL");
        
        GLCanvas my_drawable = new GLCanvas(); 
        my_drawable.addGLEventListener(g);
        
        initComponents(); 
        TextDescription.setCaretPosition(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TransformationGroup = new javax.swing.ButtonGroup();
        DisplayPanel = new javax.swing.JPanel();
        DisplayFrame = new javax.swing.JInternalFrame();
        glcanvas.setPreferredSize(new Dimension(766, 415));
        glcanvas.addGLEventListener(g);

        getContentPane().add(glcanvas);
        pack();
        DescriptionPanel = new javax.swing.JPanel();
        DescriptionPane = new javax.swing.JScrollPane();
        TextDescription = new javax.swing.JTextArea();
        PlayPanel = new javax.swing.JPanel();
        TransformButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        xPosLabel = new javax.swing.JLabel();
        yPosLabel = new javax.swing.JLabel();
        TuningPanel = new javax.swing.JPanel();
        TxLabel = new javax.swing.JLabel();
        YSlider = new javax.swing.JSlider();
        ThetaSlider = new javax.swing.JSlider();
        TyLabel = new javax.swing.JLabel();
        ScaleSlider = new javax.swing.JSlider();
        ThetaLabel = new javax.swing.JLabel();
        ScaleLabel = new javax.swing.JLabel();
        tXLabel = new javax.swing.JLabel();
        tYLabel = new javax.swing.JLabel();
        thetaLabel = new javax.swing.JLabel();
        scaleLabel = new javax.swing.JLabel();
        XSlider = new javax.swing.JSlider();
        TransformationPanel = new javax.swing.JPanel();
        TranslationButton = new javax.swing.JRadioButton();
        RotationButton = new javax.swing.JRadioButton();
        ScaleButton = new javax.swing.JRadioButton();
        GuideButton = new javax.swing.JRadioButton();
        DescriptionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DisplayPanel.setBackground(new java.awt.Color(204, 204, 204));
        DisplayPanel.setPreferredSize(new java.awt.Dimension(625, 415));

        DisplayFrame.setIconifiable(true);
        DisplayFrame.setResizable(true);
        DisplayFrame.setVisible(true);

        javax.swing.GroupLayout DisplayFrameLayout = new javax.swing.GroupLayout(DisplayFrame.getContentPane());
        DisplayFrame.getContentPane().setLayout(DisplayFrameLayout);
        DisplayFrameLayout.setHorizontalGroup(
            DisplayFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DisplayFrameLayout.setVerticalGroup(
            DisplayFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout DisplayPanelLayout = new javax.swing.GroupLayout(DisplayPanel);
        DisplayPanel.setLayout(DisplayPanelLayout);
        DisplayPanelLayout.setHorizontalGroup(
            DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DisplayFrame)
        );
        DisplayPanelLayout.setVerticalGroup(
            DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DisplayFrame, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        DescriptionPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        DescriptionPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        TextDescription.setEditable(false);
        TextDescription.setColumns(20);
        TextDescription.setRows(5);
        TextDescription.setText("Guide / Introduction\n- Click \"Translate\" to apply your translations.\n- Adjust sliders to change transformation values.\n- Clicking \"Reset\" resets graphic & slider values.\n\nTransformations are functions that change the \nsize, orientation and placement of a line, \npoint or shape in a defined space. \n\nThe transformation operation can be an equation\nrequiring inputs, or a transformation matrix \nthat is applied to a set of points to define a\nshape, the result of the transformaiton \nand shape is a new transformed shape.\n\n");
        DescriptionPane.setViewportView(TextDescription);

        javax.swing.GroupLayout DescriptionPanelLayout = new javax.swing.GroupLayout(DescriptionPanel);
        DescriptionPanel.setLayout(DescriptionPanelLayout);
        DescriptionPanelLayout.setHorizontalGroup(
            DescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DescriptionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DescriptionPane, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addContainerGap())
        );
        DescriptionPanelLayout.setVerticalGroup(
            DescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DescriptionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DescriptionPane)
                .addContainerGap())
        );

        PlayPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TransformButton.setText("Transform");
        TransformButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransformButtonActionPerformed(evt);
            }
        });

        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        xPosLabel.setText("x = 0 ");

        yPosLabel.setText("y = 0 ");

        javax.swing.GroupLayout PlayPanelLayout = new javax.swing.GroupLayout(PlayPanel);
        PlayPanel.setLayout(PlayPanelLayout);
        PlayPanelLayout.setHorizontalGroup(
            PlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TransformButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(xPosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(yPosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PlayPanelLayout.setVerticalGroup(
            PlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TransformButton)
                    .addComponent(xPosLabel))
                .addGap(18, 18, 18)
                .addGroup(PlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yPosLabel))
                .addContainerGap())
        );

        TuningPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TxLabel.setText("Tx");

        YSlider.setMaximum(207);
        YSlider.setMinimum(-207);
        YSlider.setValue(0);
        YSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        YSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                YSliderStateChanged(evt);
            }
        });

        ThetaSlider.setMaximum(360);
        ThetaSlider.setValue(0);
        ThetaSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ThetaSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ThetaSliderStateChanged(evt);
            }
        });

        TyLabel.setText("Ty");

        ScaleSlider.setMajorTickSpacing(8);
        ScaleSlider.setMaximum(8);
        ScaleSlider.setToolTipText("");
        ScaleSlider.setValue(4);
        ScaleSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ScaleSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ScaleSliderStateChanged(evt);
            }
        });

        ThetaLabel.setText(" θ");

        ScaleLabel.setText("Scale");

        tXLabel.setText("=  0");

        tYLabel.setText("= 0");

        thetaLabel.setText("= 0");

        scaleLabel.setText("= 1");

        XSlider.setMaximum(387);
        XSlider.setMinimum(-387);
        XSlider.setValue(0);
        XSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        XSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                XSliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout TuningPanelLayout = new javax.swing.GroupLayout(TuningPanel);
        TuningPanel.setLayout(TuningPanelLayout);
        TuningPanelLayout.setHorizontalGroup(
            TuningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TuningPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TuningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxLabel)
                    .addComponent(TyLabel)
                    .addComponent(ThetaLabel)
                    .addComponent(ScaleLabel))
                .addGap(13, 13, 13)
                .addGroup(TuningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScaleSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(ThetaSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(YSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(XSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TuningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tXLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(tYLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thetaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scaleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        TuningPanelLayout.setVerticalGroup(
            TuningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TuningPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TuningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tXLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(XSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(TuningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TuningPanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(TuningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tYLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(TuningPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(YSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TuningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ThetaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ThetaSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thetaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TuningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScaleSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScaleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scaleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        TransformationPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TransformationGroup.add(TranslationButton);
        TranslationButton.setText("Translation");
        TranslationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TranslationButtonActionPerformed(evt);
            }
        });

        TransformationGroup.add(RotationButton);
        RotationButton.setText("Rotation");
        RotationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RotationButtonActionPerformed(evt);
            }
        });

        TransformationGroup.add(ScaleButton);
        ScaleButton.setText("Scale");
        ScaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScaleButtonActionPerformed(evt);
            }
        });

        TransformationGroup.add(GuideButton);
        GuideButton.setSelected(true);
        GuideButton.setText("Guide /  Introduction");
        GuideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuideButtonActionPerformed(evt);
            }
        });

        DescriptionLabel.setText("Descriptions / Help");

        javax.swing.GroupLayout TransformationPanelLayout = new javax.swing.GroupLayout(TransformationPanel);
        TransformationPanel.setLayout(TransformationPanelLayout);
        TransformationPanelLayout.setHorizontalGroup(
            TransformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransformationPanelLayout.createSequentialGroup()
                .addGroup(TransformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransformationPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(TransformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RotationButton)
                            .addComponent(ScaleButton)
                            .addComponent(GuideButton)))
                    .addGroup(TransformationPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(DescriptionLabel))
                    .addGroup(TransformationPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TranslationButton)))
                .addContainerGap())
        );
        TransformationPanelLayout.setVerticalGroup(
            TransformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransformationPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DescriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TranslationButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RotationButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScaleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GuideButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DisplayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DescriptionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TransformationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PlayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TuningPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TransformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PlayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(TuningPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DescriptionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TranslationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TranslationButtonActionPerformed
        TextDescription.setText("Translations\n "+
                                 "A shift along x,y or z axis by given units\n" +
                                "Transformation matrix for 2D transformations:\n" +
                                "[1   0   0;\n" +
                                " 0   1   0;\n" +
                                " tx  ty  1]\n" +
                                "\n" +
                                "tx > 0 moves right\n" +
                                "tx < 0 moves left\n" +
                                "ty < 0 moves up\n" +
                                "ty > 0 moves down");
    }//GEN-LAST:event_TranslationButtonActionPerformed

    private void TransformButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransformButtonActionPerformed
        //Update coords
        g.setX1(Math.round(g.getX2()));
        g.setY1(Math.round(g.getY2()));
        
        // Update Labels
        xPosLabel.setText("x = " + String.valueOf(g.getX1() -388));
        yPosLabel.setText("y = " + String.valueOf(g.getY1() -208));
        
        // Refresh the display
        glcanvas.display(); 
    }//GEN-LAST:event_TransformButtonActionPerformed

    private void ScaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScaleButtonActionPerformed
        TextDescription.setText("Scaling\n" +
                                "Enlarges or contracts the shape by factor t.\n" +
                                "Transformation matrix:\n" +
                                "[tx 0 0;\n" +
                                " 0 ty 0;\n" +
                                " 0 0  1]");
    }//GEN-LAST:event_ScaleButtonActionPerformed

    private void RotationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotationButtonActionPerformed
    TextDescription.setText("Rotation\n"
                            + " θ specifies angle.\n" +
                            "This rotation matrix is for rotating about the x axis only.\n" +
                            "[cos(θ) -sin(θ) 0;\n" +
                            " sin(θ)  cos(θ) 0;\n" +
                            " 0       0      1]\n" +
                            "\n" +
                            "See TutorialsPoint for more rotation matrices.");
    }//GEN-LAST:event_RotationButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        //Set coordinates back to initial values
        g.setX1(g.getInitX());
        g.setY1(g.getInitY());
        
        //Set sliders back to 0
        XSlider.setValue(0);
        YSlider.setValue(0);
        ThetaSlider.setValue(0);
        ScaleSlider.setValue(4);
        
        // Update Labels
        xPosLabel.setText("x = " + String.valueOf(g.getX1() -387));
        yPosLabel.setText("y = " + String.valueOf(g.getY1() -207));
        
        //Refresh display
        glcanvas.display();
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void GuideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuideButtonActionPerformed
       TextDescription.setText("Guide / Introduction\n- Click \"Translate\" to apply your translations.\n- Adjust sliders to change transformation values.\n- Clicking \"Reset\" resets graphic & slider values.\n\nTransformations are functions that change the \nsize, orientation and placement of a line, \npoint or shape in a defined space. \n\nThe transformation operation can be an equation\nrequiring inputs, or a transformation matrix \nthat is applied to a set of points to define a\nshape, the result of the transformaiton \nand shape is a new transformed shape.\n\n");
    }//GEN-LAST:event_GuideButtonActionPerformed

    private void XSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_XSliderStateChanged
        System.out.println("XSlider changed! XSLider Value:> " + XSlider.getValue() + " Translating...");
        g.translateX(XSlider.getValue()); //Translate in x axis by XSlider value
        tXLabel.setText(" = " + XSlider.getValue());
    }//GEN-LAST:event_XSliderStateChanged

    private void ScaleSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ScaleSliderStateChanged
        /* NOTE: VALUES FROM SLIDER MUST BE DIVIDED TO GET SCALE FACTOR */
        scaleLabel.setText(" = " + ((float) ScaleSlider.getValue() / 4.0));
        g.scale((double) ScaleSlider.getValue() / 4.0);
    }//GEN-LAST:event_ScaleSliderStateChanged

    private void ThetaSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ThetaSliderStateChanged
        g.rotate(ThetaSlider.getValue());
        thetaLabel.setText(" = " + ThetaSlider.getValue());
    }//GEN-LAST:event_ThetaSliderStateChanged

    private void YSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_YSliderStateChanged
        System.out.println("YSlider changed! YSLider Value:> " + YSlider.getValue() + " Translating...");
        g.translateY(YSlider.getValue()); //Translate in y axis by YSlider value
        tYLabel.setText(" = " + YSlider.getValue());
    }//GEN-LAST:event_YSliderStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TransformationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransformationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransformationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransformationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransformationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JScrollPane DescriptionPane;
    private javax.swing.JPanel DescriptionPanel;
    private javax.swing.JInternalFrame DisplayFrame;
    private javax.swing.JPanel DisplayPanel;
    private javax.swing.JRadioButton GuideButton;
    private javax.swing.JPanel PlayPanel;
    private javax.swing.JButton ResetButton;
    private javax.swing.JRadioButton RotationButton;
    private javax.swing.JRadioButton ScaleButton;
    private javax.swing.JLabel ScaleLabel;
    private javax.swing.JSlider ScaleSlider;
    private javax.swing.JTextArea TextDescription;
    private javax.swing.JLabel ThetaLabel;
    private javax.swing.JSlider ThetaSlider;
    private javax.swing.JButton TransformButton;
    private javax.swing.ButtonGroup TransformationGroup;
    private javax.swing.JPanel TransformationPanel;
    private javax.swing.JRadioButton TranslationButton;
    private javax.swing.JPanel TuningPanel;
    private javax.swing.JLabel TxLabel;
    private javax.swing.JLabel TyLabel;
    private javax.swing.JSlider XSlider;
    private javax.swing.JSlider YSlider;
    private javax.swing.JLabel scaleLabel;
    private javax.swing.JLabel tXLabel;
    private javax.swing.JLabel tYLabel;
    private javax.swing.JLabel thetaLabel;
    private javax.swing.JLabel xPosLabel;
    private javax.swing.JLabel yPosLabel;
    // End of variables declaration//GEN-END:variables
}
