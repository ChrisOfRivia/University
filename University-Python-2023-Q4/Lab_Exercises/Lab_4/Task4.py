from Lab_4.cooking.fridge import Fridge
from Lab_4.cooking.recipe import Recipe

fridge = Fridge()
fridge.add_item('Egg', 2, 1.99)
fridge.add_item('Tomato', 5, 1.99)
receipt = Recipe(['Egg', 2, 'Tomato', 5])
print(receipt.receipt_info())
print(receipt.calc_cost())