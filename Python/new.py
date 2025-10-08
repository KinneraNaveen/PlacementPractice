# for i in range(11):
#     if i%2==0:
#          print(i)


# for i in range(10):
#     if i == 5:
#         break   # stops the loop
#     if i % 2 == 0:
#         continue  # skips this iteration
#     print(i)


# n=int(input("Enter the number : "))
# sum=0
# for i in range (n):
#     sum+=i
#     print(sum)

# n=int(input("Enter number"))
# prime=True
# if n<2:
#     prime=False
# else:
#     for i in range (2,)
 

# colors = ["red", "green", "blue"]
# for index, color in enumerate(colors):
 
#     print(index, color)

#List comprehensions

# list=[i*i for i in range(1,10)]

# print(list)

# even=[x for x in range(1,20) if x%2==0]
# print(even)
    

# n = int(input("ENTER number"))
# prime = True
# if n <= 1:
#     prime = False
# for i in range(2, int(n**0.5)+1):
#     if n % i == 0:
#         prime = False
#         break
# print("Prime" if prime else "Not Prime")


s=(input("Enter NUmber:  "))
print("REVERSE",s[::-1])
