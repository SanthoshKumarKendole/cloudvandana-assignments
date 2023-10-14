function reverse(str){
    var x=str.split(' ');
    var y=x.map(function(z)
    {
        return z.split('').reverse().join('');
    });
    return y.join(' ');
}
var s="This is a sunny day"
console.log(reverse(s))

