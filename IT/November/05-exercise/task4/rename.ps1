#!/bin/sh

$filterTerm = $args[0]
$searchTerm = $args[1]
$replaceTerm = $args[2]


Dir $filterTerm | Rename-Item -NewName {$_.name -replace $searchTerm, $replaceTerm}