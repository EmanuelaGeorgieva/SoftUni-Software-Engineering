function triangleOfNumbers(n){
    for(i = 1; i <= n; i++){
        let line = '';
        for(j = 1; j <= i; j++){
            line += i + ' ';
        }

        console.log(line.trim());
    }
}

triangleOfNumbers(3)