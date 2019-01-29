import java.io.*;

class fileReading {
    public static void main(String args[]) throws IOException {
        File file = new File("C:\\Users\\Lenovo\\Downloads\\java\\Reading file\\new.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s = "";
        String fin = "";
        while ((s = br.readLine()) != null) {
            System.out.println(s);
            fin = fin + System.lineSeparator() + s;
        }
        System.out.println("converted into string:: " + fin);
    }
}