from Lab_4.cooking.fridge import Fridge


class Recipe(Fridge):
    def __init__(self, args=list):
        self.food = [x for x in args if args.index(x) % 2 == 0]
        self.quantity = [x for x in args if args.index(x) % 2 != 0]

    def calc_cost(self):
        price = 0
        for food, qty in zip(self.food, self.quantity):
            if food in Fridge.items.keys():
                if Fridge.items[food][0] <= qty:
                    Fridge.items[food][0] -= qty

                price += qty * Fridge.items[food][1]
        if price != 0:
            return f'Price: {price}'
        else:
            return f'No available products in Fridge!'

    def receipt_info(self):
        string = ''
        if self.food and self.quantity:
            string += 'Recipe: \n'
            for food, qty in zip(self.food, self.quantity):
                string += f'{food} -> {qty}x\n'

        return string
