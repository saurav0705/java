import java.io.*;

class fileCreation {
    public static void main(String args[]) throws IOException {

        String s = "this is 1st line" + System.lineSeparator() + "this is 2nd line";
        try {
            File file = new File("C:\\Users\\Lenovo\\Downloads\\java\\Creating file in Java\\text.txt");
            boolean fvar = file.createNewFile();
            if (fvar) {
                System.out.println("File has been created successfully");
                FileWriter writer = new FileWriter(file);
                System.out.println(s);
                writer.write(s);
                writer.write("2nd line added");
                writer.close();
            } else {
                System.out.println("File already present at the specified location");
            }
        } catch (Exception e) {
            System.out.println("Error in file creation.");
        }

    }
}