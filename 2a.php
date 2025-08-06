<form method="POST">
  <input name="name" placeholder="ENTER YOUR NAME"><input type="submit" placeholder="greet me">
</form>
<?php
$c = $_POST['name'];
echo "<br>" .  "hello " . htmlspecialchars($c)  . " great to meet u" . "</br>";
?>
