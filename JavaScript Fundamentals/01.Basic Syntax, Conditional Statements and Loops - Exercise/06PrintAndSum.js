function printAndSum(start, end){
    let sum = 0;
    let row = '';
    for(i = start; i <= end; i++){
        sum += i;
        row += i + ' ';
    }

    console.log(row);
    console.log(`Sum: ${sum}`);
}
printAndSum(5, 10);