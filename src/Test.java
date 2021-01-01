import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var lisDocument = new ArrayList<DocumentStudent>();
        Methods methods = new Methods();
        var choice = 0;
        do {
            System.out.println("Them Hoc Sinh");
            System.out.println("Hien Thi Thong Tin");
            System.out.println("Tim Theo Nam Sinh");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    lisDocument.add(methods.ceat(input));
                    break;
                case 2:
                    if (lisDocument.size() > 0) {
                        methods.disPlay(lisDocument);
                    } else {
                        System.out.println("Danh Sach Rong");
                    }
                    break;
                case 3:
                    if (lisDocument.size() > 0) {
                        methods.search(lisDocument);
                        methods.disPlay(lisDocument);
                    } else {
                        System.out.println("Danh Sach Rong");
                    }
                    break;
            }
        } while (true);
    }
}
