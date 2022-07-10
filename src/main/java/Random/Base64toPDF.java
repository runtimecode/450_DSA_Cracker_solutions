package Random;

import sun.misc.IOUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64toPDF {

    public static void main(String[] args) {
        File file = new File("filePath");

        Charset charset = StandardCharsets.UTF_8;

        try (InputStream in = new FileInputStream(file))
        {
            byte[] bytes = new byte[(int) file.length()];
            in.read(bytes);

            String content = new String(bytes, charset);
            byte[] decoder = Base64.getDecoder().decode(content);
            try{
                new FileOutputStream(new File("./test.pdf")).write(decoder);
            }catch (Exception e){
                e.printStackTrace();
            }


            System.out.println("PDF File Saved");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
