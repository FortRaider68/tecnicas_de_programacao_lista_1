package persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.LineNumberReader;

import jogo.Relatorio;
import presentation.GUI.Aviso;

public class RelatorioArquivo {
	
	private File relatorio;
	
	public RelatorioArquivo() {
		this.relatorio = new File("relatorio");
		
		if(!this.relatorio.exists()) {
			try {
				this.relatorio.createNewFile();
			} catch (Exception e) {
				System.out.println("Não foi possível criar o arquivo");
			}
		}
	}
	
	public Object [][] lerRelatorios() {
		int nLinhas = numeroDeLinhas();
		Object [][] lista = new Object[nLinhas][9];
		try {
			FileReader fr = new FileReader(this.relatorio);
			BufferedReader br = new BufferedReader(fr);
			
			for(int i=0;i<nLinhas-1;i++) {
				String linha = br.readLine();
				String [] campos = linha.split(";");
				
				for(int j=0;j<campos.length;j++) {
					lista[i][j] = campos[j];
				}
			}
			
			fr.close();
		} catch (Exception e) {
			new Aviso("Erro ao ler o arquivo de persistência ("+e+")");
		}
		return lista;
	}
	
	public void gravarRelatorio(Relatorio relatorio) {
		try {
			FileWriter fw = new FileWriter(this.relatorio,true);
			String linha = "";
			for (Object campo : relatorio.getRelatorio()) {
				linha += campo.toString()+";";
			}
			linha+="\n";
			fw.append(linha);
			fw.close();
			
		} catch (Exception e) {
			new Aviso("Erro ao gravar no arquivo de persistência ("+e+")");
		}
	}
	
	public int numeroDeLinhas(){
		try {
			LineNumberReader lr = new LineNumberReader(new FileReader(this.relatorio));
			lr.skip(Long.MAX_VALUE);
			int nLinhas = lr.getLineNumber()+1;
			lr.close();
			return nLinhas;
		} catch (Exception e) {
			new Aviso("Erro ao ler o arquivo("+e+")");
		}
		return 0;
	}
}
