package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class CorreoTest {

    @Test
public void SePuedeCrearUnCorreo() {
    // Crear remitente y destinatarios como objetos Contacto
    Contacto remitente = new Contacto("Lautaro Romero", "romerostachlautaro@gmail.com");
    List<Contacto> destinatarios = List.of(
        new Contacto("Agustín Quetglas", "agustinquetglas19@gmail.com"),
        new Contacto("Juan Segovia", "juantomasegovia05@gmail.com")
    );

    // Crear correo con los contactos
    Correo correo1 = new Correo(
        "Prueba Correo",
        "Probando que se puede crear un correo",
        remitente,
        destinatarios
    );

    // Verificaciones
    assertEquals("Prueba Correo", correo1.getAsunto());
    assertEquals("Probando que se puede crear un correo", correo1.getContenido());
    assertEquals("romerostachlautaro@gmail.com", correo1.getRemitente().getEmail());
    assertTrue(
        correo1.getDestinatarios()
        .stream()
        .anyMatch(d -> d.getEmail().equals("agustinquetglas19@gmail.com"))
    );
}
}
