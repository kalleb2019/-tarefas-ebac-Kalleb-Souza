package application;

public class Controle {
    private double soma;

    /**
     *
     * @param, recebe um vetor como parametro;
     * @return faz o retorno da media das notas que estão no vetor para a variavel soma;
     */
    public double somaNotas(double[] notas){

        for(int i =0;i < notas.length;i++){
            this.soma += notas[i];
        }
        return this.soma /= notas.length;
    }
    /**
     *
     * faz a comparação do valor que esta na variavel soma;
     * @return retorna a sentença logica verdadeira;
     */
    public String estruturaCondicional(){
        if(this.soma >= 7)
            return "O Aluno está aprovado";
        else if (this.soma >=5)
            return "O Aluno está de recuperação";
        else
            return "O Aluno está reprovado";
    }
}
