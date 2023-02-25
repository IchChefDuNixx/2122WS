#!/bin/ps

$searchTerm = $args[0]
$replaceTerm = $args[1]

cd "C:\Users\Felix\Desktop\auf-zu-win-11\th\2122WS\IT\November\05-exercise\task5\bigFolder"
	$content = Get-Content -Path '.\text0.txt'
		$newContent = $content -replace $args[0], $args[1]
			$newContent | Set-Content -Path '.\text0.txt'
cd ..