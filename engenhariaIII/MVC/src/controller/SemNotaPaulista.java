package controller;

import model.Passagem;
import view.View;

public class SemNotaPaulista implements Nota{
    private View v;
    private Passagem p;

    public void setV(View view){
        v = view;
    }

    public void emitirNota(){
        v.imprimirDadosPassagem();
    }
}
