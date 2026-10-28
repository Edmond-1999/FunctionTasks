const shortestWord = require('./ShortestWord');


test('test that I have a sentence that has two equally shortest words and it returns the first one', () => {
const sentence = 'The way I dance is different from a different person';
const expected = 'I';
const actual = shortestWord(sentence);

expect(actual).toBe(expected);
});

test('test that I have a sentence with punctuation and it returns only the correct shortest word', () => {
const sentence = '.. Hippopotamus ..';
const expected = 'Hippopotamus';
const actual = shortestWord(sentence);

expect(actual).toBe(expected);
});

