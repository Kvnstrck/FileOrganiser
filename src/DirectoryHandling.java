import java.io.File;
import java.nio.file.Path;

public class DirectoryHandling {

    /**
     * Creates an empty directory with the specified name
     * @param name the name of the directory
     * @return the path the directory lies in
     */
    public String createDirectory(String name, String path){
        File file = new File(path+"/"+name);
        return file.mkdirs()?file.getAbsolutePath():null;
    }
}
