<!DOCTYPE html>
<html>
<head>
  <title>Product Discount Calculator</title>
</head>
<body>
<h1>Product Discount Calculator</h1>
<form action="discount" method="POST">
  <label for="description">Product Description:</label>
  <input type="text" name="description" id="description"><br>

  <label for="listprice">List Price:</label>
  <input type="text" name="listprice" id="listprice"><br>

  <label for="discountpercent">Discount Percent:</label>
  <input type="text" name="discountpercent" id="discountpercent"><br>

  <input type="submit" value="Calculate Discount">
</form>
</body>
</html>