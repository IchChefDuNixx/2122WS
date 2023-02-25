#!/bin/sh
echo ""
echo 1
dir test*
echo 2
dir *test*
echo 3
dir test?.*
echo 4
dir t[1x].*
echo 5
dir t[!12].*
echo 6
dir .text*
