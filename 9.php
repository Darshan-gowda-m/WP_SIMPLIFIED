<form method="get"><input name="title" placeholder="Enter book title"><input type="submit" value="Search"></form>
<?php
$conn = new mysqli('localhost', 'root', 'Darshan@3108', 'dum');
$t = $_GET['title'] ?? '';
$res = $conn->query("SELECT * FROM books WHERE title LIKE '%$t%'");
if ($t && $res->num_rows) {
  echo "<table border=1><tr><th>Acc No</th><th>Title</th><th>Authors</th><th>Edition</th><th>Publication</th></tr>";
  while ($r = $res->fetch_assoc()) echo "<tr><td>{$r['accession']}</td><td>{$r['title']}</td><td>{$r['authors']}</td><td>{$r['edition']}</td><td>{$r['publication']}</td></tr>";
  echo "</table>";
} else echo "No results found for '$t'";
$conn->close();
?>
