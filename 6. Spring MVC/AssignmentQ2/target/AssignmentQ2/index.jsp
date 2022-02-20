<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Simple Interest Calculator</title>
</head>
<style>
    @import url("https://fonts.googleapis.com/css2?family=Poppins&display=swap");
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        font-family: "Poppins", sans-serif;
    }
    body {
        display: flex;
        height: 100vh;
        justify-content: center;
        align-items: center;
        background: linear-gradient(135deg, #ec3a3a, #f0740e);
    }
    .container {
        max-width: 700px;
        width: 100%;
        background: #fff;
        padding: 25px 30px;
        border-radius: 5px;
    }
    .container .title {
        font-size: 25px;
        font-weight: 500;
    }
    .container .title-end{
        display: flex;
        text-align: center;
        justify-content: center;
    }
    .title-end .name{
        padding-left: 5px;
        font-size: 20px;
        font-weight: 800;
    }
    p{
        color: #ec3a3a;
    }
    .container.title::before {
        content: "";
        position: absolute;
        left: 0;
        bottom: 0;
        height: 3px;
        width: 30px;
        background: linear-gradient(135deg, #ec3a3a, #f0740e);
    }
    .container form .user-details {
        display: flex;
        flex-wrap: wrap;
        justify-content: space-between;
        margin: 20px 0 12px 0;
    }

    form .user-details .input-box {
        margin-bottom: 15px;
        width: calc(100% / 2);
    }
    .user-details .input-box input {
        height: 45px;
        width: 300px;
        outline: none;
        border-radius: 5px;
        border: 1px solid #ccc;
        padding-left: 15px;
        transition: all 0.3s ease;
    }

    form .button{
        height: 45px;
        margin: 45px 0;

    }
    form .button input{
        height: 100%;
        width: 100%;
        outline: none;
        color: #fff;
        border: none;
        font-size: 18px;
        font-weight: 500;
        letter-spacing: 1px;
        border-radius: 5px;
        background: linear-gradient(135deg, #ec3a3a, #f0740e);
    }
    form .button input:hover{
        background: linear-gradient(-135deg, #ec3a3a, #f0740e);
    }
    @media(max-width: 584px){
        .container{
            max-width: 100%;
        }
        form .user-details .input-box{
            margin-bottom: 15px;
            width: 100%;
        }
        .container form .user-details{
            max-height: 300px;
            overflow-y: scroll;
        }
        .user-details::-webkit-scrollbar{
            width: 0;
        }
    }
</style>
<body>
<div class="container">
    <div class="title">
        Simple Interest Calculator
    </div>
    <form method = "post" action="simpleinterest" class="form" name="SI" id="form">
        <div class="user-details">
            <div class="input-box">
                <span class="details">Principal Amount</span>
                <input type="text" placeholder="Enter the principal amount" name="principal" required>
            </div>

            <div class="input-box">
                <span class="details">Rate of Interest</span>
                <input type="text" placeholder="Enter the rate of interest" name="rate"  required>
            </div>

            <div class="input-box">
                <span class="details">Time Period</span>
                <input type="text" placeholder="Enter the time period" name="time" required>
            </div>
        </div>
        <div class="button">
            <input type="submit" value="Calculate Simple Interest">
        </div>
    </form>
    <div class="title-end">
        Made by <div class="name">
        <p>Ayush Agrawal</p>
    </div>
    </div>
</div>
</body>

</html>