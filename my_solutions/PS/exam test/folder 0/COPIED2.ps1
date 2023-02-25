$directory = $args[0]
$baseFile = $args[1]
$amount = $args[2]
$currDir = $pwd
cd $directory
for($i = 0; $i -lt $amount; $i++) {
mkdir "folder$i"
cd "folder$i"
Copy-Item "$baseFile" 
cd ..
}
cd $currDir