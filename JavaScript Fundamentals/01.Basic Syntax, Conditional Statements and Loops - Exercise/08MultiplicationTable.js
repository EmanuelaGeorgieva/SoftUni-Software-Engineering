function multiplicationTable(n){
    for(i = 1; i <= 10; i++){
        let sum = n * i;
        console.log(`${n} X ${i} = ${sum}`);
    }
}

multiplicationTable(5);