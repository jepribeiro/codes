// const array = [10,20,30,40,11];
// array = [1, 2, 3 ,4 ,5]
function soma (array) {
    const min = Math.min(...array);
    console.log('o menor numero do array é: ', min)
    const max = Math.max(...array);
    console.log('o maior numero do array é: ', max)

    var indexMax = array.indexOf(max);
    console.log('o index do maior numero do array é: ', indexMax);

    array.splice(indexMax, 1);
    console.log('O array agora ficou: ', array);

    let tempSum = 0
    for (i = 0; i < array.length; i++) {
        console.log('A soma temporária é: ', tempSum);
        console.log('O valor de i é: ', i);

        tempSum = tempSum + array[i]
    }

    minSum = tempSum
    console.log('minSUM: ', minSum)

    array.push(max)
    console.log('O array agora ficou: ', array);

    var indexMin = array.indexOf(min);
    console.log('o index do menor numero do array é: ', indexMin)

    array.splice(indexMin, 1);
    console.log('O array agora ficou: ', array);

    
    let tempSum2 = 0
    for (i = 0; i < array.length; i++) {
        tempSum2 = tempSum2 + array[i]
    }
    maxSum = tempSum2
    console.log(minSum, maxSum)

    return [minSum, maxSum];

    console.log[minSum, maxSum]
}
soma([5, 10, 22 ,7 ,5])


// comentario 
