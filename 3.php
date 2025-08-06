<?php
session_start();
date_default_timezone_set('Asia/Kolkata');
$hour = (int)date('H');
$fullTime = date('h:i:s A');
if ($hour < 12) {
  $greeting = "Good Morning";
} elseif ($hour < 17) {
  $greeting = "Good Afternoon";
} elseif ($hour < 19) {
  $greeting = "Good Evening";
} else {
  $greeting = "Good Night";
}

echo "$greeting, current time is $fullTime<br>";
echo isset($_SESSION['webmaster']) ? "Webmaster is logged in." : "Webmaster is not logged in.";
