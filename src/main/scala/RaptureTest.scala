/**
 * Created by tyler on 7/10/14.
 */
import rapture.io._
import rapture.core._
import rapture.json._
import strategy.captureExceptions

object RaptureTest {

  def main(args: Array[String]) {
    implicit val enc = Encodings.`UTF-8`

    // implicit val eh = captureExceptions ???
    val raw = """{ "name": "Frank", "age": 23}"""

    val json = Json.parse(raw)
    json match {
      case Right(b) => b.name.as[String]
      case Left(error) => error.getMessage
    }
  }
}