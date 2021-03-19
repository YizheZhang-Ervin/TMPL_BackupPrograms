class Owner(type):
    def __init__(self,names,bases,dicts):
        pass
    def __new__(cls,name,bases,dicts):
        res=type.__new__(cls,name,bases,dicts)
        res.shape='square'
        return res

class MyIter:
    #迭代
    def __init__(self,start,end):
        self.count=start
        self.end=end
    def __iter__(self):
        return self
    def __next__(self):
        if(self.count<self.end):
            r=self.count
            self.count+=1
            return r
        else:
            raise StopIteration

class MyCompare:
    def __init__(self,x):
        self.x=x
    #比较
    def __lt__(self,oth):
        return self.x<oth.x
    def __gt__(self,oth):
        return self.x>oth.x

class Myoperate:
    def __init__(self,x):
        self.x=x
    #加减
    def __add__(self,oth):
        return self.x+oth.x
    def __sub__(self,oth):
        return self.x-oth.x

class Dice(metaclass=Owner):
    """
    编写一个色子类，要求：
    1.具有6个面，每个面为一种颜色
    2.每种颜色代表一个数值（1-6）
    3.实现一个通过颜色计算两种其代表数值和的静态方法
    4.实现一个类方法（gen_dice）用于产生这个类的实例
    """
    face = {"red":1,"green":2,"yellow":3,"blue":4,"pray":5,"pink":6}
    @staticmethod
    def sum(color1,color2):
        sum  = Dice.face.get(color1)+Dice.face.get(color2)
        return sum
    @classmethod
    def gen_dice(cls):
        return cls()
        
if __name__ == '__main__':
    dice = Dice.gen_dice()
    print(dice.sum("yellow","blue"))
    #元类
    dice2=Dice()
    print(dice.shape)
    #迭代器
    for i in MyIter(1,7):
        print(i)
    #比较器
    a=MyCompare(1)
    b=MyCompare(2)
    print(a>b)
    #运算器
    c=Myoperate(3)
    d=Myoperate(4)
    print(c-d)