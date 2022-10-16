//Classe Empregado
package apds_q2;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import apds_q2.Pessoa;
public class Empregado {

	public static void main(String[] args) {
		int opcao, laco = 0;
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Pessoa Carla = new Pessoa("Carla", "01/01/1995", "01/07/2014", 3, "Ecocil", " Amanco", "Rede Unilar");
		Pessoa Sara = new Pessoa("Sara", "01/05/2000", "01/05/2021", 2, "Supermercado Favorito", "Rede-Mais");
		Pessoa Pedro = new Pessoa("Pedro", "02/12/2010", "07/02/2022" ,5, "3M", "Vonder", "Belzer", "Minipa", "Makita");
		Pessoa Jair = new Pessoa("Jair", "30/10/2006", "08/11/2018", 1, "SMS - Segurança LTDA");
		Pessoa Alfredo = new Pessoa("Alfredo", "17/05/2015", "16/05/2021", 2, "IBM", "Engehall");
			
		while(laco == 0) {
			System.out.println("Qual pessoa você deseja ter informações:");
			System.out.println("1 - Carla, 2, Sara, 3 - Pedro, 4 - Jair, 5 - Alfredo");
			opcao = ler.nextInt();
			
			switch(opcao) {
			case 1: System.out.println("Nome: "+ Carla.nome);
			System.out.println("Data Começo: "+ Carla.dataComeco);
			System.out.println("Data fim: "+ Carla.dataFim);
			System.out.println("Quantidade de empresas trabalhadas: "+ Carla.qtdEmpresas);
			System.out.println("Empresas trabalhadas: "+ Carla.empresasTrabalhadas);
			break;
			case 2: System.out.println("Nome: "+ Sara.nome);
			System.out.println("Data Começo: "+ Sara.dataComeco);
			System.out.println("Data fim: "+ Sara.dataFim);
			System.out.println("Quantidade de empresas trabalhadas: "+ Sara.qtdEmpresas);
			System.out.println("Empresas trabalhadas: "+ Sara.empresasTrabalhadas);
			break;
			case 3: System.out.println("Nome: "+ Pedro.nome);
			System.out.println("Data Começo: "+ Pedro.dataComeco);
			System.out.println("Data fim: "+ Pedro.dataFim);
			System.out.println("Quantidade de empresas trabalhadas: "+ Pedro.qtdEmpresas);
			System.out.println("Empresas trabalhadas: "+ Pedro.empresasTrabalhadas);
			break;
			case 4: System.out.println("Nome: "+ Jair.nome);
			System.out.println("Data Começo: "+ Jair.dataComeco);
			System.out.println("Data fim: "+ Jair.dataFim);
			System.out.println("Quantidade de empresas trabalhadas: "+ Jair.qtdEmpresas);
			System.out.println("Empresas trabalhadas: "+ Jair.empresasTrabalhadas);
			break;
			case 5: System.out.println("Nome: "+ Alfredo.nome);
			System.out.println("Data Começo: "+ Alfredo.dataComeco);
			System.out.println("Data fim: "+ Alfredo.dataFim);
			System.out.println("Quantidade de empresas trabalhadas: "+ Alfredo.qtdEmpresas);
			System.out.println("Empresas trabalhadas: "+ Alfredo.empresasTrabalhadas);
			break;
			default: System.out.println("Digite um número válido");
			}
		}
		
	}

}




//Classe Pessoa
package apds_q2;
import java.text.SimpleDateFormat;

public class Pessoa {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public String nome;
	public String dataComeco;
	public String dataFim;
	public int qtdEmpresas;
	public String[] empresasTrabalhadas;
	
	
	public Pessoa(String nome, String dataComeco, String dataFim, int qtdEmpresas,
			String... empresasTrabalhadas) {
		super();
		this.nome = nome;
		this.dataComeco = dataComeco;
		this.dataFim = dataFim;
		this.qtdEmpresas = qtdEmpresas;
		this.empresasTrabalhadas = empresasTrabalhadas;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDataComeco() {
		return dataComeco;
	}


	public void setDataComeco(String dataComeco) {
		this.dataComeco = dataComeco;
	}


	public String getDataFim() {
		return dataFim;
	}


	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}


	public int getQtdEmpresas() {
		return qtdEmpresas;
	}


	public void setQtdEmpresas(int qtdEmpresas) {
		this.qtdEmpresas = qtdEmpresas;
	}


	public String[] getEmpresasTrabalhadas() {
		return empresasTrabalhadas;
	}


	public void setEmpresasTrabalhadas(String[] empresasTrabalhadas) {
		this.empresasTrabalhadas = empresasTrabalhadas;
	}



	
}

