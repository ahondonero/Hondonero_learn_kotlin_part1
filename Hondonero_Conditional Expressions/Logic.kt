fun main() {
  var a = true
  var b = false
  var c = true
  var d = false

  if (a || b) {
    println("Boom!")
  }

  if (!b && c) {
    println("OG!")
  }

  if (a || d) {
    println("Liquid!")
  }

  if (!(!d && b)) {
    println("PSG LGD!")
  }

}