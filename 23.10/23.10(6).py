Python 3.9.6 (tags/v3.9.6:db3ff76, Jun 28 2021, 15:26:21) [MSC v.1929 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> for k in range(100, 200, 1):
    a = k%10 
    b = k%100//10 
    c = k//100
    n = a*a + b*b + c*c 
    for i in range(1, 32):
        if n + i == k:
            print(k)
       