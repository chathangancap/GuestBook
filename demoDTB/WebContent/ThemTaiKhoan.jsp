<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Them tai khoan</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Them thông tin thành viên</h2>
  <form class="form-horizontal" action="ThemTK" method="post">
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">id:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="pwd" name="ID" placeholder="Nhập vào id:" >
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Tên:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="pwd" name="name" placeholder="Nhập vào tên:">
      </div>
    </div>
  <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">message:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="pwd" name="message" placeholder="Nhập vào message:" >
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Thêm</button>
      </div>
    </div>
  </form>
</div>

</body>
</html>