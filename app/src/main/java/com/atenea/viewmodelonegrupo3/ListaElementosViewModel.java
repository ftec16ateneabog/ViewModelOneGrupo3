package com.atenea.viewmodelonegrupo3;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class ListaElementosViewModel extends ViewModel {
    private List<String> elementos;

    public ListaElementosViewModel()
    {
        elementos = new ArrayList<>();
    }
    public void agregarElemento(String elemento)
    {
        elementos.add(elemento);
    }
    public void eliminarElemento(String elemento)
    {
        elementos.remove(elemento);
    }
    public List<String> getElementos()
    {
        return elementos;
    }
}
