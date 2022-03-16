package app;


import entites.Pessoa;
import entites.Professor;
import entites.Aluno;
import entites.Bolsista;

public class Aplication {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		Professor prof = new Professor();
		Aluno a = new Aluno();
		Bolsista b = new Bolsista();
		
		//Me perdi aqui
		p.setNome("Adão");
		p.setIdade(27);
		p.setSexo("Masculino");
		
		prof.setSalario(3.800f);
		prof.setFormacao("Matemática");
		
		a.setMat(853746239);
		a.setCurso("Informática");
		
		b.setDisciplina("JavaScript");
		
		
		
		
		
		
		

	}

}
