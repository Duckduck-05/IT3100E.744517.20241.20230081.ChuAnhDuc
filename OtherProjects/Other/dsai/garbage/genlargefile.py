import random
import string

def generate_large_text_file(file_name, size_in_mb):
    with open(file_name, 'w') as f:
        for _ in range(size_in_mb * 1024 * 1024):
            f.write(random.choice(string.ascii_letters))

generate_large_text_file('Other/dsai/garbage/test.txt', 2)  # Generates a 20MB text file
