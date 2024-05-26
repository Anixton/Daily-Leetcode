/**
 * @param {number} n
 * @return {number}
 */
var checkRecord = function(n) {
    const MOD = 1000000007;
    
    let dp = Array.from({ length: n + 1 }, () => 
        Array.from({ length: 2 }, () => 
            Array(3).fill(0)
        )
    );
    
    dp[0][0][0] = 1;
    
    for (let i = 1; i <= n; i++) {
        for (let j = 0; j < 2; j++) {
            for (let k = 0; k < 3; k++) {
                // Adding 'P'
                dp[i][j][0] = (dp[i][j][0] + dp[i-1][j][k]) % MOD;
                
                // Adding 'A'
                if (j + 1 < 2) {
                    dp[i][j+1][0] = (dp[i][j+1][0] + dp[i-1][j][k]) % MOD;
                }
                
                // Adding 'L'
                if (k + 1 < 3) {
                    dp[i][j][k+1] = (dp[i][j][k+1] + dp[i-1][j][k]) % MOD;
                }
            }
        }
    }
    
    let result = 0;
    for (let j = 0; j < 2; j++) {
        for (let k = 0; k < 3; k++) {
            result = (result + dp[n][j][k]) % MOD;
        }
    }
    
    return result;
};