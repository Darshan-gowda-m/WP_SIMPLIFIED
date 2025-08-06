<?php
$conn = new mysqli('localhost', 'root', 'Darshan@3108', 'dum');
if ($conn->connect_error) die("Connection failed: " . $conn->connect_error);

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
  $name = $conn->real_escape_string($_POST['name']);
  $age = (int)$_POST['age'];
  $conn->query("INSERT INTO user (name, age) VALUES ('$name', $age)");
  echo "Record inserted successfully!";
}
?>

<form method="post">
  Name: <input name="name" required>
  Age: <input name="age" type="number" required>
  <input type="submit" value="Add">
</form>
