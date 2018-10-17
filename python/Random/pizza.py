class PizzaOrder(object):
    def __init__(self,name,pizzaNumber):
        self.name = name
        self.pizzaNumber = pizzaNumber
        

class PizzaDelivery():
    def __init__(self):
            pass
        
    def customerOrder(self):
        pizzas = []
        orders = int(input("Enter the amount of Orders that have come in: "))
        for i in range (1,orders+1):
            nameInput = input("What is the name attatched to order #"+str(i)+"?: ")
            howManyPizza = int(input("How many pizzas has "+nameInput+" ordered?: "))
            pizzas.append(PizzaOrder(nameInput,howManyPizza))
        self.pizzaDelivery(pizzas)
        
    def pizzaDelivery(self,pizzaOrders):
        for i in range (0,len(pizzaOrders)):
            while(pizzaOrders[i].pizzaNumber != 0):
                print(pizzaOrders[i].name+" has recieved pizza #"+str(pizzaOrders[i].pizzaNumber)+"!")
                pizzaOrders[i].pizzaNumber = pizzaOrders[i].pizzaNumber - 1
                if(pizzaOrders[i].pizzaNumber == 0):
                    print("All of "+pizzaOrders[i].name+"'s pizzas have been delivered!")
        
    def API(self):
        self.customerOrder()

def main():
    p = PizzaDelivery()
    p.API()
if __name__ == '__main__':
    main()