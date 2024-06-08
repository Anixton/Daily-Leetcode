/**
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
var checkSubarraySum = function(nums, k) {
  let n = nums.length, sum = 0
  let map = {0: -1}

  for (let i = 0; i < n; i++) {
    sum += nums[i]
    let remainder = sum % k

    if (map[remainder] != undefined) {
      if ((i - map[remainder]) >= 2) return true
    } else {
      map[remainder] = i
    }
  }
  return false
};