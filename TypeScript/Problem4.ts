function shortestPalindrome(s: string): string {
    s = s.toLowerCase();  // assign the string in lowercase
    let j = s.length - 1;
    let new_character = "";
    let same_character = 0;

    while (same_character !== Math.floor(s.length / 2)) {
        let i = 0;
        j = s.length - 1;
        same_character = 0;

        for (i = 0; i < Math.floor(s.length / 2); i++) {
            if (s[i] === s[i + j]) {
                j -= 2;
                same_character += 1;
            } else {
                new_character = s[i + j];
                for (const c of new_character) {
                    s = s.slice(0, same_character) + c + s.slice(same_character);
                    same_character += 1;
                }
                break;
            }
        }
    }
    return s;
}

