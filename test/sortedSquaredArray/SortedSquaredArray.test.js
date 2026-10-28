const sortedSquaredArray = require('./SortedSquaredArray');

test('test that I have an array of numbers and it returns the sorted squared array', () => {
    const numbers = [-3, 2, -7, 1, 4];
    const expected = [1, 4, 9, 16, 49];
    const actual = sortedSquaredArray(numbers);

    expect(actual).toEqual(expected);
});