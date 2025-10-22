package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private Contacto contacto;
    private List<Correo> bandejaEnviados = new ArrayList<>();
    private List<Correo> bandejaRecibidos = new ArrayList<>();

    public Usuario(Contacto contacto){
        this.contacto = contacto;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public List<Correo> getBandejaEnviados() {
        return bandejaEnviados;
    }

    public List<Correo> getBandejaRecibidos() {
        return bandejaRecibidos;
    }

    public void recibirCorreo(Correo correo){
        bandejaRecibidos.add(correo);
    }
    public void enviarCorreo(Correo correo){
        bandejaEnviados.add(correo);
    }
}
