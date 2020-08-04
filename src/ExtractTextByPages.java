import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;


/*
 * @author Maurício Sugimoto Polloni
 * 
 * Classe responsavel por extrair as informacoes do arquivo pdf
 * e inseri-la em uma String
 */

public final class ExtractTextByPages
{
	private String text;
	public ExtractTextByPages(File arquivo,int start,int stop) throws IOException 	//start == pagina onde será iniciada a extração
	{																				//stop == ultima pagina a ser lida
		try
		{
			PDDocument document =PDDocument.load(arquivo);
			
			PDFTextStripper textStripper = new PDFTextStripper();
			textStripper.setStartPage(start);
			textStripper.setEndPage(stop);
			
			text = textStripper.getText(document);				
		}
		catch(IOException e){			
		}
	}
	
	public String getText()
	{
		return this.text;
	}
	
}