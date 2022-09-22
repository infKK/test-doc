Python 3.9.6 (tags/v3.9.6:db3ff76, Jun 28 2021, 15:26:21) [MSC v.1929 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> a = int(input())
c = 0
while a > 0:
    k = a%10
    if k > c:
        c = k
    a = a //10
print(c)