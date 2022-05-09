import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class app {
    public static void main(String[] args) throws SQLException {
        List<ebook> ebookList = Queryebook.SelectAll();

        ebook ebook1 = new ebook(1008, "ConnecJava", "unknow", 88.88f, 88);

        for (ebook ebook : ebookList) {
            System.out.println(ebook.toString());
        }

        Queryebook.CreateNewebook(ebook1);
        List<ebook> ebookList1 = Queryebook.SelectAll();
        for (ebook ebook : ebookList1) {
            System.out.println(ebook.toString());
        }

        Queryebook.DeleteEbockByID(1008);

    }
}