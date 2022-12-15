package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HelloSpec extends AnyFlatSpec with Matchers {

  "The helloOne method" should "print hello one" in {
    // Capture the standard output in a String
    val output = new java.io.ByteArrayOutputStream()
    Console.withOut(output) {
      Hello.helloOne()
    }
    val printedOutput = output.toString

    // Verify that the output contains the expected string
    printedOutput should include("hello one")
  }

  "The helloTwo method" should "print hello two" in {
    val output = new java.io.ByteArrayOutputStream()
    Console.withOut(output) {
      Hello.helloTwo()
    }
    val printedOutput = output.toString

    printedOutput should include("hello two")
  }

  "The helloThree method" should "print hello three" in {
    val output = new java.io.ByteArrayOutputStream()
    Console.withOut(output) {
      Hello.helloThree()
    }
    val printedOutput = output.toString

    printedOutput should include("hello three")
  }

  "The hello object" should "print hello one, hello two, and hello three" in {
    val output = new java.io.ByteArrayOutputStream()
    Console.withOut(output) {
      Hello.main(Array())
    }
    val printedOutput = output.toString

    printedOutput should include("hello one")
    printedOutput should include("hello two")
    printedOutput should include("hello three")
  }
}
