def x(matrix,m):
    t=0
    flag=0
    xlist=[matrix[0][0]]
    ylist=[]
    first=matrix[0][0]
    r = len(matrix)
    for i in range(r-1):
        first+=i+2
        xlist.append(first)
        t=i+2
    for j in range(r-1):
        first+=t-i-1
        xlist.append(first)
    for i,k in enumerate(xlist):
        if m<=k:
            flag=k
            for l in range(i+1):
                print(l,'l')
                print(i-l)
                ylist.append(matrix[l][i-l])
            break
    ylist.sort()
    return(ylist[flag-m-1])

if __name__== '__main__':
    matrix = [[1,3],[4,2]]
    m = 2
    print(x(matrix,m))
