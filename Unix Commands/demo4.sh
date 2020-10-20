a=10
b=20
#sum=a+b
#sum1=$(( $a + $b ))
sum2=`expr $a + $b`
#printf "Sum of two number is $sum1\n"
printf "Sum of two number is $sum2\n"
