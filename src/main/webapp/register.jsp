<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 03/12/2023
  Time: 4:20 CH
  To change this template use File | Settings | File Templates.
--%>
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
<h4>Register</h4>

<div class="form-container">
    <form action="" id="form-create" method="POST">
        <div class="mb-3 col col-3">
            <label for="username" class="col-sm-2 col-form-label">Username</label>
            <input type="text" id="username" class="form-control" placeholder="Enter username" name="username">
        </div>
        <div class="mb-3 col col-3">
            <label for="email" class="col-sm-2 col-form-label">Email</label>
            <input type="text" id="email" class="form-control" placeholder="Enter email" name="email">
        </div>
        <div class="col mb-3 col-3">
            <label for="password" class="col-sm-2 col-form-label">Password</label>
            <input type="password" id="password" class="form-control" placeholder="Enter password" name="password">
        </div>
        <div class="col mb-3 col-3">
            <label for="confirmPassword" class="col-sm-2 col-form-label">RePassword</label>
            <input type="password" id="confirmPassword" class="form-control" placeholder="Enter confirmPassword" name="confirmPassword">
        </div>
        <div class="col mb-3 col-3">
            <label for="name" class="col-sm-2 col-form-label">Name</label>
            <input type="text" id="name" class="form-control" placeholder="Enter name" name="name">
        </div>
        <div class="col mb-3 col-3">
            <label for="phone" class="col-sm-2 col-form-label">Phone</label>
            <input type="text" id="phone" class="form-control" placeholder="Enter phone" name="phone">
        </div>
        <div class="col mb-3 col-3">
            <label for="roles">Roles</label>
            <select class="form-control" name="roles" id="roles">
                <option value="customer">Customer</option>
                <option value="employee">Employee</option>
            </select>
        </div>
        <div class="confirm">
            <button type="submit" class="btn btn-primary mb-2" name="register">Submit</button>
            <a class="btn btn-warning mb-2" href='login.jsp'>
                Cancel
            </a>
        </div>
    </form>
</div>
</body>

</html>
