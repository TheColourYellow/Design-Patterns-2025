public class SearchVisitor implements FileSystemVisitor {

    private int matchCount = 0;

    @Override
    public void visit(FileSystemElement ele) {
        if (ele instanceof Directory) {
            Directory dir = (Directory) ele;
            if (dir.children.size() > 0) {
                for (FileSystemElement child : dir.children) {
                    if (child instanceof Directory) {
                        visit((Directory) child);
                    }
                    if (child instanceof File) {
                        if (((File) child).getName().endsWith(".txt")) {
                            matchCount++;
                        }
                    }
                }
            }
        }
        System.out.println("Found " + matchCount + " files");
    }
}
