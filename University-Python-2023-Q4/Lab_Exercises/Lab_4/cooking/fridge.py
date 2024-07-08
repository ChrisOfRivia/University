class Fridge:
    items = {}

    def add_item(self, item=str, quantity=int, cost=float):
        if item not in Fridge.items.keys():
            Fridge.items[item] = []
        Fridge.items[item].append(quantity)
        Fridge.items[item].append(cost)

    def remove_item(self, item=str, quantity=int):
        if item not in Fridge.items.keys():
            print(f'Item not in fridge!')
            return ''
        elif Fridge.items[item][0] - quantity < 0:
            print(f'Cannot remove more than the fridge holds!')
            return ''
        Fridge.items[item][0] -= quantity
