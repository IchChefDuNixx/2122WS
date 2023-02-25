#!/bin/sh

$parameter1 = $args[0]
$parameter2 = $args[1]

$pwd = pwd
for($i = 0; $i -lt $parameter1; $i++) {
	mkdir dir$i
	cd dir$i
	for($j = 0; $j -lt $parameter2; $j++) {
		New-Item cock$j.txt -Value "test script"
	}
	cd ..
}

# .\create.ps1 2 3