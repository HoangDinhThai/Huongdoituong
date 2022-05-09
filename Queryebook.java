import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Queryebook {
    public static List<ebook> SelectAll() throws SQLException {
        List<ebook> ebookList = new ArrayList<>();
        Connection connection = JDBC.Connection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM books");
        while (resultSet.next()) {
            ebook ebook = new ebook(resultSet.getInt("id"), resultSet.getString("title"), resultSet.getString("author"),
                    resultSet.getFloat("price"), resultSet.getInt("qty"));
            ebookList.add(ebook);
        }
        connection.close();
        return ebookList;
    }

    public static void CreateNewebook(ebook ebook) throws SQLException {
        Connection connection = JDBC.Connection();
        String query = "insert into books values (?,?,?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, ebook.getId());
        preparedStatement.setString(2, ebook.getTitle());
        preparedStatement.setString(3, ebook.getAuthor());
        preparedStatement.setFloat(4, ebook.getPrice());
        preparedStatement.setInt(5, ebook.getQty());

        int effectedRecordAmount = preparedStatement.executeUpdate();
        System.out.println("Add new ebook successfully !");
        connection.close();
    }

    public static void DeleteEbockByID(int id) throws SQLException {
        Connection connection = JDBC.Connection();
        String query = "DELETE FROM books where `id` = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        int effectedRecordAmount = preparedStatement.executeUpdate();
        System.out.println("successfully delete ebooks with id = " + id);
        connection.close();
    }

}