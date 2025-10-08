class Hello:
    def __init__(self,name,age,marks):
        self.name=name
        self.age=age
        self.marks=marks
        
         
    def panda(self):
        return  self.name 
    def getage(self):
        return self.age
    def getmarks(self):
        return self.marks
    def setmarks(self,newmarks):
        self.marks=newmarks
    def setage(self,newAge):
        self.age=newAge

    
        
a=Hello("NAVEEN KINNERA",20,95)
print("Name is",a.panda())
print("Age :",a.getage())
print("Original marks",a.getmarks())
a.setmarks(99)
print("Changed Marks",a.getmarks())
a.setage(30)
print("New age",a.getage())