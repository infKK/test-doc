a = int(input())
max = a
min = a
while a != 0:
    if a > max:
        max = a
    if a < min:
        min = a
    a = int(input())
print('min=', min, 'max =', max)
