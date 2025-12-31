<%@ page import="java.util.*, main.java.model.Book, main.java.dao.BookDao" %>

<html>
<body>

<h2>Books List</h2>

<%
    BookDao main.java.dao = new BookDao();
    List<Book> list = dao.getAllBooks();
%>

<table border="1">
<tr>
    <th>ID</th>
    <th>Title</th>
    <th>Author</th>
    <th>Category</th>
    <th>Quantity</th>
    <th>Action</th>
</tr>

<%
for (Book b : list) {
%>
<tr>
    <td><%= b.getId() %></td>
    <td><%= b.getTitle() %></td>
    <td><%= b.getAuthor() %></td>
    <td><%= b.getCategory() %></td>
    <td><%= b.getQuantity() %></td>

    <td>
        <a href="editBook.jsp?id=<%= b.getId() %>">Edit</a>
        <a href="DeleteBookServlet?id=<%= b.getId() %>">Delete</a>
    </td>
</tr>
<%
}
%>

</table>

</body>
</html>
