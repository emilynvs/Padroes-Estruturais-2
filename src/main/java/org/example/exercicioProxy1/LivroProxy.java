package org.example.exercicioProxy1;

public class LivroProxy implements Livro{
    private TipoUsuario tipo;
    private  LivroDigital livro;

    public LivroProxy(TipoUsuario tipo, LivroDigital livro) {
        this.tipo = tipo;
        this.livro = livro;
    }

    @Override
    public void ler() {
        if(tipo == TipoUsuario.COMUM){
            System.out.println("Usuário Comum");
            System.out.println(livro.getTitulo());
            System.out.println("Assine o plano Premium para acessar o conteúdo completo.");
        }else{
            System.out.println("Usuário Premium");
            livro.ler();
        }
    }
}
