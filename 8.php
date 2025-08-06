<?php
$conn = new mysqli('localhost', 'root', 'Darshan@3108', 'dum');
if ($_SERVER["REQUEST_METHOD"] == "POST") {
  $accesion = $_POST['accession'];
  $title = $_POST['title'];
  $authors = $_POST['authors'];
  $edition = $_POST['edition'];
  $publication = $_POST['publication'];
  $conn->query("insert into books (accession, title, authors, edition, publication) values ('$accesion', '$title', '$authors', '$edition', '$publication')");
  echo "Book added!";
}
?>
<form method="post">
  Accession No: <input name="accession"><br>
  Title: <input name="title"><br>
  Authors: <input name="authors"><br>
  Edition: <input name="edition"><br>
  Publication: <input name="publication"><br>
  <input type="submit" value="Add Book">
</form>
