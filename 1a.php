<?php
$info = [
  "server_name" => $_SERVER["SERVER_NAME"],
  "SERVEER_SOFTWARE" => $_SERVER["SERVER_SOFTWARE"],
  "PHP_VERSION" => phpversion(),
  "CGI VERSION" => php_sapi_name(),
  "Server protocal" => $_SERVER["SERVER_PROTOCOL"]
];
foreach ($info as $k => $v)
  echo "<br>" . htmlspecialchars($k) . ":" . htmlspecialchars($v) . "</br>";
?>
