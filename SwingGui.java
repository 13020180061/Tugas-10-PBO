
package tugas10;

/*
    Nama    : St.Hatijah H.Ilyas
    Stambuk : 13020180061
    Tanggal : 15 Mei 2020
    Waktu   : 23.28 WITA 	
*/

import javax.swing.*;
public class SwingGui extends JFrame{
    SwingGui(String title) { 
        this.setSize(600,400); 
        setTitle(title); 
         
    }

    public static void main(String[] args) {
       SwingGui tugas = new SwingGui("Pemrograman JAVA");
       tugas.setVisible(true);
       tugas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       JLabel label = new JLabel("Ayo Belajar Pemrograman JAVA");
       tugas.getContentPane().add(label); 
    }
}
