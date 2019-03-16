
import java.io.*;
import java.util.*;

class InnerClasses {
    // member inner class
    class x {
        void show() {
            System.out.println("member worked");
        }
    }

    // ststic inner class
    static class y {
        void show() {
            System.out.println("static class worked");
        }

    }

    void show() {
        System.out.println("anaonymous class");
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        InnerClasses ic = new InnerClasses();
        InnerClasses.x obj2 = ic.new x();
        obj2.show();

        InnerClasses.y obj3 = new InnerClasses.y();
        obj3.show();

        InnerClasses obj4 = new InnerClasses() {
            void show() {
                System.out.println("called through change");
            }
        };
        obj4.show();
    }
}
