package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entidades.funcionarios;

public class Program {

	public static void main(String[] args) {

		List<funcionarios> list = new ArrayList<>();
		String url = "C:\\Users\\Fam�lia Lustosa\\Documents\\fun.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(url))) {
			String funcionarioCSV = br.readLine();
			
			while (funcionarioCSV != null) {
				String campos[] = funcionarioCSV.split(",");	//Cria vetor de duas posi��es usando a virgula do csv para separar as linhas em duas posi��es
				list.add (new funcionarios(campos[0], Double.parseDouble(campos[1])));
				funcionarioCSV = br.readLine();
			}
			Collections.sort(list);
			for (funcionarios func : list) {
				System.out.println(func.getNome() + ", " + func.getSalario());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
