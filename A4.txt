//as6.html

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Registration</title>
    <style>
        h1 {
            text-align: center;
        }

        form {
            margin: auto;
            padding: 40px;
            background-color: blanchedalmond;
            text-align: center;
            width: max-content;
            border-radius: 15px;
                        
        }

        body {
            font-family: Arial, sans-serif;
        }

        input {
            border-radius: 10px;
            border-color: azure;
            width: 200px;
            padding: 10px;
            margin: 10px;
        }
    </style>
</head>
<body>
    <h1>Employee Registration</h1>
    <form method="post" onsubmit="return validateForm()" action="as6save.php">
        Name: <input type="text" id="n1" name="name"><br>
        Email: <input type="email" id="n2" name="email"><br>
        Phone: <input type="tel" id="n3" name="phone"><br>
        Address: <input type="text" id="n4" name="address"><br>
        <input type="submit" value="Submit">
    </form>

    <script>
        function validateForm() {
            var name = document.getElementById("n1").value;
            var email = document.getElementById("n2").value;
            var phone = document.getElementById("n3").value;
            var address = document.getElementById("n4").value;

            if (name === "" || email === "" || phone === "" || address === "") {
                alert("Please fill out all the fields");
                return false;
            }
            return true;
        }
    </script>
</body>
</html>


//as6ret.php

<?php
$servername="localhost";
$username="root";
$password="";
$dbname="database";


$conn=new mysqli($servername,$username,$password,$dbname);
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$sql="SELECT * FROM empl";
$result=$conn->query($sql);

if($result->num_rows>0)
{
   echo "<h1>Employee Database</h1>";
   echo "<table border='1'>
   <tr>
   <th>Name</th>
   <th>Email</th>
   <th>Phone</th>
   <th>Address</th>
   </tr>";

   while($row=$result->fetch_assoc())
   {
       echo "<tr>
       <td>" . $row["name"] ."</td>
       <td>" . $row["email"] ."</td>
       <td>" . $row["phone"] ."</td>
       <td>" . $row["address"] ."</td>
       </tr>";
   }
   echo "</table>";

}
$conn->close();
?>




//as6save.php

<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "database";

$message = ""; // Initialize an empty message variable

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $name = $_POST['name'];
    $email = $_POST['email'];
    $phone = $_POST['phone'];
    $address = $_POST['address'];

        $conn = new mysqli($servername, $username, $password, $dbname);
        if ($conn->connect_error) {
            die("Connection failed: " . $conn->connect_error);
        }

        $sql = "INSERT INTO empl (name, email, phone, address) VALUES ('$name', '$email', '$phone', '$address')";

        if ($conn->query($sql) === TRUE) {
            echo "Record created successfully";
        } else {
            echo  "Error: " . $sql . "<br>" . $conn->error;
        }

        $conn->close();
    } else {
        $message = "Please fill out all the fields";
    }

?>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Successfull Submission</title>
    <style>
        body {
            text-align: center;
            font-family: Arial, sans-serif;
        }
        input{
            height: 70px;
            width: 150px;
            border-radius: 10px;
            border-color: azure;
        }
    </style>
</head>
<body>
    <br>
    <input type="button" value="View Data" onclick="window.location.href='as6ret.php'">
    
</body>
</html>


//database.sql

use database;
CREATE TABLE  IF NOT EXISTS empl(
    id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    phone VARCHAR(15) NOT NULL,
    address TEXT NOT NULL
);