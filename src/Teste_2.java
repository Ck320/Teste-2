import java.io.File;
import java.io.IOException;

/*
 * @author Maurício Sugimoto Polloni
 * 
 * Classe principal, responsavel por organizar a ordem das funções
 *
 */

public class Teste_2 {
	public static void main(String[] args) throws IOException
	{
		File x = new File("Padrao_TISS_Componente_Organizacional_202006.pdf");		
		ExtractTextByPages text = new ExtractTextByPages(x, 81, 87); // as tabelas se encontram entre as pagicas 81 e 87
		
		FormatTable quadro30 = new FormatTable(text.getText(),6,11); 	//as informações do quadro 30 se encontram entre as linhas 6 e 11 do texto extraido
		FormatTable quadro31 = new FormatTable(text.getText(),32,197);	//as informações do quadro 31 se encontram entre as linhas 32 e 197 do texto extraido
		FormatTable quadro32 = new FormatTable(text.getText(),238,241);	//as informações do quadro 32 se encontram entre as linhas 238 e 241 do texto extraido
		
		new CreateFile("quadro30", quadro30.getResult());
		new CreateFile("quadro31", quadro31.getResult());
		new CreateFile("quadro32", quadro32.getResult());
		
		new zipFiles();		
	}

}
