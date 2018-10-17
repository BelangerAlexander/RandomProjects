#AUTHOR: ALEXANDER BELANGER
# 1:00 Class

class Clone():
    def __init__(self,name,life):
        self.name = name
        self.life = life

    def age():
        timecounter = timeCounter - 1

def createClone(): # I combined input and create clone here
    
    totalNumber = int(input("Please specify the number of clones to create: "))
    clones = []
    
    for i in range (1,totalNumber+1):
        name = input("Please enter clone trooper"+str(i)+"'s name:" )
        lifespan = int(input("Please enter "+name+"'s lifespan."))
        clones.append(Clone(name,lifespan))
                     
    return clones
    
def lifeSpan():
    listOfClones = createClone()
    
    
def main():
    lifeSpan()
    
if __name__ == '__main__':
    main()