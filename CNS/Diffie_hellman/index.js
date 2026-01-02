function powerMod(base,exp,mod){
     let result = 1;
    for (let i = 0; i < exp; i++) {
        result = (result * base) % mod;
    }
    return result;
}
function exchange() {
    let p = parseInt(document.getElementById("p").value);
    let g = parseInt(document.getElementById("g").value);
    let a = parseInt(document.getElementById("a").value);
    let b = parseInt(document.getElementById("b").value);

    let A = powerMod(g, a, p);
    let B = powerMod(g, b, p);

    let secretAlice = powerMod(B, a, p);
    let secretBob = powerMod(A, b, p);

    document.getElementById("result").innerHTML =
        `Alice Public Key: ${A}<br>
         Bob Public Key: ${B}<br><br>
         Shared Secret (Alice): ${secretAlice}<br>
         Shared Secret (Bob): ${secretBob}`;
}
