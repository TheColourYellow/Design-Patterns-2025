public class Main {
    public static void main(String[] args) {
        File file1 = new File("file.txt", 8.23);
        File file2 = new File("file2.txt", 2.63);
        File file3 = new File("file3.png", 5.83);
        File file4 = new File("file4.mp4", 1.23);
        File file5 = new File("file5.txt", 33.23);

        Directory root = new Directory("root");
        Directory importantFile = new Directory("secret");
        root.addChild(file1);
        root.addChild(file2);
        root.addChild(importantFile);
        importantFile.addChild(file3);
        root.addChild(file4);
        root.addChild(file5);

        //root.getChildren();

        SizeCalculatorVisitor visitor1 = new SizeCalculatorVisitor();
        SearchVisitor visitor2 = new SearchVisitor();
        root.accept(visitor1);
        root.accept(visitor2);
    }
}
