from functools import reduce
# arr=[1,2,3,4,5,68,9]
# even=list(filter(lambda n:n%2==0,arr))
# print(even)

# arr=[20,32,45,33,29]
# odd=list(filter(lambda n:n%2!=0,arr))
# print(odd)


arr=[20,32,45,33,29]

sum=reduce(lambda x,y:x+y,arr)
print(sum)

Map=map(lambda x:x+2,arr)
print(arr)




