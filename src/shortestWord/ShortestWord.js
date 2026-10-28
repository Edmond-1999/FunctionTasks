function shortestWord(sentence) {
    let words = sentence.match(/[A-Za-z0-9]+/g);


    let shortest = words[0].length;
    let count = 0;

    for (let index = 1; index < words.length; index++) {
        if (words[index].length < shortest) {
            shortest = words[index].length;
            count = index;
        }
    }

    return words[count];
}

module.exports = shortestWord;


