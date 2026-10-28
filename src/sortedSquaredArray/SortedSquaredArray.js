function sortedSquaredArray(array) {
    for (let index = 0; index < array.length; index++) {
        array[index] = array[index] * array[index];
    }

    let count = 0;

    while(count < array.length) {
        for (let index = 0; index < array.length - 1; index++) {
            if (array[index] > array[index + 1]) {
                let temp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = temp;
            }
        }
        count++;
    }
    return array;
}

// let numbers = [-3, 2, -7, 1, 4];
// console.log(sortedSquaredArray(numbers));

module.exports = sortedSquaredArray;