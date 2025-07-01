def rotate(a):
    temp = a[0]
    for i in range(1,n):
        a[i-1]=a[i]
    a[n-1]=temp

n = int(input())
a=[0]*n
for i in range(0,n):
    a[i] = int(input())
rotate(a)
for i in range(0,n):
    print(a[i],end=" ") 

