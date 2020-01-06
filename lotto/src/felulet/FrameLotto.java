/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package felulet;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Timer;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import lotto.Lotto;


/**
 *
 * @author Diak
 */
public class FrameLotto extends JFrame implements ActionListener {

        
    private JPanel pnlMain;
    private JTextField txtfldLottoSzamok;
    private JButton bttnSorsol,bttnRendez,bttnUjjatek;
    private JComboBox cmbbxLottoTipus;
    private JLabel lblUjSzam;
    
    private Lotto lotto;
    private Timer idozito;
    
    public FrameLotto(){
        init();
        
        
        
    }
    
    private void init(){
        this.lotto=new Lotto(5);
        
        
        this.setTitle("Lotto");
        this.setSize(300,400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        
        
        this.pnlMain=(JPanel) this.getContentPane();
        this.pnlMain.setLayout(null);
        
        this.bttnSorsol=new JButton();
        this.bttnSorsol.setText("Sorsol");
        this.bttnSorsol.setSize(250, 25);
        this.bttnSorsol.setLocation(20, 20);
        this.bttnSorsol.setEnabled(true);
    
        
        this.txtfldLottoSzamok=new JTextField();
        this.txtfldLottoSzamok.setText("");
        this.txtfldLottoSzamok.setSize(250,25);
        this.txtfldLottoSzamok.setLocation(20, 50);
        
        this.bttnRendez=new JButton();
        this.bttnRendez.setText("Rendezz");
        this.bttnRendez.setSize(250, 25);
        this.bttnRendez.setLocation(20, 80);
        this.bttnRendez.setEnabled(true);
        
        
        this.bttnUjjatek=new JButton();
        this.bttnUjjatek.setText("Uj jatek indin st");
        this.bttnUjjatek.setSize(250, 25);
        this.bttnUjjatek.setLocation(20, 110);
        this.bttnUjjatek.setEnabled(true);
    
        
        this.cmbbxLottoTipus=new JComboBox();
        this.cmbbxLottoTipus.setSize(250, 50);
        this.cmbbxLottoTipus.setLocation(20, 140);
        this.cmbbxLottoTipus.addItem("Otos lotto");
        this.cmbbxLottoTipus.addItem("Hatos lotto");
        this.cmbbxLottoTipus.addItem("Skandinav lotto");
            
      
        
        
        this.lblUjSzam=new JLabel();
        this.lblUjSzam.setText("1");
        this.lblUjSzam.setSize(250,50);
        this.lblUjSzam.setFont(new Font("Courier",Font.BOLD,78));
        this.lblUjSzam.setLocation(20, 200);
        
        
         this.pnlMain.add(this.bttnSorsol);
        this.pnlMain.add(this.txtfldLottoSzamok);
        this.pnlMain.add(this.bttnRendez);
        this.pnlMain.add(this.bttnUjjatek);
        this.pnlMain.add(this.cmbbxLottoTipus);
        this.pnlMain.add(this.lblUjSzam);
        
        
        this.bttnSorsol.addActionListener(this);
        this.bttnRendez.addActionListener(this);
        this.bttnUjjatek.addActionListener(this);
        
        
        this.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(bttnSorsol)) {
            Sorsol();
        }else if (e.getSource().equals(bttnRendez)) {
            lblUjSzam.setText("");
            lotto.novekvoberendez();
            bttnUjjatek.setEnabled(true);
            bttnRendez.setEnabled(false);
            cmbbxLottoTipus.setEnabled(true);
        }else if(e.getSource().equals(bttnUjjatek)){
            lotto=new Lotto (5+cmbbxLottoTipus.getSelectedIndex());
            bttnUjjatek.setEnabled(false);
            cmbbxLottoTipus.setEnabled(false);
            bttnSorsol.setEnabled(true);
        }
        
        this.txtfldLottoSzamok.setText(lotto.toString());    
    }
 
    public void Sorsol(){
        this.idozito=new Timer();
        this.idozito.schedule(new TimerTask() {
            int db=0;
            
            @Override
            public void run() {
                if (db<50) {
                    int szam=(int)(Math.random()*lotto.getMaxLottoszam()+1);
                    lblUjSzam.setText(szam+"");
                    db++;
                }
                else{
                try{
                    int szam=lotto.sorsol();
                    lblUjSzam.setText(szam+"");
                    txtfldLottoSzamok.setText(lotto.toString());
                    if (lotto.mindenSzamotKihuztak()) {
                        bttnSorsol.setEnabled(false);
                        bttnRendez.setEnabled(true);
                        
                    }
                    
                
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,e.getMessage(),"Hiba",JOptionPane.WARNING_MESSAGE);
                    System.err.printf("hiba",e.getMessage());
                    }
                this.cancel();
                }
            }
        }, 0,10);
        
        
    }
    
}
