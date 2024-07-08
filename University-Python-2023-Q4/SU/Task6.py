from datetime import datetime


def main():
    receipt = {}
    final_price = 0
    now = datetime.now()
    print('Въведете информация за избраните стоки')
    print('Въведете код на стока 00 за край на въвеждането')
    while True:
        code = input('Въведете код на стока: ')
        if code == '00':
            break
        price_item = int(input('Въведете цена на стока: '))
        num_item = int(input('Въведете брой стоки: '))
        final_price_item = float(price_item * num_item)
        final_price += final_price_item
        if code not in receipt.keys():
            receipt[code] = [0, 0]
        receipt[code][0] += num_item
        receipt[code][1] += final_price_item

    if receipt:
        print(f'КАСОВА БЕЛЕЖКА')
        print(f'=================================')
        for key, value in receipt.items():
            print(f'\t {key} ... X {value[0]} ... {value[1]:.2f} лв.')
        print(f'\t ОБЩА СУМА: ..... {final_price:.2f} лв.')
        print(f'\t \t    {now.strftime("%d.%m.%Y %H:%M:%S")}')
        print(f'=================================\n')

        money = float(input('Въведете предоставената сума пари: '))
        if money < final_price:
            print(f'Сумата не е достатъчна!')
            print(f'Не достигат {abs(final_price - money):.2f} лв.')
    else:
        print('Няма закупени продукти!')


if __name__ == "__main__":
    main()
