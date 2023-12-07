
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Them nhan vien</title>
    <!-- Latest compiled and minified CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Latest compiled JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        body {
            text-align: center;
        }

        h4 {
            text-align: center;
            font-size: 35px;
            color: #0cd8b0f0;
        }

        #form-create {
            margin-left: 15px;
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
        }

        label {
            float: left;
        }

        .confirm {
            display: flex;
            gap: 70px;
        }
    </style>
</head>

<body>
<h4>Login</h4>

<div class="form-container">
    <form action="login" id="form-create" method="POST">

        <div class="mb-3 col col-3">
            <label for="username" class="col-sm-2 col-form-label">Username</label>
            <input type="text" id="username" class="form-control" placeholder="Enter username" name="username" required>
        </div>
        <div class="col mb-3 col-3">
            <label for="password" class="col-sm-2 col-form-label">Password</label>
            <input type="password" id="password" class="form-control" placeholder="Enter password" name="password" required>
        </div>

        <div class="confirm">
            <button type="submit" class="btn btn-primary mb-2" name="login">Login</button>
            <a class="btn btn-warning mb-2" href="index.jsp">
                Homepage
            </a>
        </div>
        <div>
            <a href="register.jsp">Đăng ký tài khoản</a>
        </div>
    </form>
</div>
</body>

</html>