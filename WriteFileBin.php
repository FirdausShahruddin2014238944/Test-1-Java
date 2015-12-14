# Test-1-Java

<html>
<?php
$myfile = fopen("tolong.bin", "w") or die("Unable to open file!");
$txt = "Name: Firdaus Bin Shahruddin". PHP_EOL;
fwrite($myfile, $txt);
$txt = "Matrix No: 2014238944". PHP_EOL;
fwrite($myfile, $txt);
$txt = "Gender: Male". PHP_EOL;
fwrite($myfile, $txt);
$txt = "Age: 27". PHP_EOL;
fwrite($myfile, $txt);
$txt = "Emails: firdasyah@gmail.com". PHP_EOL;
fwrite($myfile, $txt);
$txt = "Mobile Phones: 0164158551". PHP_EOL;
fwrite($myfile, $txt);
echo bin2hex($txt);
fclose($myfile);
?> 
</html>
