$directory = $args[0]
$pwd = $(pwd)

echo $directory

cd $directory

foreach($file in dir) {
$name = (Get-Item $file).Basename
	
"public class $name {

}" >> $file
}

cd $pwd