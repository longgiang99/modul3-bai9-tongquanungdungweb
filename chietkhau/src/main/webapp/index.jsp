<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1>tinh chiet khau</h1>
<form action="discount" method="post">
  <label for="aaa">Product Description, Mô tả Sản phẩm </label>
  <input type="text" name="aaa" id="aaa"><br>
  <lable for="bbb">List Price, Bảng giá</lable>
  <label for="bbb"></label><input type="text" name="bbb" id="bbb"><br>
  <label for="ccc">Discount Percent,Phần trăm giảm giá: </label>
  <input type="text" name="ccc" id="ccc"><br>
  <input type="submit" value="tinh">
</form>

</body>
</html>