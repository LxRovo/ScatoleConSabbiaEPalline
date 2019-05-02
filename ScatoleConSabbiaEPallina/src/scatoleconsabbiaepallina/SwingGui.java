/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatoleconsabbiaepallina;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author caliendo_giuseppe
 */
public class SwingGui {

    private DatiCondivisi ptrDati;
    
    private JFrame frame;
    private final int VAL_MIN=-90;
    private final int VAL_MAX=90;
    private final int VAL_INIT=0;

    public SwingGui(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
        frame = new JFrame("Controlli");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             JLabel label=new JLabel("valore corrente: 0");
             
        JPanel controls = new JPanel();  //aggiunge un pannello su cui aggiungere bottoni
        controls.setLayout(new FlowLayout());

        JSlider inclinazione = new JSlider(JSlider.HORIZONTAL,VAL_MIN, VAL_MAX, VAL_INIT);  //slider che regola l'inclinazione delle scatole
        inclinazione.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int valore = (int)inclinazione.getValue();
                System.out.println(valore);
                label.setText("valore corrente: "+valore);
                ptrDati.setValoreInc(valore);
              
            }         
        });
        
        JButton resetBtn = new JButton("Azzera");
        resetBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                inclinazione.setValue(0);
                label.setText("valore corrente: 0");
                ptrDati.setValoreInc(0);
             
            }
        });
        
        controls.add(inclinazione);
        controls.add(resetBtn);
        controls.add(label);
        
        frame.add(controls);
        frame.setSize(400, 100);
                

    }
    
    public void show() {
        frame.setVisible(true);
    }

}
