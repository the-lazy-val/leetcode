object Solution {
  def maxSubarraySumCircular(A: Array[Int]): Int = {
    val length = A.length
    var max_sum = A(0)

    (0 to (length-1)).map(i => {
      var max_till_now = 0
      (i to (length-1+i)).map(j => {
        max_till_now = max_till_now + A(j % length)
        if(max_till_now > max_sum)
          max_sum = max_till_now
        if(max_till_now < 0)
          max_till_now = 0
      })
    })
    max_sum
  }
}