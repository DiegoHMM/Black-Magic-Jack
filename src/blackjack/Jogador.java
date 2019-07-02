/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author diego
 */
public class Jogador {
    int saldo;
    int quantidade_apostada ;

    public int getQuantidade_apostada() {
        return quantidade_apostada;
    }

    public void setQuantidade_apostada(int quantidade_apostada) {
        this.quantidade_apostada = quantidade_apostada;
    }
    
    public Jogador(){
        setSaldo(1000);
        setQuantidade_apostada(0);
    }
    
    public int getSaldo(){
        return saldo;
    }
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    public void somar_aposta(int somar){
        quantidade_apostada += somar;
    }
    public void atualizar_saldo(int aposta){
        saldo += aposta;
    }
}
