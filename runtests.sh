#!/bin/sh -l
echo "     [github]\n\
             token = $1" > $HOME/.gitconfig
OUTPUT="$(sbt compile test | grep -w "Tests:" | awk '/failed/ { print $6 }' | sed -r 's/(.*),/\1/')"
echo "failed_tests=$OUTPUT" >> $GITHUB_OUTPUT
