/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progfiguregeometrichegui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author gabriel.ricaldone
 */
public class ProgFigureGeometricheGUI implements ActionListener{
    /**
     * @param args the command line arguments
     */
    
    int cont=0;
    int cont1=0;
    private JLabel labelArea;
    private JLabel labelPerimetro;
    
    private JFrame frame;
    
    private JButton pulsanteQuadrato;
    private JButton pulsanteRettangolo;
    private JButton pulsanteTriangolo;
    private JButton pulsanteCerchio;
    private JButton pulsanteConferma;
    
    private JFormattedTextField inputBase;
    private JFormattedTextField inputAltezza;
    private JFormattedTextField inputRaggio;
    private JFormattedTextField inputLato1;
    private JFormattedTextField inputLato2;
    private JFormattedTextField inputLato3;
    //sus1
    
    public ProgFigureGeometricheGUI(){
        frame = new JFrame();
       
        //Creazione pulsanti
        pulsanteQuadrato = new JButton("Quadrato");
        pulsanteQuadrato.addActionListener(this);
        pulsanteRettangolo = new JButton("Rettangolo");
        pulsanteRettangolo.addActionListener(this);
        pulsanteTriangolo = new JButton("Triangolo");
        pulsanteTriangolo.addActionListener(this);
        pulsanteCerchio = new JButton("Cerchio");
        pulsanteCerchio.addActionListener(this);
        
        //Creazione Label
        labelArea = new JLabel("Area: 0");
        labelPerimetro = new JLabel("Perimetro: 0");
        
        //Grandezza finestra e layout
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(60, 60, 60, 60));
        panel.setLayout(new GridLayout(4,4));
        
        //Sezione Add
        panel.add(pulsanteQuadrato);
        panel.add(pulsanteRettangolo);
        panel.add(pulsanteTriangolo);
        panel.add(pulsanteCerchio);
        panel.add(labelArea);
        panel.add(labelPerimetro);
        
        //Sezione Finestra
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calcolatore di figure giometriche");
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new ProgFigureGeometricheGUI();
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        
        switch(a.getActionCommand()) {
            case "Quadrato":
                break;
            case "Triangolo":
                break;
            case "Cerchio":
                break;
            case "Rettangolo":
                break;
        }
    }
    
}




