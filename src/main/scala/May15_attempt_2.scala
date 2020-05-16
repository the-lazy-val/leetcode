object May15_attempt_2 {
  def maxSubarraySumCircular(A: Array[Int]): Int = {
    var current_max = A(0)
    var max_so_far = A(0)

    var current_min = A(0)
    var min_so_far = A(0)

    A.slice(1, A.length).foreach(elem => {
      current_max = Math.max(elem, current_max + elem)
      max_so_far = Math.max(current_max, max_so_far)

      current_min = Math.min(elem, current_min + elem)
      min_so_far = Math.min(current_min, min_so_far)
    })

    if(A.sum == min_so_far)
      max_so_far
    else
      Math.max(max_so_far, A.sum - min_so_far)
  }
}
