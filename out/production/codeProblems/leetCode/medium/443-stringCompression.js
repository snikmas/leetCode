/**
 * @param {character[]} chars
 * @return {number}
 */

var compress = function(chars) {
    let write = 0, read = 0;

    while (read < chars.length) {
        const letter = chars[read];
        let count = 0;

        while (read < chars.length && chars[read] === letter) {
            read++;
            count++;
        }

        // записываем сам символ
        chars[write++] = letter;

        // если повторов больше 1 — записываем цифры
        if (count > 1) {
            // собираем цифры в обратном порядке
            let digits = [];
            while (count > 0) {
                digits.push(count % 10);
                count = Math.floor(count / 10);
            }
            // переворачиваем и записываем
            for (let i = digits.length - 1; i >= 0; i--) {
                chars[write++] = String.fromCharCode(48 + digits[i]); // 48 — код '0'
            }
        }
    }

    return write;
};
// hard