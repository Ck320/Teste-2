import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * @author Maur�cio Sugimoto Polloni
 * 
 * Classe responsavel por criar os arquivos CSVs e
 * escrever as informa��es neles
 *
 */

public class CreateFile
{
	public CreateFile(String name,String content)
	{
		FileWriter fw;
		try
		{
			fw = new FileWriter(name+".csv");
			fw.write(content);
			fw.close();
			String message = "File "+name+" has been created !";
			JOptionPane.showMessageDialog(null,message);
		}
		catch (IOException e){			
			e.printStackTrace();
		}		
	}	
}
