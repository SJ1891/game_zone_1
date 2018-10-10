import org.scalatest.{Matchers, WordSpec}

class WordPlayTest extends WordSpec with Matchers {
  "isPalindrome" should {
    "return true for palindromic words" in {
      val result = WordPlay.isPalindromeOneLiner("abba")

      result shouldBe true
    }

    "return true for single letter words" in {
      val result = WordPlay.isPalindromeOneLiner("a")

      result shouldBe true
    }
    "return true for words with odd number of letters" in {
      val result = WordPlay.isPalindromeOneLiner("aba")

      result shouldBe true
    }
  }

  "groupAnagram" should {
    "group anagram words together" in {
      val result = WordPlay.anagrams(List("tar", "arc", "state", "car", "rat", "taste", "single", "rac"))

      result shouldBe Set(Set("tar", "rat"), Set("arc", "car", "rac"), Set("state", "taste"), Set("single"))
    }

    "compress" should {
      "remove consecutive duplicates" in {
        WordPlay.compress("Leeeeerrrroyyyy") shouldBe "Leroy"
      }
    }
  }
}
