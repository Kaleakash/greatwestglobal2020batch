displayInfo() {
	printf "Welcome to user-defined function $1\n"
}

#displayInfo

empInfo() {
	printf " id is $1, name is $2 and salary is $3\n"
	displayInfo $1
}

empInfo 100 "Ravi" 12000