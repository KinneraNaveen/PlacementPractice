def prime(n):
    if n<=1:
        return False
    for i in range(2,int(n**0.5)+1):
        if n%i==0:
            return False
    
    return True
        
def prime_range(start,end):
    count=0
    for i in range(start,end+1):
        if prime(i):
            print(i ,end=' ')
            count+=1
    print("\nTotal count is : ", count)
st=int(input("Start from : "))
en=int(input("\nEnter End : "))
prime_range(st,en)