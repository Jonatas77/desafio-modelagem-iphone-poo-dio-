package src;

class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorIternet {


    public void tocar() {
        System.out.println("Reproduzindo música...");
    }


    public void pausar() {
        System.out.println("Música pausada.");
    }


    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }


    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }


    public void atender() {
        System.out.println("Atendendo chamada...");
    }


    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }


    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }


    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }


    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Método principal para teste
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();

        // Testando funcionalidades
        meuiPhone.selecionarMusica("Imagine Dragons - Believer");
        meuiPhone.tocar();
        meuiPhone.pausar();

        meuiPhone.ligar("123456789");
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();

        meuiPhone.exibirPagina("https://www.google.com");
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();
    }
}
