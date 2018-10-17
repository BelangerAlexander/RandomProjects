#Author: Alexander Belanger

#Adriano Cavalcanti: CS 112.002

import random
import time
import sys
import os

class GoldCollected(Exception):
    pass

class BlewUp(Exception):
    pass

class Entity(object):
    def __init__(self,xCoord,yCoord):
        self.who = " "
        self.x = xCoord
        self.y = yCoord
        
    def chooseDirection(self):
        direction = random.randrange(1,9)
        if direction == 1: # UP
            newY = self.y - 1 ; newX = self.x
        elif direction == 2: # DOWN
            newY = self.y + 1 ; newX = self.x
        elif direction == 3: # LEFT
            newX = self.x - 1 ; newY = self.y
        elif direction == 4: # RIGHT
            newX = self.x + 1 ; newY = self.y
        elif direction == 5: # TOPRIGHT
            newY = self.y - 1 ; newX = self.x + 1
        elif direction == 6: # TOPLEFT
            newY = self.y - 1 ; newX = self.x - 1
        elif direction == 7: # BOTTOMLEFT
            newY = self.y + 1 ; newX = self.x - 1
        elif direction == 8: #BOTTOMRIGHT
            newY = self.y + 1 ; newX = self.x + 1
            
        return [newY,newX]

class Robot(Entity):
    def __init__(super,xCoord,yCoord):
        super.who = "R"
        super.x = xCoord
        super.y = yCoord
        
class Bomb(Entity):
    def __init__(self,xCoord,yCoord):
        self.who = "B"
        self.x = xCoord
        self.y = yCoord

class Gold(object):
    def __init__(self,xCoord,yCoord):
        self.who = "G"
        self.x = xCoord
        self.y = yCoord

class Cell(object):
    def __init__(self):
        self.who = " "
    
class World(object):
    def __init__(self):
        self.h , self.v = 4 ,4
        self.land = [[Cell(),Cell(),Cell(),Cell()],
                     [Cell(),Cell(),Cell(),Cell()],
                     [Cell(),Cell(),Cell(),Cell()],
                     [Cell(),Cell(),Cell(),Cell()]]
    
    def printWorld(self):
        n = 0
        for i in range(0,4):
            if n > 0:
                print(end = "|")
            print()
            for j in range(0,4):
                n = 10
                print("|"+self.land[i][j].who,end = '')
        print(end = "|")
        
    def operateWorld(self):
        try:
            xCache = -1
            yCache = -1
            finish = False
            counter = 0
            #Gold Initialization Block
            while(finish == False):
                x = random.randrange(0,4)
                y = random.randrange(0,4)
                if(x != xCache or y != yCache):
                    xCache = x
                    yCache = y
                    self.land[y][x] = Gold(x,y)
                    counter = counter + 1
                if counter == 2:
                    finish = True
            finish = False
            #Bomb Initialization Block
            blx = -1
            bly = -1
            while(finish == False):
                x = random.randrange(0,4)
                y = random.randrange(0,4)
                if(self.land[y][x].who != "G"):
                    self.land[y][x] = Bomb(x,y)
                    blx = x
                    bly = y
                    finish = True
            #Robot Initialization Block
            rlx = -1
            rly = -1
            finish = False
            while(finish == False):
                x = random.randrange(0,4)
                y = random.randrange(0,4)
                if(self.land[y][x].who != "G" and self.land[y][x].who != "B"):
                    self.land[y][x] = Robot(x,y)
                    rlx = x
                    rly = y
                    finish = True
            self.printWorld()
            print("Ready?")
            time.sleep(1)
            os.system('cls')
            self.printWorld()
            print("GO!!")
            time.sleep(0.5)
            #Play Block
            goldExists = True
            while(goldExists):
                finish = False
                #move Robot
                for i in range(2):
                    while(finish == False):
                        n = self.land[rly][rlx].chooseDirection()
                        if (n[0] < 4 and n[0] > -1) and (n[1] < 4 and n[1] > -1):
                            try:
                                if (self.land[n[0]][n[1]].who == " " or self.land[n[0]][n[1]].who == "G"):
                                    self.land[rly][rlx] = Cell()
                                    rlx = n[1]
                                    rly = n[0]
                                    self.land[n[0]][n[1]] = Robot(n[1],n[0])
                                    finish = True
                            except IndexError:
                                pass
                    finish = False
                    os.system('cls')
                    self.printWorld()
                    print()
                    time.sleep(0.5)
                    #Gold Check Block
                    goldCheck = ""
                    for e in range(4):
                        for f in range(4):
                            goldCheck = goldCheck+self.land[e][f].who
                    if "G" not in goldCheck:
                        raise GoldCollected('Yay!')
                #Bomb movement Block
                while(finish == False):
                    b = self.land[bly][blx].chooseDirection()
                    if (b[0] < 4 and b[0] > -1) and (b[1] < 4 and b[1] > -1):
                        try:
                            if (self.land[b[0]][b[1]].who == " "):
                                self.land[bly][blx] = Cell()
                                blx = b[1]
                                bly = b[0]
                                self.land[b[0]][b[1]] = Bomb(b[1],b[0])
                                finish = True
                            elif self.land[b[0]][b[1]].who == "R":
                                self.land[bly][blx] = Cell()
                                blx = b[1]
                                bly = b[0]
                                self.land[b[0]][b[1]] = Bomb(b[1],b[0])
                                print()
                                os.system('cls')
                                self.printWorld()
                                raise BlewUp('Boom')
                        except IndexError:
                            pass
                os.system('cls')
                self.printWorld()
                print()
                time.sleep(0.5)
                finish = False
                
        except GoldCollected:
            print("The robot wins!!\nAll gold was collected! :D\n")
        except BlewUp:
            print("\nThe bomb caught the robot!\nGame Over!! D:\n")
                
def main():
    obj = World()
    obj.operateWorld()
if __name__ == '__main__':
    main()
        
        
        