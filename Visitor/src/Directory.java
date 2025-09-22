import java.util.ArrayList;

public class Directory implements FileSystemElement {
    String name;
    //Directory parent;
    ArrayList<FileSystemElement> children;

    public Directory(String name) {
        this.name = name;
        children = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void addChild(FileSystemElement child) {
        children.add(child);
    }
    public void removeChild(FileSystemElement child) {
        children.remove(child);
    }
    public void getChildren() {
        System.out.println(this.name);
        for (FileSystemElement child : children) {
            if (child instanceof File) {
                File file = (File) child;
                System.out.println(file.getName());
            }
            if (child instanceof Directory) {
                Directory directory = (Directory) child;
                //System.out.println(directory.getName());
                directory.getChildren();
            }
        }
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
