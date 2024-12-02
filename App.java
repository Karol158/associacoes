import java.util.ArrayList;

import cadastrousario.Aluno;
import cadastrousario.NotaSelecao;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1= new Aluno(nome:"Maria",cpf:"0909090",idade:15,emailPessoal:"maria@gmail.com",emailInstitucional:"msamsmasm@gmail.com",senha:"hushajkshkajhs");
        Escola escolaFundamental=new Escola(id_mec:"12222",nome:"Escolinha de Pinóquio",endereco:"Rua sei lá",ano_conclusao:2022,contato:"Maria tel:873827382738");

        aluno1.setEscolaAnterior(escolaFundamental);
        aluno1.getEscolaAnterior().imprimeDados();
        ArrayList<NotaSelecao>notasSel=new ArrayList<NotaSelecao>();
        NotaSelecao notaPort=new NotaSelecao(null, 0, false)
        notasSel.add(notaPort)
        notasSel.add(notaMat);
        aluno1.setNotaSelecao(notasSel);
        System.out.println(aluno1.getNome());

    }
}
  