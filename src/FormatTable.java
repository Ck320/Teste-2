import java.util.ArrayList;
import java.util.List;

public class FormatTable
{
	private String result;
	public FormatTable(String text,int startLine,int stopLine)
	{
		String[] line = text.split("\n");		
		
		List<String> lineList = new ArrayList<String>();
		for(int i=startLine;i<=stopLine;i++)
		{
			line[i]=line[i].substring(0,line[i].length()-2);
			if(line[i].equals("Padrão TISS - Componente Organizacional – junho de 2020"));
			else if(line[i].isBlank());
			else lineList.add(line[i]);			
		}
		
		for(int i=0;i<lineList.size();i++)
		{
			if(lineList.get(i).length()<3)lineList.remove(i);
			if(lineList.get(i).length()==3)
			{
				lineList.set(i,lineList.get(i)+" "+lineList.get(i+1)+" "+lineList.get(i+2));
				lineList.remove(i+1);
				lineList.remove(i+1);					
			}
			String[]aux=lineList.get(i).split(" ",2);
			
			System.out.println(aux[0]+"; "+aux[1]+";");
		}		
	}	
	
	public String getResult() {		
		return result;
	}
	
}
