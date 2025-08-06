<?php
$f = "c.txt";
$c = file_get_contents($f);
$c++;
file_put_contents($f, $c);
echo "<br>" . "total visitors count is :" . $c . "</br>";
