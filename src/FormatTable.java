import java.util.ArrayList;
import java.util.List;


/*
 * @author Maurício Sugimoto Polloni
 * 
 * Classe responsavel por formatar as tabelas identificando e
 * excluindo informações que não as pertemcem
 *
 */

public class FormatTable
{
	private String result="";
	public FormatTable(String text,int startLine,int stopLine)
	{
		String[] line = text.split("\n");	//Separa por linhas  a String recebida e a armazena
		
		List<String> lineList = new ArrayList<String>();
		
		for(int i=startLine;i<=stopLine;i++)
		{
			line[i]=line[i].substring(0,line[i].length()-2);//remove os 2 ultimos espaços de cada linha
			if(line[i].equals("Padrão TISS - Componente Organizacional – junho de 2020"));
			else if(line[i].isBlank());
			else lineList.add(line[i]);	//Caso a String não seja seja o titulo do documento ou esteja em branco, ela é adicionada a um ArrayList		
		}
		
		for(int i=0;i<lineList.size();i++)
		{
			if(lineList.get(i).length()<3)lineList.remove(i); //caso a linha contenha apenas o numero da pagina, ela é removida 
			
			if(lineList.get(i).length()==3) //as proximas funções irão corrigir a formatação de algumas linhas
			{
				lineList.set(i,lineList.get(i)+" "+lineList.get(i+1)+" "+lineList.get(i+2));
				lineList.remove(i+1);
				lineList.remove(i+1);					
			}
			String[]aux=lineList.get(i).split(" ",2);		//retorna o conteudo do ArrayList para uma Lista de String
			result = result+aux[0]+"; "+aux[1]+";"+"\n";	//concatena tudo em uma unica String, ja no formato CSV						
		}
	}	
	
	public String getResult() {		
		return result;
	}
	
}
