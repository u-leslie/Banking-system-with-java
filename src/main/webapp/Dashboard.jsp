<%--<%@ page import="dao.DBconn" %>--%>
<%--<%@ page import="beans.UserBean" %>--%>
<%--<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <meta charset="UTF-8">--%>
<%--    <title>Deposit Money</title>--%>
<%--    <!-- Add your CSS styles here -->--%>
<%--    <style>--%>
<%--        body {--%>
<%--            font-family: 'Arial', sans-serif;--%>
<%--            background-color: #f8f9fa;--%>
<%--            margin: 0;--%>
<%--            padding: 0;--%>
<%--            display: flex;--%>
<%--            align-items: center;--%>
<%--            justify-content: center;--%>
<%--            height: 100vh;--%>
<%--        }--%>

<%--        .container {--%>
<%--            max-width: 600px;--%>
<%--            padding: 20px;--%>
<%--            background-color: #fff;--%>
<%--            border-radius: 5px;--%>
<%--            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);--%>
<%--            text-align: center;--%>
<%--        }--%>

<%--        h2 {--%>
<%--            color: #28a745;--%>
<%--        }--%>

<%--        form {--%>
<%--            margin-top: 20px;--%>
<%--        }--%>

<%--        label {--%>
<%--            display: block;--%>
<%--            margin-bottom: 8px;--%>
<%--            color: #555;--%>
<%--        }--%>

<%--        input {--%>
<%--            width: 100%;--%>
<%--            padding: 10px;--%>
<%--            margin-bottom: 15px;--%>
<%--            box-sizing: border-box;--%>
<%--        }--%>

<%--        button {--%>
<%--            background-color: #4caf50;--%>
<%--            color: #fff;--%>
<%--            padding: 12px;--%>
<%--            border: none;--%>
<%--            border-radius: 3px;--%>
<%--            cursor: pointer;--%>
<%--        }--%>

<%--        button:hover {--%>
<%--            background-color: #45a049;--%>
<%--        }--%>
<%--    </style>--%>

<%--&lt;%&ndash;    <style>&ndash;%&gt;--%>
<%--&lt;%&ndash;        body {&ndash;%&gt;--%>
<%--&lt;%&ndash;            font-family: 'Arial', sans-serif;&ndash;%&gt;--%>
<%--&lt;%&ndash;            background-color: #f0f0f0;&ndash;%&gt;--%>
<%--&lt;%&ndash;        }&ndash;%&gt;--%>

<%--&lt;%&ndash;        .container {&ndash;%&gt;--%>
<%--&lt;%&ndash;            max-width: 600px;&ndash;%&gt;--%>
<%--&lt;%&ndash;            margin: 50px auto;&ndash;%&gt;--%>
<%--&lt;%&ndash;            padding: 20px;&ndash;%&gt;--%>
<%--&lt;%&ndash;            background-color: #fff;&ndash;%&gt;--%>
<%--&lt;%&ndash;            border-radius: 5px;&ndash;%&gt;--%>
<%--&lt;%&ndash;            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);&ndash;%&gt;--%>
<%--&lt;%&ndash;        }&ndash;%&gt;--%>

<%--&lt;%&ndash;        h2 {&ndash;%&gt;--%>
<%--&lt;%&ndash;            color: #333;&ndash;%&gt;--%>
<%--&lt;%&ndash;        }&ndash;%&gt;--%>

<%--&lt;%&ndash;        form {&ndash;%&gt;--%>
<%--&lt;%&ndash;            margin-top: 20px;&ndash;%&gt;--%>
<%--&lt;%&ndash;        }&ndash;%&gt;--%>

<%--&lt;%&ndash;        label {&ndash;%&gt;--%>
<%--&lt;%&ndash;            display: block;&ndash;%&gt;--%>
<%--&lt;%&ndash;            margin-bottom: 8px;&ndash;%&gt;--%>
<%--&lt;%&ndash;            color: #555;&ndash;%&gt;--%>
<%--&lt;%&ndash;        }&ndash;%&gt;--%>

<%--&lt;%&ndash;        input {&ndash;%&gt;--%>
<%--&lt;%&ndash;            width: 100%;&ndash;%&gt;--%>
<%--&lt;%&ndash;            padding: 8px;&ndash;%&gt;--%>
<%--&lt;%&ndash;            margin-bottom: 15px;&ndash;%&gt;--%>
<%--&lt;%&ndash;            box-sizing: border-box;&ndash;%&gt;--%>
<%--&lt;%&ndash;        }&ndash;%&gt;--%>

<%--&lt;%&ndash;        button {&ndash;%&gt;--%>
<%--&lt;%&ndash;            background-color: #4caf50;&ndash;%&gt;--%>
<%--&lt;%&ndash;            color: #fff;&ndash;%&gt;--%>
<%--&lt;%&ndash;            padding: 10px;&ndash;%&gt;--%>
<%--&lt;%&ndash;            border: none;&ndash;%&gt;--%>
<%--&lt;%&ndash;            border-radius: 3px;&ndash;%&gt;--%>
<%--&lt;%&ndash;            cursor: pointer;&ndash;%&gt;--%>
<%--&lt;%&ndash;        }&ndash;%&gt;--%>

<%--&lt;%&ndash;        button:hover {&ndash;%&gt;--%>
<%--&lt;%&ndash;            background-color: #45a049;&ndash;%&gt;--%>
<%--&lt;%&ndash;        }&ndash;%&gt;--%>
<%--&lt;%&ndash;    </style>&ndash;%&gt;--%>
<%--</head>--%>
<%--<body>--%>
<%--<div class="container">--%>
<%--    <h2>Welcome to Back✨🎉🎉</h2>--%>


<%--</div>--%>

<%--     <%--%>
<%--         String username = request.getParameter("username");--%>

<%--         if (username != null && !username.isEmpty()) {--%>
<%--             // Use the username to get the balance or perform other actions--%>
<%--     %>--%>
<%--        <div class="container">--%>
<%--            <h2>Account Balance</h2>--%>
<%--            <p>Your Balance:--%>
<%--                <span>--%>
<%--                    <%--%>
<%--                        // Replace this with your logic to get the balance based on the username--%>
<%--                        double balance = DBconn.checkBalance(username);--%>
<%--                    %>--%>
<%--                    <%= balance %>--%>
<%--                </span>--%>
<%--            </p>--%>
<%--        </div>--%>
<%--<%--%>
<%--} else {--%>
<%--%>--%>
<%--        <div class="container">--%>
<%--            <p>Username is not provided. <!-- Add more details or redirection logic here --></p>--%>
<%--        </div>--%>
<%--<%--%>
<%--    }--%>
<%--%>--%>




<%--<div class="container">--%>
<%--    <h2>Deposit Money</h2>--%>
<%--    <form action="deposit" method="post">--%>
<%--        <label for="amount">Enter amount to deposit:</label>--%>
<%--        <input type="number" id="amount" name="amount" required min="0" step="0.01">--%>
<%--        <!-- Add a span for displaying messages -->--%>
<%--        <span id="depositMessage" style="color: green;"></span>--%>

<%--        <button type="submit">Deposit</button>--%>
<%--    </form>--%>
<%--</div>--%>
<%--<div class="container">--%>
<%--    <h2>Withdrawal</h2>--%>
<%--    <form action="withdraw" method="post">--%>
<%--        <label for="withdrawalAmount">Enter amount to withdraw:</label>--%>
<%--        <input type="text" id="withdrawalAmount" name="amount" required>--%>

<%--        <button type="submit">Withdraw</button>--%>
<%--    </form>--%>
<%--</div>--%>
<%--</body>--%>
<%--</html>--%>




<%@ page import="beans.UserBean" %>
<%@ page import="dao.DBconn" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f8f9fa;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        .container {
            max-width: 600px;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            text-align: center;
        }

        h2 {
            color: #28a745;
        }

        form {
            margin-top: 20px;
        }

        label {
            display: block;
            margin-bottom: 8px;
            color: #555;
        }

        input {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            box-sizing: border-box;
        }

        button {
            background-color: #4caf50;
            color: #fff;
            padding: 12px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }
        a{
            display: block;
            text-decoration: none;
            color:  #4caf50;
        }

        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

<%
    UserBean user = (UserBean) request.getSession().getAttribute("user");

    if (user != null) {
%>
<div class="container">
    <h2>Welcome back, <%= user.getUsername() %>!</h2>
    <h3>Account Balance: <%= DBconn.checkBalance(user.getUsername()) %></h3>
    <a href="logout" class="logout-link">Logout</a>
</div>
<%
} else {
%>
<div class="container">
    <p>No user information found.</p>
</div>
<%
    }
%>

<div class="container">
    <h2>Deposit Money</h2>
    <form action="deposit" method="post">
        <label for="amount">Enter amount to deposit:</label>
        <input type="number" id="amount" name="amount" required min="0" step="0.01">
        <!-- Add a span for displaying messages -->
        <span id="depositMessage" style="color: green;"></span>

        <button type="submit">Deposit</button>
    </form>
</div>
<div class="container">
    <h2>Withdrawal</h2>
    <form action="withdraw" method="post">
        <label for="withdrawalAmount">Enter amount to withdraw:</label>
        <input type="text" id="withdrawalAmount" name="amount" required>

        <button type="submit">Withdraw</button>
    </form>
</div>
</body>
</html>


