import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.swing.JOptionPane;

/*
 * Classe responsavel por Zipar os arquivos CSVs
 */


public class zipFiles
{
	public zipFiles() throws IOException
	{
        List<String> srcFiles = Arrays.asList("quadro30.csv", "quadro31.csv","quadro32.csv");
        FileOutputStream fos = new FileOutputStream("Teste_Intuitive_Care_{Mauricio_Sugimoto_Polloni}.zip");
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        
        for (String srcFile : srcFiles)
        {
            File fileToZip = new File(srcFile);
            FileInputStream fis = new FileInputStream(fileToZip);
            ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
            zipOut.putNextEntry(zipEntry);
 
            byte[] bytes = new byte[1024];
            int length;
            
            while((length = fis.read(bytes)) >= 0)
            {
                zipOut.write(bytes, 0, length);
            }
            fis.close();
        }
        zipOut.close();
        fos.close();
        String message = "Teste_Intuitive_Care_{Mauricio_Sugimoto_Polloni}.zip has been created";
        JOptionPane.showMessageDialog(null,message);
    }
}
