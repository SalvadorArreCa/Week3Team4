class Solution:
    def shortestPalindrome(self, s: str) -> str:
        s = s.lower()  # asignar la cadena en minúsculas
        j = len(s) - 1
        new_character = ""
        same_character = 0

        while same_character != (len(s) // 2):
            i = 0
            j = len(s) - 1
            same_character = 0

            for i in range(len(s) // 2):
                if s[i] == s[i + j]:
                    j -= 2
                    same_character += 1
                else:
                    new_character = s[i + j]
                    for c in new_character:
                        s = s[:same_character] + c + s[same_character:]
                        same_character += 1
                    break
        return s