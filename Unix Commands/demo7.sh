i=0
n=10
#while [ $i -lt $n ];
until [ $i -gt $n ];
do
	printf "The value of i is $i\n"
	#(( i++ ))
	i=$(($i+1))	
done 
