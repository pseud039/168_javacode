<%@ page import="main.java.dao.BookDao, main.java.model.Book" %>

<%
    int id = Integer.parseInt(request.getParameter("id"));
    BookDao main.java.dao = new BookDao();
    Book book = dao.getBookById(id);
%>

<html>
<body>

<h2>Edit Book</h2>

<form action="UpdateBookServlet" method="post">
    <input type="hidden" name="id" value="<%= book.getId() %>">

    Title: <input type="text" name="title" value="<%= book.getTitle() %>" required><br><br>
    Author: <input type="text" name="author" value="<%= book.getAuthor() %>"><br><br>
    Category: <input type="text" name="category" value="<%= book.getCategory() %>"><br><br>
    Quantity: <input type="number" name="quantity" value="<%= book.getQuantity() %>" required><br><br>

    <button type="submit">Update</button>
</form>

</body>
</html>
