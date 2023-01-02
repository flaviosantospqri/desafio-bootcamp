package br.com.flavio.desafio.dominio.model;

public class Curso extends Conteudo{

    private int cargaHoraria;


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    public Curso(String titulo, String descricao, int cargaHoraria) {
        super.setTitulo(titulo);
        super.setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public Curso() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * this.cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + super.getTitulo() + '\'' +
                ", descricao='" + super.getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}

