$amount = $args[0]
$path = $pwd

for ($i = 0; $i -lt $amount; $i++) {
	mkdir "folder $i"
	cd "folder $i"
		New-Item -Path "$path\folder $i\file 1.txt"
		New-Item -Path "$path\folder $i\file 2.png"
	cd ..
}