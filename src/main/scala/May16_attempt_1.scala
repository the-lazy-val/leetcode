class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}

object May16_attempt_1  extends App{

  def oddEvenList(head: ListNode): ListNode = {

    if(head == null) return null

    var odd = head
    var even = head.next
    var temp = even

    var toggle = true

    while(even != null && even.next != null){
      if(toggle){
        odd.next = even.next
        odd = odd.next
      }else{
        even.next = odd.next
        even = even.next
      }
      toggle = !toggle
    }

    odd.next = temp
    head
  }
}
