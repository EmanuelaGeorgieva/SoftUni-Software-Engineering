function rightPlace(str, char, result){
    let repl = str.replace('_', char);
    let output = repl === result ? "Matched" : "Not Matched";
    console.log(output)
}
rightPlace('Str_ng', 'I', 'Strong');
rightPlace('Str_ng', 'i', 'String');