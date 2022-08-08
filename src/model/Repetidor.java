package model;

import javax.swing.*;

public class Repetidor {

    public boolean tentaRepetir(){
        int resposta;
        resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
        if(resposta !=0){
                JOptionPane.showMessageDialog(null, "Programa finalizado");
                return false;
        }
        return true;
    }
}
