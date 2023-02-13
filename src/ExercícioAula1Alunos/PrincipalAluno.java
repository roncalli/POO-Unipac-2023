package ExercícioAula1Alunos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class PrincipalAluno {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		//Instanciando os 3 alunos
		Aluno aluno1 = new Aluno("Felipe Roncalli", 123456789, formato.parse("15/04/1986"), "felipecarneiro@unipac.br");
		Aluno aluno2 = new Aluno("Ciclano", 222222222, formato.parse("01/02/1952"), "ciclano@unipac.br");
		Aluno aluno3 = new Aluno("Beltrano", 111111111, formato.parse("27/08/2015"), "beltrano@unipac.br");
	
	//Imprimindo os dados dos alunos
		
		System.out.println("Dados do Aluno 1 \n");
		System.out.println("Nome: "+aluno1.getNome());
		System.out.println("CPF: "+aluno1.getCpf());
		System.out.println("Data de Nascimento"+formato.format(aluno1.getDataNascimento()));
		System.out.println("E-mail: "+aluno1.getEmail());
		System.out.println("\n\n\n\n");
		
		System.out.println("Dados do Aluno 2 \n");
		System.out.println("Nome: "+aluno2.getNome());
		System.out.println("CPF: "+aluno2.getCpf());
		System.out.println("Data de Nascimento"+formato.format(aluno2.getDataNascimento()));
		System.out.println("E-mail: "+aluno2.getEmail());
		System.out.println("\n\n\n\n");
		
		System.out.println("Dados do Aluno 3 \n");
		System.out.println("Nome: "+aluno3.getNome());
		System.out.println("CPF: "+aluno3.getCpf());
		System.out.println("Data de Nascimento"+formato.format(aluno3.getDataNascimento()));
		System.out.println("E-mail: "+aluno3.getEmail());
		System.out.println("\n\n\n\n");
	
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		
		Aluno maisVelho = new Aluno();
		maisVelho = maisVelho.retornaMaisVelho(alunos);
		System.out.println("O Aluno mais velho é "+maisVelho.getNome()+" com "+maisVelho.idadeAluno(maisVelho)+" anos");
	}

		

}
