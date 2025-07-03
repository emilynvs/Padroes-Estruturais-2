package org.example.exercicioFacade1;

public class ReprodutorFacade {
    private DecodificadorDeAudio decodificadorDeAudio;
    private DecodificadorDeVideo decodificadorDeVideo;
    private CarregadorDeArquivo carregadorDeArquivo;

    public ReprodutorFacade(DecodificadorDeAudio decodificadorDeAudio, DecodificadorDeVideo decodificadorDeVideo, CarregadorDeArquivo carregadorDeArquivo) {
        this.decodificadorDeAudio = decodificadorDeAudio;
        this.decodificadorDeVideo = decodificadorDeVideo;
        this.carregadorDeArquivo = carregadorDeArquivo;
    }

    public void reproduzindoArquivo(Reprodutor reprodutor){
        decodificadorDeAudio.decodificar();
        decodificadorDeVideo.decodificar();

        reprodutor.reproduzir();

    }
}
