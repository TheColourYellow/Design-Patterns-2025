public class SizeCalculatorVisitor implements FileSystemVisitor {

    double size = 0;

    @Override
    public void visit(FileSystemElement ele) {
        /*if (ele instanceof File) {
            File file = (File) ele;
            size += file.getSize();
        }*/
        if (ele instanceof Directory) {
            Directory dir = (Directory) ele;
            if (dir.children.size() > 0) {
                for (FileSystemElement child : dir.children) {
                    //This if searches the whole system
                    //Without it only the specified directory is searched
                    /*
                    if (child instanceof Directory) {
                        visit((Directory) child);
                    }*/
                    if (child instanceof File) {
                        File file = (File) child;
                        size += file.getSize();
                    }
                }
            }
        }
        System.out.println(size + " megabytes");
    }

}
