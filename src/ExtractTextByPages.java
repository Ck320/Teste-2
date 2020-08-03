import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;


public final class ExtractTextByPages
{
	private String text;
	public ExtractTextByPages(File arquivo,int start,int stop) throws IOException
	{
		try
		{
			PDDocument document =PDDocument.load(arquivo);
			
			PDFTextStripper tStripper = new PDFTextStripper();
			tStripper.setStartPage(start);
			tStripper.setEndPage(stop);
			
			text = tStripper.getText(document);		
			
			System.out.println(text);
		}
		catch(IOException e){			
		}

	}
	public String getText()
	{
		return this.text;
	}
	
}