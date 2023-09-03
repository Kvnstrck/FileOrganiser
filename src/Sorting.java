import java.io.File;
import java.util.NoSuchElementException;

public class Sorting {

    /**
     * sorts the files via the fileEndings into a String array
     * @param path path of the directory to sort
     * @param fileEnding the file ending that should be sorted into the subdirectory
     * @return the string array with the files of the specified file ending
     * @throws NullPointerException the path to the directory to be sorted is invalid
     * @throws NoSuchElementException the directory is empty
     */
    public String[] sortFiles(String path, String fileEnding) throws NullPointerException,NoSuchElementException {
        String[] files = new File(path).list();

        if (files == null) throw new NullPointerException("The specified Path is not a valid directory");
        if (files[0].isEmpty()) throw new NoSuchElementException("The specified directory is empty!");

        int numberOfFiles = files.length;

        String[] filesWithEnding = new String[numberOfFiles];

        int endingIndex = 0;
        for (String file : files) {
            //get all files and sort out the ones with the matching file ending
            int index = file.lastIndexOf('.');
            if (index > 0) {
                String extension = file.substring(index + 1);
                if (extension.equals(fileEnding)) {
                    filesWithEnding[endingIndex] = file;
                    endingIndex++;
                }
            }
        }
        System.out.println(filesWithEnding[0]);
        return filesWithEnding;
    }
}
