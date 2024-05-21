package funcionalidades;

public class ReprodutorMusical {
    public void selecionarMusica(String musica){
        System.out.println("Selecionando a musica " + musica);
        tocar();
    }
    public void tocar(){
        System.out.println("tocando a musica selecionada");
    }
    public void pausar(){
        System.out.println("pausando a musica selecionada");
    }
}
