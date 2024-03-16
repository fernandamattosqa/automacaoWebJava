package br.com.chronosacademy.media;

import org.junit.Test;

import static org.junit.Assert.*;


public class MediaTeste {
    @Test
    public void validaAprovado() {
        Media media = new Media();
        String resultado = media.calculaMedia(5.0, 5.0);
        assertEquals("Aprovado", resultado);
    }

    @Test
    public void validaReprovado() {
        Media media = new Media();
        String resultado = media.calculaMedia(4.9,3.8);
        assertEquals("Reprovado", resultado);
    }

}
