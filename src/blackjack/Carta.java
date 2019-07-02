/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.Icon;
import java.util.Random;

/**
 *
 * @author diego
 */
public class Carta extends javax.swing.JLabel {
    
    private int valor_carta;
    private int numero_carta;
    private int naipe_carta;
    
    private boolean aberto;
    
    private final Icon closed = new javax.swing.ImageIcon(getClass().getResource("/images/b.gif"));
    private final Icon sa = new javax.swing.ImageIcon(getClass().getResource("/images/as.gif"));
    private final Icon s2 = new javax.swing.ImageIcon(getClass().getResource("/images/2s.gif"));
    private final Icon s3 = new javax.swing.ImageIcon(getClass().getResource("/images/3s.gif"));
    private final Icon s4 = new javax.swing.ImageIcon(getClass().getResource("/images/4s.gif"));
    private final Icon s5 = new javax.swing.ImageIcon(getClass().getResource("/images/5s.gif"));
    private final Icon s6 = new javax.swing.ImageIcon(getClass().getResource("/images/6s.gif"));
    private final Icon s7 = new javax.swing.ImageIcon(getClass().getResource("/images/7s.gif"));
    private final Icon s8 = new javax.swing.ImageIcon(getClass().getResource("/images/8s.gif"));
    private final Icon s9 = new javax.swing.ImageIcon(getClass().getResource("/images/9s.gif"));
    private final Icon s10 = new javax.swing.ImageIcon(getClass().getResource("/images/ts.gif"));
    private final Icon sj = new javax.swing.ImageIcon(getClass().getResource("/images/js.gif"));
    private final Icon sq = new javax.swing.ImageIcon(getClass().getResource("/images/qs.gif"));
    private final Icon sk = new javax.swing.ImageIcon(getClass().getResource("/images/ks.gif"));
    
    private final Icon ca = new javax.swing.ImageIcon(getClass().getResource("/images/ac.gif"));
    private final Icon c2 = new javax.swing.ImageIcon(getClass().getResource("/images/2c.gif"));
    private final Icon c3 = new javax.swing.ImageIcon(getClass().getResource("/images/3c.gif"));
    private final Icon c4 = new javax.swing.ImageIcon(getClass().getResource("/images/4c.gif"));
    private final Icon c5 = new javax.swing.ImageIcon(getClass().getResource("/images/5c.gif"));
    private final Icon c6 = new javax.swing.ImageIcon(getClass().getResource("/images/6c.gif"));
    private final Icon c7 = new javax.swing.ImageIcon(getClass().getResource("/images/7c.gif"));
    private final Icon c8 = new javax.swing.ImageIcon(getClass().getResource("/images/8c.gif"));
    private final Icon c9 = new javax.swing.ImageIcon(getClass().getResource("/images/9c.gif"));
    private final Icon c10 = new javax.swing.ImageIcon(getClass().getResource("/images/tc.gif"));
    private final Icon cj = new javax.swing.ImageIcon(getClass().getResource("/images/jc.gif"));
    private final Icon cq = new javax.swing.ImageIcon(getClass().getResource("/images/qc.gif"));
    private final Icon ck = new javax.swing.ImageIcon(getClass().getResource("/images/kc.gif"));
    
    private final Icon da = new javax.swing.ImageIcon(getClass().getResource("/images/ad.gif"));
    private final Icon d2 = new javax.swing.ImageIcon(getClass().getResource("/images/2d.gif"));
    private final Icon d3 = new javax.swing.ImageIcon(getClass().getResource("/images/3d.gif"));
    private final Icon d4 = new javax.swing.ImageIcon(getClass().getResource("/images/4d.gif"));
    private final Icon d5 = new javax.swing.ImageIcon(getClass().getResource("/images/5d.gif"));
    private final Icon d6 = new javax.swing.ImageIcon(getClass().getResource("/images/6d.gif"));
    private final Icon d7 = new javax.swing.ImageIcon(getClass().getResource("/images/7d.gif"));
    private final Icon d8 = new javax.swing.ImageIcon(getClass().getResource("/images/8d.gif"));
    private final Icon d9 = new javax.swing.ImageIcon(getClass().getResource("/images/9d.gif"));
    private final Icon d10 = new javax.swing.ImageIcon(getClass().getResource("/images/td.gif"));
    private final Icon dj = new javax.swing.ImageIcon(getClass().getResource("/images/jd.gif"));
    private final Icon dq = new javax.swing.ImageIcon(getClass().getResource("/images/qd.gif"));
    private final Icon dk = new javax.swing.ImageIcon(getClass().getResource("/images/kd.gif"));
    
    private final Icon ha = new javax.swing.ImageIcon(getClass().getResource("/images/ah.gif"));
    private final Icon h2 = new javax.swing.ImageIcon(getClass().getResource("/images/2h.gif"));
    private final Icon h3 = new javax.swing.ImageIcon(getClass().getResource("/images/3h.gif"));
    private final Icon h4 = new javax.swing.ImageIcon(getClass().getResource("/images/4h.gif"));
    private final Icon h5 = new javax.swing.ImageIcon(getClass().getResource("/images/5h.gif"));
    private final Icon h6 = new javax.swing.ImageIcon(getClass().getResource("/images/6h.gif"));
    private final Icon h7 = new javax.swing.ImageIcon(getClass().getResource("/images/7h.gif"));
    private final Icon h8 = new javax.swing.ImageIcon(getClass().getResource("/images/8h.gif"));
    private final Icon h9 = new javax.swing.ImageIcon(getClass().getResource("/images/9h.gif"));
    private final Icon h10 = new javax.swing.ImageIcon(getClass().getResource("/images/th.gif"));
    private final Icon hj = new javax.swing.ImageIcon(getClass().getResource("/images/jh.gif"));
    private final Icon hq = new javax.swing.ImageIcon(getClass().getResource("/images/qh.gif"));
    private final Icon hk = new javax.swing.ImageIcon(getClass().getResource("/images/kh.gif"));
    
    
    
    public Carta(){
        
        this.setPreferredSize(new Dimension(73,97));
        carta_random();
    }
    //getters e setters
    
    public int get_numero_carta(){
        return numero_carta;
    }
    
    public void set_numero_carta(int numero_carta){
        this.numero_carta = numero_carta;
    }
    
    public void set_naipe_carta(int naipe_carta){
        this.naipe_carta = naipe_carta;
    }
    
    public int get_naipe_carta(){
        return naipe_carta;
    }
    void carta_random(){
       Random random = new Random();
       int naipe = random.nextInt(4)+1;
       int valor_carta;
       int numero_carta = random.nextInt(13)+1;
       aberto = false;
       this.setIcon(closed);
       
       if(numero_carta>=10)setValor_carta(10);
       else{
           setValor_carta(numero_carta);
    }
       
       set_naipe_carta(naipe);
       set_numero_carta(numero_carta);
    }
    
        public int getValor_carta() {
        return valor_carta;
    }

    public void setValor_carta(int valor_carta) {
        this.valor_carta = valor_carta;
    }
    
    public void mostrar_valor(){
        
        switch (numero_carta)
        {
                case 1:
                switch(naipe_carta)
                {
                    case 1: setIcon(sa);break; 
                    case 2: setIcon(ca);break;
                    case 3: setIcon(da);break;
                    case 4: setIcon(ha);break;
                    
                }
                break;
                case 2:
                switch(naipe_carta)
                {
                    case 1: setIcon(s2);break; 
                    case 2: setIcon(c2);break;
                    case 3: setIcon(d2);break;
                    case 4: setIcon(h2);break;
                }
                break;
                case 3:
                switch(naipe_carta)
                {
                    case 1: setIcon(s3);break; 
                    case 2: setIcon(c3);break;
                    case 3: setIcon(d3);break;
                    case 4: setIcon(h3);break;
                }
                break;
                case 4:
                switch(naipe_carta)
                {
                    case 1: setIcon(s4);break; 
                    case 2: setIcon(c4);break;
                    case 3: setIcon(d4);break;
                    case 4: setIcon(h4);break;
                }
                break;
                case 5:
                switch(naipe_carta)
                {
                    case 1: setIcon(s5);break; 
                    case 2: setIcon(c5);break;
                    case 3: setIcon(d5);break;
                    case 4: setIcon(h5);break;
                }
                break;
                case 6:
                switch(naipe_carta)
                {
                    case 1: setIcon(s6);break; 
                    case 2: setIcon(c6);break;
                    case 3: setIcon(d6);break;
                    case 4: setIcon(h6);break;
                }
                break;
                case 7:
                switch(naipe_carta)
                {
                    case 1: setIcon(s7);break; 
                    case 2: setIcon(c7);break;
                    case 3: setIcon(d7);break;
                    case 4: setIcon(h7);break;
                }
                break;
                case 8:
                switch(naipe_carta)
                {
                    case 1: setIcon(s8);break; 
                    case 2: setIcon(c8);break;
                    case 3: setIcon(d8);break;
                    case 4: setIcon(h8);break;
                }
                break;
                case 9:
                switch(naipe_carta)
                {
                    case 1: setIcon(s9);break; 
                    case 2: setIcon(c9);break;
                    case 3: setIcon(d9);break;
                    case 4: setIcon(h9);break;
                }
                break;
                case 10:
                switch(naipe_carta)
                {
                    case 1: setIcon(s10);break; 
                    case 2: setIcon(c10);break;
                    case 3: setIcon(d10);break;
                    case 4: setIcon(h10);break;
                }
                break;
                case 11:
                switch(naipe_carta)
                {
                    case 1: setIcon(sj);break; 
                    case 2: setIcon(cj);break;
                    case 3: setIcon(dj);break;
                    case 4: setIcon(hj);break;
                }
                break;
                case 12:
                switch(naipe_carta)
                {
                    case 1: setIcon(sq);break; 
                    case 2: setIcon(cq);break;
                    case 3: setIcon(dq);break;
                    case 4: setIcon(hq);break;
                }
                break;
                case 13:
                switch(naipe_carta)
                {
                    case 1: setIcon(sk);break; 
                    case 2: setIcon(ck);break;
                    case 3: setIcon(dk);break;
                    case 4: setIcon(hk);break;
                }
                break;    
        }
        set_aberto(true);
    }
    public boolean esta_aberto(){
        return aberto;
    }
    public void set_aberto(boolean aberto){
        this.aberto = aberto;
    }
}

