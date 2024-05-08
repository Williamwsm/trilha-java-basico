package iphone;

public class RepodutorMusicial {
    public String tocar() {
        return "play";
    }

    public String pausar() {
        return "pause";
    }

    public String selecionarMusica(String musica) {
        return "selecionar"+musica;
    }
}
