x = input().split()
n, m, a = int(x[0]), int(x[1]), int(x[2])
if(n % a != 0):
    n = n // a + 1
else:
    n  = n / a
if(m % a != 0):
    m = m // a + 1
else:
    m  = m / a
print("{:.0f}".format(m * n))
