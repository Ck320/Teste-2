public class FormatTable
{
	String result;
	public FormatTable(String text,int startLine,int stopLine)
	{
		String[] line = text.split("\n");
		
		for(int i=startLine;i<=stopLine;i++)
		{
			System.out.println(line[i]);
		}
	}
	
	public String getResult() {
		return result;
	}
	
}
