import java.io.*;
import java.util.*;
import javax.lang.model.util.ElementScanner6;

class hashmap {
    public static void commands() throws IOException {
        String s = "";
        HashMap<Integer, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter command::");
        s = br.readLine();
        String cmd[] = s.split(" ");
        for (int i = 0; i < cmd.length; i++) {
            if (cmd[i].compareTo("a") == 0) {
                map.put(Integer.parseInt(cmd[i + 1]), Integer.parseInt(cmd[i + 2]));
                i = i + 2;
            } else if (cmd[i].compareTo("b") == 0) {
                if (map.containsKey(Integer.parseInt(cmd[i + 1]))) {
                    System.out.println(map.get(Integer.parseInt(cmd[i + 1])));
                }
                i++;
            } else if (cmd[i].compareTo("c") == 0) {
                System.out.println(map.size());
            } else if (cmd[i].compareTo("d") == 0) {
                if (map.containsKey(Integer.parseInt(cmd[i + 1]))) {
                    map.remove(Integer.parseInt(cmd[i + 1]));
                } else {
                    System.out.println("No element present");
                }
                i++;
            } else {
                System.out.println("no choice");

            }
        }
    }

    public static void main(String[] args) throws IOException {
        int n = 0;
        String inp = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter cases: ");
        inp = br.readLine();
        n = Integer.parseInt(inp);
        for (int i = 0; i < n; i++) {
            commands();
        }
    }
}