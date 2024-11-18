function sumOfOddNumbers(n){
    let sum = 0;
    let currentOddNum = 1;
    let count = 0;
    while(count < n){
            console.log(currentOddNum);
            sum += currentOddNum;
            currentOddNum += 2;
            count++;
    }

    console.log(`Sum: ${sum}`);
}

sumOfOddNumbers(5);