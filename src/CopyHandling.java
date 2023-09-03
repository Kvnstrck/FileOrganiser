import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyHandling {
    public void copyFiles(String path ,String[] files,String fileEnding){
        //make path objects

        for (String string:files) {
            if(string==null)break;
            Path pathInDirectory = new File(path+"/"+string).toPath();
            Path subDirectoryPath = new File(path+"/"+fileEnding+"/"+string).toPath();
            try {
                Files.move(pathInDirectory,subDirectoryPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
