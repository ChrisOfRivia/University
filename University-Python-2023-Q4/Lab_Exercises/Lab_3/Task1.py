def file_to_string(file_name=str):
    str = ''
    with open(file_name, 'r') as file:
        for line in file.readlines():
            str += line
        return str if str else 'File is empty!'


try:
    print(file_to_string('hello.txt'))
except FileNotFoundError:
    print(f'Not existing file!')
except OSError:
    print(f'Cannot open file!')
except:
    print(f'Unknown error!')
