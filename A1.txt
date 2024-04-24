//landing.html

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        *{
            background-color: beige;
        }
        nav{
            justify-content: space-around;
            /* align-items: center; */
            display: flex;
        }
        .logo{
            font-size: 30px;
            letter-spacing: 2px ;
            font-family: sans-serif;
            font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
        }
        .menu a{
            text-decoration: none;
            font-size: 18px;
            color: black;
            padding: 10px 20px;
        }
        .register a{
            text-decoration: none;
            font-size: 18px;
            color: black;
            padding: 10px 20px;
            background-color: aquamarine;
            border-radius: 1px;
        }
        .centre-text{
            text-align: center;
            padding-top: 200px;
            letter-spacing: 2px;


        }
        span{
            font-size: 20px;
            font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
            color:rgb(0, 0, 0)
        }
        h1{
            font-size: 50px;
            font-family: 'Times New Roman', Times, serif;
            color:rgb(180, 166, 139)
        }
        .book a{
            text-decoration: none;
            font-size: 18px;
            color: black;
            padding: 10px 20px;
            background-color: aquamarine;
            border-radius: 1px;
            
        }
        .about{
            text-align: center;
            padding: 200px;

        }
        .contact{
            text-align: center;
             padding: 250px; 
        
        }
        .details{
            justify-content: left;
            text-align: center;
           
        }
        h3{
            font-size: 50px;
            font-family: 'Times New Roman', Times, serif;
            color:rgb(180, 166, 139);
            letter-spacing: 1px;
            
        }
        h4{
            font-size: 20px;
            font-family:'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
            color: black;
            letter-spacing: 1px;        }
    </style>
</head>
<body>
    <nav>
        <div class="logo">
            MakemyTrip
        </div>
        <div class="menu">
            <a href="#">Home</a>
            <a href="#about-us">About us</a>
            <a href="#contact-us">Contact Us</a>
        </div>
        <div class="register">
        <a href="reg_page1.html">Register</a>
    </div>
    </nav>
    <section class="centre-text">
        <span>Ready to Travel!</span>
        <h1>Your Best Booking Partner</h1>
        <div class="book">
            <a href="#" >Book Now</a>
        </div>
    </section>

    <section class="about" id="about-us">
        <h3>About Us</h3>
        <span>asdfghjkxcvbnmrtyuiodfgbnmtyui
            dfgvbhnjbdsjhciuhlcihiugiugiu
            In conclusion, the discussion on the topic of AI has provided us with valuable insights into its potential as well as its challenges. It is evident that AI offers significant advantages in terms of efficiency, innovation, and improved experiences across various domains. However, it also raises concerns regarding job displacement, bias, privacy, and security.
        </span>
    </section>

    <section class="contact" id="contact-us">
        <h3>Contact Details</h3>
        <span class="details">Email:makemytrip@gmail.com<br>
        Phone NO:xxxxxxxxxx<br>
        Our Branches: Mumbai , Pune
    </span>
    </section>
    
</body>
</html>



//login_page.html

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page2</title>
    <link rel="stylesheet" href="login.css">
    
</head>
<script>
    function data(){
        var a=document.getElementById("n1").value;
        var b=document.getElementById("n2").value;
        if(a=="admin" && b=="password")
        {
            return true;
        }
        else{
            alert("Invalid username or password");
            return false;
        }

    }
</script>
<body>
    <h1>Login Your account</h1>
    <form onsubmit="return data()" action="landing.html">
    Username:<input type="text" id="n1"><br></br>
    Password:<input type="password" id="n2"><br></br>
    <input class="btn" type="submit" value="Login"><br></br>
</form>
</body>
</html>



//login.css

body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
    margin: 0;
    padding: 0;
}

h1 {
    text-align: center;
    color: #333;
}

form {
    max-width: 400px;
    margin: 20px auto;
    background: #fff;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}
input[type="text"],
input[type="password"] {
    width: 60%;
    padding: 10px;
    margin-bottom: 15px;
    border: 1px solid #ddd;
    border-radius: 4px;
}
input[type="submit"]
{
    background-color:dodgerblue;
    color: #fff;
    border-radius: 5px;
    padding: 10px;
    width: 70px;
}




//reg_page1.httml

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    <link rel="stylesheet" href="register.css">

</head>
<body>
    <script>
        function data() {
            var a = document.getElementById("n1").value;
            var b = document.getElementById("n2").value;
            var c = document.getElementById("n3").value;
            var password = document.getElementById("n4").value;
            var conf_password = document.getElementById("n5").value;

            // Email validation regular expression
            var emailRegex = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;

            if (a === "" || b === "" || c === "" || password === "" || conf_password === "") {
                alert("Please fill all the details");
                return false;
            }
            else if (b.length !== 10) {
                alert("Phone number should be of 10 digits");
                return false;
            }
            else if (!emailRegex.test(c)) {
                alert("Please enter a valid email address");
                return false;
            }
            else if (password !== conf_password) {
                alert("Password Mismatch");
                return false;
            }
            else {
                return true;
            }
        }
    </script>

    <h1>Registration Form</h1>
    <form onsubmit="return data()" action="success.html">
        Name: <input type="text" id="n1"><br><br>
        Phone: <input type="text" id="n2"><br><br>
        Email: <input type="email" id="n3"><br><br>
        Password: <input type="password" id="n4"><br><br>
        Confirm Password: <input type="password" id="n5"><br><br>
        <input type="submit" value="Submit"><br><br>
        <h6>Already have an account? <a href="login_page.html">Login</a></h6>
    </form>
</body>
</html>



//register.css

body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
    margin: 0;
    padding: 0;
}

h1 {
    text-align: center;
    color: #333;
}

form {
    max-width: 400px;
    margin: 20px auto;
    background: #fff;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

input[type="text"],
input[type="email"],
input[type="password"] {
    width: 100%;
    padding: 10px;
    margin-bottom: 15px;
    border: 1px solid #ddd;
    border-radius: 4px;
}

input[type="submit"] {
    width: 100%;
    padding: 10px;
    background-color: #007bff;
    border: none;
    border-radius: 4px;
    color: #fff;
    cursor: pointer;
    transition: background-color 0.3s ease;
}

input[type="submit"]:hover {
    background-color: #0056b3;
}

.error {
    color: red;
    margin-bottom: 10px;
}
