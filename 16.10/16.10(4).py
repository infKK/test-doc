a = int(input())
k = 0
while a != 0:
    if a >= 10 and a<= 99:
        if a%10 == 3:
            k += 1
    a = int(input())
print(k)
