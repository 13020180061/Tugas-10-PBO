package tugas10;

/*
    Nama    : St.Hatijah H.Ilyas
    Stambuk : 13020180061
    Tanggal : 15 Mei 2020
    Waktu   : 20.55 WITA 	
*/

import java.awt.*;
public class AWTGui extends Panel{
    AWTGui(){
        setBackground(Color.black);    
    }
    public void paint(Graphics tugas){
        tugas.setColor(new Color(200,255,0));
        tugas.setFont(new Font("Helvetica",Font.CENTER_BASELINE,24));
        tugas.drawString("Daftar Login", 240, 30);
       
    }

    public static void main(String args[]){
        Frame f = new Frame("Pemrograman Berorientasi Objek");
        TextField text1, text2;
        text1 = new TextField("Nama Lengkap");
        text1.setBounds(190,90,230,30);
        text2 = new TextField("Password");
        text2.setBounds(190, 140, 230, 30);
        f.add(text1);
        f.add(text2);
        
        Button pbo = new Button("Submit");
        pbo.setBounds(190,210,80,40);
        f.add(pbo);
        
        AWTGui gp = new AWTGui();
        f.add(gp);
        f.setSize(600,400);
        f.setVisible(true);  
    }
}
