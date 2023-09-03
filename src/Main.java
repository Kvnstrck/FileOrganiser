public class Main {
    //args: 0: path to the directory the files should be sorted in
    //args: 1: name of the sub directory
    //args: 2: file ending of the files to be sorted
    public static void main(String[] args) {
        DirectoryHandling newFile = new DirectoryHandling();
        newFile.createDirectory(args[1], args[0]);
        Sorting sort = new Sorting();
        String[] files = sort.sortFiles(args[0], args[2]);
        CopyHandling copyHandling = new CopyHandling();
        copyHandling.copyFiles(args[0], files, args[1]);
    }
}