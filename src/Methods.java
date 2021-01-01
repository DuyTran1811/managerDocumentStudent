
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Methods {
    String format = "dd/MM/yyyy";
    SimpleDateFormat dateFormat = new SimpleDateFormat(format);

    public DocumentStudent ceat(Scanner input) {
        System.out.println("Nhap Ten");
        var name = input.nextLine();
        System.out.println("Nhap Ngay Sinh Vi Du 20/20/20");
        Date dateOfBirth = null;
        try {
            dateOfBirth = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Nhap Dia Chi");
        var address = input.nextLine();
        System.out.println("Nhap Ten Lop");
        var className = input.nextLine();
        System.out.println("Nhap Ten Khoa Hoc");
        var courseName = input.nextLine();
        System.out.println("Hoc Ky");
        var semester = input.nextLine();
        Student student = new Student(name, dateOfBirth, address);
        return new DocumentStudent(className, courseName, semester, student);
    }

    public void disPlay(ArrayList<DocumentStudent> lisDocument) {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n",
                "Ho Va Ten", "Ngay Sinh", "Dia Chi", "Ten Lop", "Khoa Hoc", "Hoc Ky");
        for (var index : lisDocument) {
            System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n",
                    index.getStudent().getFullName(), dateFormat.format(index.getStudent().getDateOfBirth()),
                    index.getStudent().getAddress(), index.getClassName(), index.getCourseOfStudy(),
                    index.getSemester());
        }
    }

    public ArrayList<DocumentStudent> search(ArrayList<DocumentStudent> lisDocument) {
        ArrayList<DocumentStudent> list = new ArrayList<>();
        Date date2 = null;
        try {
            date2 = dateFormat.parse("01/10/1985");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (var index : lisDocument) {
            if (index.getStudent().getDateOfBirth().before(date2)){
                list.add(index);
            }
        }
        return list;
    }
}
