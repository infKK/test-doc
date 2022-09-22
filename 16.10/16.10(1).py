a = int(input())
k = 0
while a > 0:
    if a%10 == 1:
        k += 1
    a = a//10
print(k)
