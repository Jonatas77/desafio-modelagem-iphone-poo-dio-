# desafio-modelagem-iphone-poo-dio 
 desafio da DIO poo modelagem do iphone
classDiagram
    Iphone <|-- reprodutorMusical
    Iphone <|-- aparelhoTelefonico
    Iphone <|-- navegadorInternet
    Iphone: reprodutorMusical
    Iphone: aparelhoTelefonico
    Iphone: navegadorInternet

    class reprodutorMusical{
        + tocar()            
        + pausar()           
        + selecionarMusica(musica: String)
    }
    class aparelhoTelefonico{
        + ligar(numero: String) 
        + atender()            
        + iniciarCorreioVoz()  
    }
    class navegadorInternet{
        + exibirPagina(url: String)
        + adicionarNovaAba()        
        + atualizarPagina()         
    }
