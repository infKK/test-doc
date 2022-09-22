Python 3.9.6 (tags/v3.9.6:db3ff76, Jun 28 2021, 15:26:21) [MSC v.1929 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> for i in range(1000, 10000):
    a = i//1000 
    b = i//100%10 
    c = i//10%10 
    d = i%10 
    if a != b and b!= c and c!= d and a!=c and a!= d and b!=d:
        print(i)
