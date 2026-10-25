#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "Hello World", str1[12], str2[12];

    for (int i = 0; str[i]; i++) {
        str1[i] = str[i] & 127;
        str2[i] = str[i] ^ 127;
    }
    str1[11] = str2[11] = '\0';

    printf("AND: %s\nXOR: %s\n", str1, str2);
    return 0;
}