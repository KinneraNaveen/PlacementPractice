class Hello:
    def __init__(self,name,work,money):
        self.name=name
        self.work=work
        self.money=money

    def enter(self):
        print(self.name)
    def lavada(self):
        print(self.work)
    def huk(self):
        print(self.money)
    def setwork(self,newWork):
        self.work=newWork

Don=Hello("Puka","studing",85000)

Don.enter()
Don.lavada()
Don.setwork("Dona Naa Modda")

Don.lavada()

        