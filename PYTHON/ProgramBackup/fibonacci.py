## for loop / while
# method 1
lis =[]
a=0
b=1
while b < 7000:
    lis.append(b)
    a, b = b, a+b
print("method1:"+str(lis))

# method 2
lis =[]
for i in range(20):
    if i ==0 or i ==1:
        lis.append(1)
    else:
        lis.append(lis[i-2]+lis[i-1])
print("method2:"+str(lis))

# method3
def fib(n):
	if n<=1:
		return n
	return fib(n-1)+fib(n-2)

lis=[]
for i in range(1,21):
	lis.append(fib(i))
print("method3:"+str(lis))

## list comprehension
# method 1
def fib(n):
	if n<=1:
		return n
	return fib(n-1)+fib(n-2)

list=[fib(x) for x in range(1,21)]
print("method1:"+str(lis))

# method 2
print("method2:"+str([1 if i ==0 or i ==1 else lis[i-2]+lis[i-1] for i in range(20)]))

## gengerator
# method 1
def fib_generator(max_num):
    x1, x2 = 0, 1
    while max_num>0:
    	x1, x2 = x2, x1+x2
    	# print(str(x1)+" "+str(x2)+"-")
    	max_num -= 1
    	yield x1

list_fib=[]
for i in fib_generator(20):
	list_fib.append(i)
print("method1:"+str(list_fib))

# method 2
def fib_gen(ite):
	for i in ite:
		if i==0 or i==1:
			yield 1
		else:
			yield lis[i-2]+lis[i-1]

lis =[]
for i in fib_gen(range(20)):
    lis.append(i)
print("method2:"+str(lis))