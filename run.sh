#!/bin/zsh

filepath=$1
filename=$(basename ${filepath})

kotlinc ${filepath} -include-runtime -d ${filename}.jar

java -jar ${filename}.jar

rm ${filename}.jar
