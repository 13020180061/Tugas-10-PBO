
package tugas10;

/*
    Nama    : St.Hatijah H.Ilyas
    Stambuk : 13020180061
    Tanggal : 15 Mei 2020
    Waktu   : 23.43 WITA 
*/

import javax.swing.*;
import java.awt.event.*;

public class HandlingGui extends JFrame{
    private JButton tugas = new JButton("OK"),
    program = new JButton("Cancel");
    private JLabel tgs = new JLabel(" << ANDA TELAH MENEKAN OK >> "),
    umi = new JLabel(" << ANDA TELAH MENEKAN CANCEL >> ");
    private JPanel you = new JPanel();

    HandlingGui() {
        super("Membuat Tombol");
        you.setLayout(null);
        setSize(450, 170);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        tgs.setBounds(110,20,450,25);
        umi.setBounds(94,20,450,25);
        tgs.setVisible(false);
        umi.setVisible(false);
        tugas.setBounds(90,70,100,25);
        program.setBounds(250,70,100,25);
        program.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent evn){
                umi.setVisible(true);
                tugas.setEnabled(false);
            }
        });

        tugas.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent evn){
            tgs.setVisible(true);
            program.setEnabled(false);
            }
        });

        you.add(tgs);
        you.add(tugas);
        you.add(program);
        you.add(umi);
        getContentPane().add(you);
        setVisible(true);
    }

public static void main(String[] args) {
    HandlingGui pbo = new HandlingGui();
    }
}