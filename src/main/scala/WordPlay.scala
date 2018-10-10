object WordPlay {

  def compress(chars: String): String = {
    chars.foldLeft("")((sofar, nextChar) =>
      if (sofar.isEmpty || sofar.charAt(sofar.length-1) != nextChar)
        sofar + nextChar
      else
        sofar)

  }
  def compressWhile(chars: String):String = {
       var sofar = chars.charAt(chars.length)
       var nextChar = chars.charAt(chars.length - 1)
       while(sofar.equals("")  || sofar != nextChar){
         println(sofar)
        sofar + nextChar
          }
    sofar

  }
  /*def anagrams(words: List[String]): Set[Set[String]] = {
      .values
      .map(_.toSet).toSet
  }*/
  def isPalindromeOneLiner(word: String): Boolean = {
    word == word.reverse
  }
  def isPalindrome(word: String): Boolean = {
    if (word.nonEmpty) {
      val first = word.head
      val last = word.charAt(word.length - 1)

      if (first != last)
          false
      else {
        if(word.length == 1)
            true
        else {
          val newWord = word.substring(1, word.length - 1)
          isPalindrome(newWord)
        }
      }
    }
    else
      true
  }

  def findPalindrome(list: List[String]): List[String] = {
    list.filter(isPalindrome)
  }
}



