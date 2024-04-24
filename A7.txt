<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<style>
    form {
        display: flex;
        flex-direction: column;
    }
</style>

<body>
    <form action="index.php" method="post">
        <label for="name">Name</label>
        <input type="text" name="name">
        <label for="email">Email</label>
        <input type="text" name="email">
        <label for="number">Number</label>
        <input type="text" name="number">
        <button type="submit">Submit</button>
    </form>
</body>

</html>

<?php
// ========================Database Connection==========================
// $hostname = "localhost";
// $username = "root";
// $password = "";
// $database = "pdb";

// $conn = mysqli_connect($hostname, $username, $password, $database);

// if (!$conn) {
//     echo "Not connected";
// } else {
//     echo "Connected";
// }



// $name = $_POST['name'];
// $email = $_POST['email'];
// $number = $_POST['number'];


// if (isset($_POST["name"])) {
//     $query = "INSERT INTO pt1 (name, email, number) VALUES ('" . $name . "', '" . $email . "' , '" . $number . "')";
// }

// if (mysqli_query($conn, $query)) {
//     echo "New record created successfully";
// } else {
//     echo "Error: " . $sql . "<br>" . mysqli_error($conn);
// }

// ========================Cookie==========================

$name = $_POST['name'];
$email = $_POST['email'];
$number = $_POST['number'];

setcookie("name", $name, time() + 3600);
setcookie("email", $email, time() + 3600);
setcookie("number", $number, time() + 3600);

echo $_COOKIE["name"] . " " . $_COOKIE["email"] . " " . $_COOKIE["number"]  . "<br/>";

// set all in one cookiee

setcookie("all", $name . " " . $email . " " . $number, time() + 3600);

echo $_COOKIE["all"]  . "<br/>"; 

// ========================Session==========================
session_start();

$_SESSION['name'] = $name;
$_SESSION['email'] = $email;
$_SESSION['number'] = $number;

echo $_SESSION['name'] . " " . $_SESSION['email'] . " " . $_SESSION['number']  . "<br/>";
?>
