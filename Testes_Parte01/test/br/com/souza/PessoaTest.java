package br.com.souza;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PessoaTest {
    @Test
    public void validarLista(){

        List<Pessoa> listaPessoas = new ArrayList();
        String dados = "Julio-m,Ana-f,Julia-f,Roberta-f,Sandro-m,Fernanda-f,Micaela-f,Ana-f,João-m,Abreu-m,Sonia-f,Lucas-m,Roberto-m,Leticia-f,Marcos-m";
        String dadosDivididos[] = dados.split("[,-]+");
        for(int i = 0;i < dadosDivididos.length -1; i+=2){
            listaPessoas.add(new Pessoa(dadosDivididos[i],dadosDivididos[i+1]));
        }

        List<Pessoa> SomenteMulheres = listaPessoas.stream()
                .filter(p -> p.getSexo().equals("f"))
                .collect(Collectors.toList());

        SomenteMulheres.forEach(e -> Assert.assertEquals(e.getSexo(),"f"));
    }
}
