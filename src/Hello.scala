object Hello {
  def main(args: Array[String]): Unit = {
    val x = "Hello "
    var y = "world!"
    y = x+y
    println(x+args(0))
  }
}
