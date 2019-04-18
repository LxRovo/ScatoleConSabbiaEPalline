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
    private final int VAL_MIN=0;
    private final int VAL_MAX=0;
    private final int VAL_INIT=0;

    public SwingGui(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
        frame = new JFrame("Controlli");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel controls = new JPanel();  //aggiunge un pannello su cui aggiungere bottoni
        controls.setLayout(new FlowLayout());

        JSlider inclinazione = new JSlider(JSlider.HORIZONTAL,VAL_MIN, VAL_MAX, VAL_INIT);  //slider che regola l'inclinazione delle scatole
        inclinazione.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int valore = (int)inclinazione.getValue();
                ptrDati.setValoreInc();
            }         
        });
        
        JButton resetBtn = new JButton("Azzera");
        resetBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               ptrDati.resetInc();
            }
        });
        
        controls.add(inclinazione);
        controls.add(resetBtn);
        
        frame.add(controls);
        frame.setSize(400, 80);
                

    }
    
    public void show() {
        frame.setVisible(true);
    }

}
