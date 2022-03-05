package br.com.dio.desafio.dominio;

public abstract class Conteudo { //Quer dizer que nao consigo instanciar o conteúdo, por isso é abstract
   //Essa classe se chama classe mãe, e com ela vamos trabalhar a herança do codigo.

   protected static final double XP_PADRAO = 10d;

   private String titulo;
   private String descricao;

   public abstract double calcularXp();

    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
