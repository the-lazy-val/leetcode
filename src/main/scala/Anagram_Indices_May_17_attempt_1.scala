object Anagram_Indices_May_17_attempt_1 extends App{

  findAnagrams("abab", "ab")

  def getIdentifier(str: String): String =
    str.map(char => char + str.count(_ == char).toString).distinct.sorted.mkString("")

  def findAnagrams(s: String, p: String): List[Int] = {
    var indices: List[Int] = List.empty

    val pLength = p.length
    val sLength = s.length

    val pIdentifier = getIdentifier(p)
    var start = 0

    println("Primary identifier: " + pIdentifier)

    while((start + pLength - 1) < sLength){
      val subStr = s.substring(start, start+pLength)
      val subIdentifier = getIdentifier(subStr)

      println("========")
      println(s"substr: $subStr")
      println(s"subIdentifier: $subIdentifier")

      if(subIdentifier.equals(pIdentifier)) indices = indices :+ start
      start += 1
    }

    println(indices)
    indices
  }
}
