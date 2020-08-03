import java.io.File;
import java.io.IOException;

public class Teste_2 {
	public static void main(String[] args) throws IOException {
		File x = new File("teste.pdf");
		ExtractTextByPages text = new ExtractTextByPages(x, 81, 86);
		new FormatTable(text.getText(),6,11);
	}

}
