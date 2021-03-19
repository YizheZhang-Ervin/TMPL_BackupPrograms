#特殊协议方法类
class specialF:
	#协议方法
	def __init__(self,default=3):
		self.default=default
	def __get__(self,instance,owner):
		return self.default
	def __set__(self,instance,val):
		if 1<val<6:
			self.default=val
		else:
			print("must be 1-6")
	def __delete__(self,instance):
		pass
class Box:
	#描述符类属性
	face=specialF()
	time = 0
	opentime = 0
	closetime = 0
	#初始化
	def __init__(self,length,width,height):
		self.length=length
		self.width=width
		self.height=height
		#调用类属性
		type(self).time+=1
		#私有属性
		self.__volume=self.length*self.width*self.height
		self.__color='gray'
	#属性包装：可读
	@property
	def color(self):
		return self.__color
	#属性包装：可写
	@color.setter
	def color(self,color):
			self.__color=color
	#类实例如函数般调用
	def __call__(self):
		print(self.getVolume())
	#获取私有值函数
	def getVolume (self):
		return self.__volume
	def getColor (self):
	    return self.__color
	#打印值
	def printValue(self):
		print(self.getVolume())
		print(self.getColor())
	#开箱
	def openBox(self):
		type(self).opentime+=1
		if (type(self).opentime ==0) :
			print("open!!!")
		else:
			print("can't open repeatedly")
	#关箱
	def closeBox(self):
		type(self).closetime+=1
		if (type(self).closetime ==0) :
			print("close!!!")
		else:
			print("can't close repeatedly")

#程序开始运行处
if __name__=='__main__' :
	#实例化
	b=Box(1,2,3)
	b.printValue()
	b.openBox()
	b.closeBox()
	b.openBox()
	b.closeBox()
	#属性包装可读
	print(b.color)
	#属性包装可写
	b.color="black"
	print(b.color)
	#描述符类属性
	print(b.face)
	b.face=8
	print(b.face)
	b.face=5
	print(b.face)
	#类实例如函数般调用
	b()