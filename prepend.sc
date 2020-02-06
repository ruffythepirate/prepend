import java.io.{BufferedReader, InputStream, InputStreamReader}


@doc("Prepends lines onto whatever comes into the standard in.")
@main
def main(
          text: String @doc("In plain text the text that should be prepended")
        ) = {

  val inputIterator = createInputIterator(System.in)

  System.out.println(text)

  inputIterator
    .takeWhile(_ != null)
    .foreach(System.out.println(_))

}

def createInputIterator(in: InputStream) = {
  val inputStreamReader = new InputStreamReader(in)
  val bufferedReader = new BufferedReader(inputStreamReader)

  val lineIterator = Iterator
    .continually(bufferedReader.readLine)

  if(!lineIterator.hasNext) {
    throw new RuntimeException("Trying to start a input stream listener, but there is no data coming in. Please pipe data to this tool to use it!")
  }
  lineIterator
}


