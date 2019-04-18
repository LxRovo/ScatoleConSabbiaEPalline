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

/**
 *
 * @author caliendo_giuseppe
 */
public class SwingGui {

    private DatiCondivisi ptrDati;
    
    private JFrame frame;

    public SwingGui(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
        frame = new JFrame("Controlli");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel controls = new JPanel();  //aggiunge un pannello su cui aggiungere bottoni
        controls.setLayout(new FlowLayout());

        JButton incBtn = new JButton("Aumenta"); //bottone per aumentare l'inclinazione
        incBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ptrDati.aumentaInc();
            }
        });
        
        JButton decBtn = new JButton("Decrementa");
        decBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               ptrDati.decrementaInc();
            }
        });
        
        JButton resetBtn = new JButton("Azzera");
        resetBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               ptrDati.resetInc();
            }
        });
        
        controls.add(incBtn);
        controls.add(decBtn);
        controls.add(resetBtn);
        
        frame.add(controls);
        frame.setSize(400, 80);
                

    }
    
    public void show() {
        frame.setVisible(true);
    }

}
