#!/bin/bash
echo "Hola mundo desde BASH segundo by rgfDev"
echo intro valor de x
read varX
let varY=5
echo valor de las variables = $varX y $varY
let varZ=$varX*$varY
echo $varZ
#recibo dos parám. desde saludo.sh = $1 = raul y $2 = 20
echo arg1 = $1 y arg2 = $2
echo "_________llamando a JAVA y enviando args___________"
cd /Users/raul/Dropbox/programacion/scriptingJava
java Tercero $2 $varX $1
exit