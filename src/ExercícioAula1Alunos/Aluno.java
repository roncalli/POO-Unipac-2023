package ExercícioAula1Alunos;

import java.util.Date;
import java.util.List;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class Aluno {
	private String nome;
	private Integer cpf;
	private Date dataNascimento;
	private String email;
	
	public Aluno(String nome, Integer cpf, Date dataNascimento, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.email = email;
	}
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer idadeAluno(Aluno aluno) {
		Integer idade = 0;
		LocalDate nascimento = getDataNascimento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		idade = Period.between(nascimento, LocalDate.now()).getYears();
		return idade;
	}
	
	public Aluno retornaMaisVelho (List<Aluno> aluno) {
		Aluno maisVelho = new Aluno();
		for (Aluno aux:aluno) {
			if (maisVelho.getDataNascimento() == null ||(aux.idadeAluno(aux)>maisVelho.idadeAluno(maisVelho))) {
				maisVelho = aux;
			}
		}
		
		return maisVelho;
	}
}
