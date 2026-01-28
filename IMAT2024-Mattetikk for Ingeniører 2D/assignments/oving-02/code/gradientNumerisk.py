import math
def gradientNumerisk(f,p):
    delta=0.001
    gradX=(f(p[0]+delta,p[1],p[2])-f(p[0],p[1],p[2]))/delta 
    gradY=(f(p[0],p[1]+delta,p[2])-f(p[0],p[1],p[2]))/delta
    gradZ=(f(p[0],p[1],p[2]+delta)-f(p[0],p[1],p[2]))/delta
    return (gradX,gradY,gradZ)

def ftest1(x,y,z):
    return x**2+y**2+z**2

def ftest2(x,y,z):
    return x**2*y-z

p1 = [1, 2, 3]
p2 = [1, 1, -1]



result= gradientNumerisk(ftest1,p1)
print(result)