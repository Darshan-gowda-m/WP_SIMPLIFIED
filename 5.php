<?php
$conn = new mysqli('localhost', 'root', 'Darshan@3108', 'dum');
if ($conn->connect_error) die("Connection failed");
$res = $conn->query("SELECT * FROM user");
echo "<table border=1>";
if ($res->num_rows) {
  echo "<tr>";
  foreach ($res->fetch_fields() as $f) echo "<th>{$f->name}</th>";
  echo "</tr>";
  while ($row = $res->fetch_assoc()) {
    echo "<tr>";
    foreach ($row as $v) echo "<td>$v</td>";
    echo "</tr>";
  }
}
echo "</table>";
$conn->close();
